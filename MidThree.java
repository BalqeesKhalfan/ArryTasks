import java.util.Arrays;
import java.util.Scanner;

public class MidThree {
    public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);
        int[] nums;
        System.out.println("Enter the array of integers separated by space (length must be odd):");
        nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
         while (nums.length % 2 ==0){
             System.out.println("Array length must be odd. Please enter again:");
             nums= Arrays.stream(Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray()).toArray();



         }
         System.out.println("Midle Three :"+Arrays.toString(midThree(nums)));
    }

    public static int[] midThree(int[] nums) {
        int middleIndex = nums.length / 2; // found the index of middle element
        int[] result = {nums[middleIndex - 1], nums[middleIndex], nums[middleIndex + 1]};

        return result;
    }
}
