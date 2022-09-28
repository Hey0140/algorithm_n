import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class bj1260 {
    static ArrayList<Integer> list[];
    static int[] visited;
    static int count;
    static void dfs(int v){
        int a;
        visited[v] = 1;
        for(int i = 0; i < list[v].size(); i++){
            a = list[v].get(i);
            if(visited[a] == 0){
                visited[a] = count++;
                dfs(a);
            }
        }
    }
    static void bfs(int v){

    }
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, m, v, a, b;
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());
        list = new ArrayList[n];
        visited = new int[n];
        for(int i = 0 ; i < m; i++){
            StringTokenizer str = new StringTokenizer(br.readLine());
            a = Integer.parseInt(str.nextToken());
            b = Integer.parseInt(str.nextToken());
            list[a-1].add(b-1);
            list[b-1].add(a-1);
        }
        for(int i = 0; i < n;i++){
            list[i] = new ArrayList<>();
        }
        count = 1;
        dfs(v-1);
        for(int i : visited){
            bw.write(Integer.toString(visited[i]) + '\n');
        }
        for(int i = 0; i < n; i ++){
            visited[i] = 0;
        }
        count = 1;
        //bfs(v-1);
        bw.flush();
        bw.close();
    }
}
