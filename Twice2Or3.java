import java.util.Scanner;
import  java.util.Arrays;
public class Twice2Or3 {

    public  static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two integers separated by space:");
        int[] nums = new int[2];
        nums[0] = scanner.nextInt();
        nums[1] = scanner.nextInt();
        System.out.println("Result: " + twice23(nums));
    }
    public  static  boolean twice23(int[] nums){
        Arrays.sort(nums);

        // Check if the array contains 2 twice or 3 twice
        return nums[0] == 2 && nums[0] == nums[1] || nums[0] == 3 && nums[0] == nums[1];
    }
}
