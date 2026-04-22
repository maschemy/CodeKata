package 프로그래머스.level1.두정수사이의합;

public class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a == b){
            return a;
        }
        else if(a < b){
            for(int i = a; i <= b; i++){
                answer = answer + i;
            }
        }
        else{
            for(int i = b; i <= a; i++)
                answer += i;
        }

        return answer;
    }
}

// 다른 풀이 방법
/*

class Solution {
  public long solution(int a, int b) {
      long answer = 0;
      for (int i = ((a < b) ? a : b); i <= ((a < b) ? b : a); i++)
          answer += i;

      return answer;
  }
}
 */
