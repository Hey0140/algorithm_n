import java.io.*;
import java.util.*;


public class bj11650 {
    static class Coordinate{
        int x;
        int y;
        Coordinate(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    static class Com implements Comparator<Coordinate>
    {
        @Override
        public int compare(Coordinate o1, Coordinate o2) {
            if(o1.x == o2.x )
                return o1.y - o2.y;
            else
                return o1.x - o2.x;
        }
    }

    public static void  main(String[] args) throws IOException {
        String str;
        List<Coordinate> l = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n, a, b;
        n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            Coordinate c  = new Coordinate(a, b);
            l.add(c);
        }
        Collections.sort(l, new Com());

        for(int i = 0; i <n; i++){
            bw.write(Integer.toString(l.get(i).x) + " "
                    + Integer.toString(l.get(i).y)+ "\n");
        }
        bw.flush();
        bw.close();
    }



}
