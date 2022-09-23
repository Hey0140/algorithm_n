import java.io.*;
import java.util.*;

public class bj24445 {
    static ArrayList<Integer> list [];
    static int[] visited;
    static void bfs(int v){
        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        int a, i;
        visited[v] = 1;
        i = 2;
        while(!q.isEmpty()){
            a = q.peek();
            q.remove(a);
            Collections.sort(list[a], Collections.reverseOrder());
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
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;
        int n,m,v, x,y;
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());
        visited = new int[n];
        list = new ArrayList[n];
        for(int i =0; i< n; i++){
            list[i] = new ArrayList<Integer>();
        }
        for(int i =0; i< m; i++){
            StringTokenizer s = new StringTokenizer(br.readLine());
            x = Integer.parseInt(s.nextToken());
            y = Integer.parseInt(s.nextToken());
            list[x-1].add(y-1);
            list[y-1].add(x-1);
        }
        bfs(v-1);
        for(int e = 0; e < n; e++){
            bw.write(Integer.toString(visited[e]) + '\n');
        }
        bw.flush();
        bw.close();
    }
}
