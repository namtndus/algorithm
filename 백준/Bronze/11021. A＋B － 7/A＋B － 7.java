import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.valueOf(br.readLine());
        String[] inputs = new String[size];
        for(int i = 0; i< size; i++){
            inputs[i] = br.readLine();
        }
        for (int i = 1; i <= size; i++) {
            String[] input = inputs[i-1].split(" ");
            System.out.println("Case #" + i + ": " + add(Integer.valueOf(input[0]), Integer.valueOf(input[1])));
        }
    }

    private static String add(Integer parameter1, Integer parameter2) {
        return String.valueOf (parameter1 + parameter2);
    }
}