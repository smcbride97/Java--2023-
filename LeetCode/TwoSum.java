package LeetCode;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {0, 7, 32, 85, 45, 5, 2};
        System.out.println("Input a target number: ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        for(int x = 0, y = 1; x < nums.length - 1 & y < nums.length; x++, y++) 
            if (nums[x] + nums[y] == target) 
                System.out.println("[" + x + ", " + y + "]");
    }
}
