package 프로그래머스.level1.정수내림차순으로배치하기;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String s = String.valueOf(n);
        long[] num = new long[s.length()];

        for(int i = 0; i < num.length; i++){
            num[i] = n % 10;
            n = n / 10;
        }

        for(int i = 1; i < num.length; i++){
            for(int j = 0; j < num.length - i; j++){
                if(num[j+1] > num[j]){
                    long swap = num[j];
                    num[j] = num[j + 1];
                    num[j+1] = swap;
                }
            }
        }
        String result = "";
        for(int i = 0; i < num.length; i++){
            result = result + num[i];
        }
        answer = Long.parseLong(result);
        return answer;
    }
}

// 다른 풀이 방법
/*
class Solution {
  public long solution(long n) {
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();
        for (String aList : list) sb.append(aList);

        return Long.parseLong(sb.reverse().toString());
  }
}
 */

