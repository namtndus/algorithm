import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        System.out.println(fin(size));
    }

    private static int fin(int size) {
        if(size == 0){
            return 0;
        }
        if(size == 1){
            return 1;
        }
        return fin(size - 1) + fin(size -2);
    }
}