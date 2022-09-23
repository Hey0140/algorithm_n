import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
import java.util.StringTokenizer;

public class bj24480 {
    static int[] visited;
    static ArrayList<Integer> list[];
    static int count = 0;
    static void dfs(int r){
        count++;
        int j;
        visited[r] = count;
        Collections.sort(list[r], Collections.reverseOrder());
        for(int m =0; m < list[r].size(); m++){
            j = list[r].get(m);
            if(visited[j]== 0){
                dfs(j);
            }
        }
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
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
        dfs(v-1);
        for(int e = 0; e < n; e++){
            bw.write(Integer.toString(visited[e]) + '\n');
        }
        bw.flush();
        bw.close();
    }
}
