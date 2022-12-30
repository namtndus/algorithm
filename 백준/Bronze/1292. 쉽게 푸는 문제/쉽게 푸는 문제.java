import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        System.out.println(easyAnswer(Integer.valueOf(inputs[1])) - easyAnswer(Integer.valueOf(inputs[0]) - 1));
    }

    private static int easyAnswer(Integer valueOf) {
        int sum = 0;
        int count = 0;
        int num = 1;
        while (count < valueOf) {
            for (int i = 0; i < num; i++) {
                if (count == valueOf) {
                    break;
                }
                sum += num;
                count++;
            }
            num++;
        }
        return sum;
    }
}