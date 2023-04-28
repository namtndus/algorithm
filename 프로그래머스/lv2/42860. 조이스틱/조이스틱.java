class Solution {
    public int solution(String name) {
        int answer = 0;
        int len = name.length();
        int move = len - 1;
        for(int i=0; i<len; i++) {
            answer += Math.min(name.charAt(i)-'A', 'Z'-name.charAt(i)+1);
            int next = i+1;
            while(next<len && name.charAt(next)=='A') {
                next++;
            }
            move = Math.min(move, i+len-next+Math.min(i, len-next));
        }
        answer += move;
        return answer;
    }
}

