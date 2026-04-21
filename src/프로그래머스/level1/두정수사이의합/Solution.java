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

// 다른 사람의 풀이
/*

3
4
5
6
7
8
9
10
class Solution {
  public long solution(int a, int b) {
      long answer = 0;
      for (int i = ((a < b) ? a : b); i <= ((a < b) ? b : a); i++)
          answer += i;

      return answer;
  }
}
 */
