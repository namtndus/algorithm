import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String,Integer> halligalli = new HashMap<>();
        boolean isChecked = false;

        halligalli.put("STRAWBERRY",0);
        halligalli.put("BANANA",0);
        halligalli.put("LIME",0);
        halligalli.put("PLUM",0);

        int size = Integer.parseInt(br.readLine());
        for(int i = 0; i<size; i++){
            String[] input = br.readLine().split(" ");
            halligalli.put(input[0],halligalli.get(input[0]) + Integer.parseInt(input[1]));
        }

        for(int value : halligalli.values()){
            if(value == 5){
                isChecked = true;
            }
        }
        if(isChecked){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}