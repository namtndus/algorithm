import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /*
        * 2 => ABC
        * 3 => DEF
        * 4 => GHI
        * 5 => JKL
        * 6 => MNO
        * 7 => PQRS
        * 8 => TUV
        * 9 => WXYZ
        *
        * 에시 UNUCIC = 868242
        * 8의 첫 번째 번호는 T이지만 8의 연속으로 누른 적은 없다.
        * 즉 숫자에 해당하는 문자가 나오면 숫자를 한번만 누른다.
        * 1을 돌리는데 걸리는 시간은 2초이다.
        * 옆 칸으로 이동할 수록 1초 씩 증가한다.
        *
        * 1 = 2
        * 2 = 3
        * 3 = 4
        * 4 = 5
        * 5 = 6
        * 6 = 7
        * 7 = 8
        * 8 = 9
        * 9 = 10
        *
        * 예제 입력 WA를 통해 걸리는 시간을 유추해보자
        * W은 9에 해당하는 문자, A는 1에 해당하는 문자이다.
        * 9는 10초. 1는 2초가 걸린다.
        * 총 걸리는 시간은 12초이다
        * 9 7 9 3 5 3 = 16 12 8 = 36
        * */

        int count = 0;
        String input = br.readLine();
        int i = 0;
        String[] answer = input.split("");
        while (i < answer.length){
            if(answer[i].equals("A") || answer[i].equals("B") || answer[i].equals("C")){
                count +=3;
            }else if(answer[i].equals("D") || answer[i].equals("E") || answer[i].equals("F")){
                count +=4;
            }else if (answer[i].equals("G") || answer[i].equals("H") || answer[i].equals("I")){
                count +=5;
            }else if (answer[i].equals("J") || answer[i].equals("K") || answer[i].equals("L")){
                count +=6;
            }else if (answer[i].equals("M") || answer[i].equals("N") || answer[i].equals("O")){
                count +=7;
            } else if (answer[i].equals("P") || answer[i].equals("Q") || answer[i].equals("R") || answer[i].equals("S")) {
                count +=8;
            } else if (answer[i].equals("T") || answer[i].equals("U") || answer[i].equals("V")) {
                count +=9;
            } else if (answer[i].equals("W") || answer[i].equals("X") || answer[i].equals("Y") || answer[i].equals("Z")) {
                count +=10;
            }else {
                count +=2;
            }
            i++;
        }

        System.out.println(count);
    }
}