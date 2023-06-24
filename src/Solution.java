class Solution {
    public int[] separateDigits(int[] nums) {
        StringBuffer stringBuffer = new StringBuffer();

        for(int i = 0; i < nums.length; i++){
            stringBuffer.append(nums[i]);
        }

        int[] answer = new int[stringBuffer.length()];
        for (int i = 0; i < answer.length; i++){
            answer[i] = stringBuffer.charAt(i)-'0';
        }
        return answer;
    }
}