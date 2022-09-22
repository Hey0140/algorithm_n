import java.io.*;
import java.util.Stack;

public class bj9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = "";
        Stack<Character> s = new Stack<>();
        int a = Integer.parseInt(bf.readLine());
        for(int i = 0; i < a ; i++) {
            str = bf.readLine();
            s.clear();
            boolean f = true;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '(') s.push('(');
                else {
                    if(s.empty()) f = false;
                    else{
                        if (s.peek() == '(') s.pop();
                        else {
                            f = false;
                        }
                    }

                }
            }
            if (!s.empty()) f = false;
            if(f) bw.write("YES" +'\n');
            else bw.write("NO" +'\n');
        }
        bw.flush();
        bw.close();
    }

}