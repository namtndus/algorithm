import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int originNum = Integer.parseInt(br.readLine());

        for(int i = 1; i <= originNum; i++){
            String[] input = br.readLine().split(" ");
            int firstNum = Integer.parseInt(input[0]);
            int secNum = Integer.parseInt(input[1]);
            bw.write(add(firstNum,secNum)+"\n");
        }
        bw.flush();
        bw.close();
    }

    private static int add(int firstNum, int secNum) {
        return firstNum + secNum;
    }
}