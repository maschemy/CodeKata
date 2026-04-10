package 프로그래머스.level1.나머지가1이되는수찾기;

public class Solution {
    public int solution(int n) {
        for(int i = 1; i < n ; i++){
            if(n % i == 1){
                return i;
            }
        }
        return n-1;
    }
}

// 다른 사람의 풀이
/*
import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        return IntStream.range(2, n).filter(i -> n % i == 1).findFirst().orElse(0);
    }
}
 */
