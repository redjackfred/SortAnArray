public class Leetcode912 {
    public int[] sortArray(int[] nums) {
        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;
        for(int num: nums){
            minNum = Math.min(minNum, num);
            maxNum = Math.max(maxNum, num);
        }
        int[] count = new int[maxNum-minNum + 1];
        for(int num: nums){
            count[num - minNum]++;
        }
        int j = 0;
        for(int i = 0; i < count.length; i++){
            while(count[i] != 0 && j < nums.length){
                nums[j++] = i + minNum;
                count[i]--;
            }
        }
        return nums;
    }
}
