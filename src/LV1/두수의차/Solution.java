package LV1.두수의차;

class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        answer = num1 - num2;

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(5,3));
    }
}
