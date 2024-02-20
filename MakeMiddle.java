import java.util.Scanner;
import java.util.Arrays;
public class MakeMiddle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // ask user to enter elements of Array
        System.out.println("Enter the array of integers separated by space:");
        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

       System.out.println("Result is :"+Arrays.toString(makeMiddle(nums)));

    }
    public static int[] makeMiddle(int[] nums) {
        // Calculate the indices of the middle two elements
        int middleIndex = nums.length / 2; //middle index element of even array length
        int fMEIndex = middleIndex - 1;// index of first middle element
        int sMEIndex = middleIndex;//index of the second middle element

        // Create a new array containing the middle two elements
        int[] result = {nums[fMEIndex], nums[sMEIndex]};

        return result;
    }
}
