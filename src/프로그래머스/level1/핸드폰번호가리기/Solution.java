package 프로그래머스.level1.핸드폰번호가리기;

class Solution {
    public String solution(String phone_number) {
        int count = 1;
        char[] phone = phone_number.toCharArray();
        for(int i = phone.length-1; i >=0; i--){
            if(count > 4){
                phone[i] = '*';
            }
            count++;
        }
        return new String(phone);
    }
}
