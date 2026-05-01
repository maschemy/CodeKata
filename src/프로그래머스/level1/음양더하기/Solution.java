package 프로그래머스.level1.음양더하기;

public class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i = 0; i < absolutes.length; i++){
            if(signs[i] == false){
                answer -= absolutes[i];
            }
            else{
                answer += absolutes[i];
            }
        }

        return answer;
    }
}

//다른 방법의 풀이
/*
class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            answer += (signs[i]) ? absolutes[i] : -absolutes[i];
        }
        return answer;
    }
}
 */
