import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class bj11931 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> a = new ArrayList<>();
        String s;
        int m;
        int n = Integer.parseInt(br.readLine());
        for(int i =0; i < n; i ++){
            m = Integer.parseInt(br.readLine());
            a.add(m);
        }
        Collections.sort(a, Collections.reverseOrder());
        for(int b = 0; b < a.size(); b++) {
            s = Integer.toString(a.get(b));
            bw.write(s + '\n');
        }
        bw.flush();
        bw.close();
    }
}
