import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Leetcode912 leetcode912 = new Leetcode912();
        int[] nums = {5, 1, 1, 2, 0, 0, 6, -5, -4, -5, 5};
        int[] ans = leetcode912.sortArray(nums);
        System.out.println(Arrays.toString(ans));
    }
}