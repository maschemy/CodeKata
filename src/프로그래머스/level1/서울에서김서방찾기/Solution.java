package 프로그래머스.level1.서울에서김서방찾기;

public class Solution {
    public String solution(String[] seoul) {
        int i = 0;
        while(i < seoul.length){
            if(seoul[i].equals("Kim")){
                return "김서방은 " + i + "에 있다";
            }
            i++;
        }
        return "";
    }
}
