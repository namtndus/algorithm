import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int originNum = Integer.parseInt(br.readLine());
        TreeSet<Integer> set = new TreeSet<>();

        for(int i = 1; i <= originNum; i++){
            set.add(Integer.parseInt(br.readLine()));
        }

        for(Integer str : set){
            bw.write(str+"\n");
        }

        bw.flush();
        bw.close();
    }
}