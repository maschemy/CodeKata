package 프로그래머스.level0.각도기;

public class Solution {
    public int solution(int angle) {

        if(0 < angle && angle < 90){
            return 1;
        } else if(90 == angle){
            return 2;
        } else if(90 < angle && angle < 180){
            return 3;
        } else{
            return 4;
        }

    }
}
