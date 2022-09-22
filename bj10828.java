import java.io.*;
import java.util.Stack;

public class bj10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringTokenizer st;
        Stack<Integer> s = new Stack<>();
        s.clear();
        String str, ar[],b;
        int n, a;
        n = Integer.parseInt(bf.readLine());
        for(int i = 0; i < n; i++){
            str = bf.readLine();
            ar = str.split(" ");
            if(ar[0].equals("pop")){
                if(s.empty()) bw.write("-1"+'\n');
                else {
                    b = String.valueOf(s.peek());
                    bw.write(b+ '\n');
                    s.pop();
                }
            }
            if(ar[0].equals("top")){
                if(s.empty()) bw.write("-1"+'\n');
                else {
                    b = String.valueOf(s.peek());
                    bw.write(b+ '\n');
                }
            }
            if(ar[0].equals("size")){
                b = String.valueOf(s.size());
                bw.write(b+ '\n');
            }
            if(ar[0].equals("empty")){
                if(s.empty()) bw.write("1"+'\n');
                else bw.write("0"+'\n');
            }
            if(ar[0].equals("push")){
                a = Integer.parseInt(ar[1]);
                s.push(a);
            }
        }
        bw.flush();
        bw.close();
    }
}