import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalPrice = Integer.parseInt(br.readLine());
        int size = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i = 0; i<size; i++){
            String[] productInfo = br.readLine().split(" ");
            sum += Integer.parseInt(productInfo[0]) * Integer.parseInt(productInfo[1]);
        }
        if(totalPrice == sum){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}