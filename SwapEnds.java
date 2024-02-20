import java.util.Scanner;
import  java.util.Arrays;
public class SwapEnds {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array of integers separated by space:");
        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        System.out.println("Result: " + Arrays.toString(swapEnds(nums)));
    }

    public static int[] swapEnds(int[] nums) {

        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;

        return nums;
    }

}
