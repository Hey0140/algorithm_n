import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class bj10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Integer> q = new LinkedList<>();
        String str, s;
        int n, a;
        n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            str = br.readLine();
            String[] st;
            st = str.split(" ");
            if(st[0].equals("pop")){
                if(!q.isEmpty()){
                    s = Integer.toString(q.getFirst());
                    bw.write(s + '\n');
                    q.removeFirst();
                }
                else{
                    bw.write("-1" + '\n');
                }
            }
            if(st[0].equals("front")){
                if(!q.isEmpty()){
                    s = Integer.toString(q.getFirst());
                    bw.write(s + '\n');
                }
                else{
                    bw.write("-1" + '\n');
                }
            }
            if(st[0].equals("back")){
                if(!q.isEmpty()){
                    s = Integer.toString(q.getLast());
                    bw.write(s + '\n');
                }
                else{
                    bw.write("-1" + '\n');
                }
            }
            if(st[0].equals("empty")){
                if(!q.isEmpty()){
                    bw.write("0" + '\n');
                }
                else{
                    bw.write("1" + '\n');
                }
            }
            if(st[0].equals("push")){
                a = Integer.parseInt(st[1]);
                q.addLast(a);
            }
            if(st[0].equals("size")){
                s = Integer.toString(q.size());
                bw.write(s + '\n');
            }
        }
        bw.flush();
        bw.close();

    }
}