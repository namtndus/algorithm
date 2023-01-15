import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> aCakeOfNumbers = new ArrayList<>();
        ArrayList<Integer> cCakeOfNumbers = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        Arrays.stream(br.readLine().split(" ")).forEach(i -> aCakeOfNumbers.add(Integer.parseInt(i)));
        Arrays.stream(br.readLine().split(" ")).forEach(i -> cCakeOfNumbers.add(Integer.parseInt(i)));

        result.add(cCakeOfNumbers.get(0) - aCakeOfNumbers.get(2));
        result.add(cCakeOfNumbers.get(1) / aCakeOfNumbers.get(1));
        result.add(cCakeOfNumbers.get(2) - aCakeOfNumbers.get(0));

        System.out.println(result.get(0)+ " "+ result.get(1) + " "+ result.get(2));;
    }
}