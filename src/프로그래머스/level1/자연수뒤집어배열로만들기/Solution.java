package 프로그래머스.level1.자연수뒤집어배열로만들기;

class Solution {
        public int[] solution(long n) {
            int reversedNum = 0;
            String numed = "" + n;
            int[] answer = new int[numed.length()];
            for(int i = 0; i < numed.length(); i++){
                reversedNum = numed.charAt(i) - '0';
                answer[numed.length() - i - 1] = reversedNum;
            }
            return answer;
        }
    }


// 다른 사람의 풀이
/*
class Solution {
    public int[] solution(long n) {
        String a = "" + n;
        int[] answer = new int[a.length()];
        int cnt=0;

        while(n>0) {
            answer[cnt]=(int)(n%10);
            n/=10;
            System.out.println(n);
            cnt++;
        }
        return answer;
    }
}
*/

/*
import java.util.stream.IntStream;

class Solution {
    public int[] solution(long n) {
        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    }
}
 */