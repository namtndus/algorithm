class Solution {
    public int solution(int chicken) {
        int couponOfCount = chicken/10;
        int dividOfChicken = couponOfCount + chicken %10;

        while(dividOfChicken >=10){
            couponOfCount += dividOfChicken/10;
            dividOfChicken = dividOfChicken/10 + dividOfChicken%10;
        }
        return couponOfCount;
    }
}