
import java.io.*;
import java.util.*;

public class bj24444 {

    static int[] visited;
    static ArrayList<Integer> list[];
    public static void bfs(int v, int n){
        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        visited[v] = 1;
        int i = 2;
        int a;
        while(!q.isEmpty()){
            a = q.peek();
            q.remove(a);
            Collections.sort(list[a]);
            for(int m =0; m < list[a].size(); m++){
                int j = list[a].get(m);
                if(visited[j] == 0){
                    q.add(j);
                    visited[j] = i;
                    i++;
                }

            }
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str, st[];
        int n, m, v, u1, u2;
        str = br.readLine();
        st = str.split(" ");
        n = Integer.parseInt(st[0]);
        m = Integer.parseInt(st[1]);
        v = Integer.parseInt(st[2]);
        visited = new int[n];
        list = new ArrayList[n];
        for(int i = 0; i < n; i++){
            list[i] = new ArrayList<Integer>();
        }
        for(int i =0; i < m; i++){
            str = br.readLine();
            st = str.split(" ");
            u1 = Integer.parseInt(st[0]);
            u2 = Integer.parseInt(st[1]);
            list[u1 -1].add(u2 -1);
            list[u2 -1].add(u1 -1);
        }
        bfs(v-1, n);
        for(int e = 0; e < n; e ++){
            bw.write(Integer.toString(visited[e]) + '\n');
        }
        bw.flush();
        bw.close();
    }
}