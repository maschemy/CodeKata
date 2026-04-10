package 프로그래머스.level1.자릿수더하기;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String separateNum = String.valueOf(n);
        for(int i = 0 ; i < separateNum.length(); i++){
            answer = answer + separateNum.charAt(i) - '0';
        }
        return answer;
    }
}

// 다른 사람의 풀이
/*
import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        while(n > 10){
            answer+=n%10;
            if(n<10)
                break;

            n=n/10;
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
 */