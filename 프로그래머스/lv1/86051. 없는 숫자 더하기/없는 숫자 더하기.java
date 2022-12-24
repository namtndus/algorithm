class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean[] list = new boolean[10];
        
        for(int i = 0; i<numbers.length; i++){
            int tmp = numbers[i];
            list[tmp] = true;
        }
        
        for(int i = 0; i<list.length; i++){
            if(list[i] == false){
                answer += i;
            }
        }
        
        
        return answer;
    }
}