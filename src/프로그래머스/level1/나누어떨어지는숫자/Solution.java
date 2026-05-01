package 프로그래머스.level1.나누어떨어지는숫자;

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                count++;
            }
        }

        if(count == 0) return new int[]{-1};

        int arr2[] = new int[count];
        count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                arr2[count] = arr[i];
                count++;
            }
        }

        Arrays.sort(arr2);
        return arr2;
    }
}

// 다른 방법의 풀이
/*
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int result[] = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
        if(result.length == 0) return new int[]{-1};
        Arrays.sort(result);
        return result;
    }
}
 */