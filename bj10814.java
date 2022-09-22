import java.io.*;
import java.util.*;


public class bj10814 {
    static class Coordinate{
        int x;
        String  name;
        Coordinate(int x, String name){
            this.x = x;
            this.name = name;
        }
    }
    static class Com implements Comparator<Coordinate>
    {
        @Override
        public int compare(Coordinate o1, Coordinate o2) {
            if(o1.x != o2.x )
                return o1.x - o2.x;
            else
                return 0;
        }
    }

    public static void  main(String[] args) throws IOException {
        String str, s;
        List<Coordinate> l = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n, a;
        n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            a = Integer.parseInt(st.nextToken());
            s = st.nextToken();
            Coordinate c  = new Coordinate(a, s);
            l.add(c);
        }
        Collections.sort(l, new Com());

        for(int i = 0; i <n; i++){
            bw.write(Integer.toString(l.get(i).x) + " "
                    + l.get(i).name+ "\n");
        }
        bw.flush();
        bw.close();
    }



}
