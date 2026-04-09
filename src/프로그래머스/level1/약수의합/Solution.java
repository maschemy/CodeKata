package 프로그래머스.level1.약수의합;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int divideNum = (n / 2);
        for(int i = 1; i <= divideNum; i++){
            if(n % i == 0){
                answer += i;
            }
        }

        return (answer + n);
    }
}
