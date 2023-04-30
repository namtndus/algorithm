
class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        // num의 각 자리수를 string의 배열로 변경함
        // String 의 indexOf 함수를 사용하여 자리를 리턴한다
        
        String numberOfString = String.valueOf(num);
        System.out.println(numberOfString);
        answer = numberOfString.indexOf(String.valueOf(k));
        
        if(answer == -1){
            return answer;
        }
        return answer +1;
    }
}