package 프로그래머스.level1.하샤드수;

public class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int y = x;
        while(y>0){
            sum = sum + (y % 10);
            y = y/10;
        }
        return x % sum == 0;
    }
}

// 다른 사람의 풀이
/*
public class HarshadNumber{
    public boolean isHarshad(int num){
    String [] tmp = String.valueOf(num).split("");
    int sum=0;
        for(String s:tmp) {
            sum+=Integer.parseInt(s);
        }
        if(num%sum==0) {
        return true;
        } else {
        return false;
        }
     }

// 아래는 테스트로 출력해 보기 위한 코드입니다.
public static void  main(String[] args){
    HarshadNumber sn = new HarshadNumber();
    System.out.println(sn.isHarshad(18));
}
}
 */
