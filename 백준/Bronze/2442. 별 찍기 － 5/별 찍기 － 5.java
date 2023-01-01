import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder st = new StringBuilder();
        int size = Integer.parseInt(br.readLine());
        Stack<String> stack = new Stack();
        int row = 2 * size - 1;
        for (int i = 0; i < size; i++) {
            st.append(makeSpace(i));
            st.append(makeStar(i, row));
            stack.push(st.toString());
            st.setLength(0);
        }

        for(int i = 0; i < size; i++){
            System.out.println(stack.pop());
        }
    }

    private static String makeStar(int row, int startSize) {
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < startSize - row * 2; i++) {
            st.append("*");
        }
        return st.toString();
    }

    private static String makeSpace(int spaseSize) {
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < spaseSize; i++) {
            st.append(" ");
        }
        return st.toString();
    }
}