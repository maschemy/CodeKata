package 프로그래머스.level0.평균구하기;

public class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for(int i = 0; i < arr.length; i++){
            answer = answer + arr[i];
        }
        return answer/arr.length;
    }
}
