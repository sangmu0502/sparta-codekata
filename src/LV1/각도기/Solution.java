package LV1.각도기;

public class Solution {

    public int solution(int angle) {
        int answer = 0;
        // if문 안에는 python 처럼 0 < angle < 90 이렇게 안된다. 0 < angle && angle < 90 이렇게 표현해야 한다.
        if (0 < angle && angle < 90) {
            answer = 1;
        } else if (angle == 90) {
            answer = 2;
        } else if (90 < angle && angle < 180) {
            answer = 3;
        } else {
            answer = 4;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println("solution = " + solution.solution(90));
    }

}
