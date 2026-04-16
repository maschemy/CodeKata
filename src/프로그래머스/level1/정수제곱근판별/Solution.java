package 프로그래머스.level1.정수제곱근판별;

public class Solution {
    public long solution(long n) {
        long answer = -1;
        long i = 1;
        while((i * i) <= n){
            if(n == (i * i)){
                return (i + 1) * (i + 1);
            }
            i++;
        }
        return answer;
    }
}

// 다른 사람의 풀이
/*
class Solution {
  public long solution(long n) {
      if (Math.pow((int)Math.sqrt(n), 2) == n) {
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
        }

        return -1;
  }
}
 */


/*
class Solution {
  public long solution(long n) {
      if(n==1){
          return 4;
      }
      for(long i=2;i<n;i++){
          if(n/i == i && n%i ==0){
              return (i+1)*(i+1);
          }
      }
      return -1;
  }
}
 */