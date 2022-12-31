import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int originNum = Integer.parseInt(br.readLine());

        int tmp = (originNum % 10 * 10) + (originNum / 10 + originNum % 10) % 10;
        int count = 1;
        while (tmp != originNum) {
            tmp = (tmp % 10 * 10) + (tmp / 10 + tmp % 10) % 10;
            count++;
        }
        System.out.println(count);
    }
}