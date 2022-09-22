import java.io.*;
import java.util.Arrays;

public class bj1427 {
    public static void main(String[] args) throws IOException{

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] c = s.toCharArray();
        Arrays.sort(c);
        StringBuilder stb = new StringBuilder(new StringBuilder(new String(c)).reverse());
        String st = stb.toString();
        bw.write(st);
        bw.flush();
        bw.close();
    }
}