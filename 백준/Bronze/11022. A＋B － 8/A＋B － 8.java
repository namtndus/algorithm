import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int originNum = Integer.parseInt(br.readLine());

        for(int i = 1; i <= originNum; i++){
            String[] input = br.readLine().split(" ");
            int firstNum = Integer.parseInt(input[0]);
            int secNum = Integer.parseInt(input[1]);
            System.out.println("Case #"+i+": "+firstNum+" + "+secNum+" = "+ add(firstNum,secNum));
        }
    }

    private static int add(int firstNum, int secNum) {
        return firstNum + secNum;
    }
}