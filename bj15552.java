import java.io.*;
import java.util.StringTokenizer;

public class bj15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        int m = Integer.parseInt(n.readLine());
        for (int i = 0; i < m; i++) {
            String st = n.readLine();
            StringTokenizer s = new StringTokenizer(st);
            int a = Integer.parseInt(s.nextToken());
            int b = Integer.parseInt(s.nextToken());
            int num = a + b;
            bw.write(num + "\n");
        }
        bw.flush();
        bw.close();
    }
}