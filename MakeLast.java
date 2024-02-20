
import java.util.Scanner;
import  java.util.Arrays;
public class MakeLast {
    public  static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the array separated by space:");
        String input = scanner.nextLine();
        String[] elements = input.split(" ");
        int[] nums = new int[elements.length];
        for (int i = 0; i < elements.length; i++) {
            nums[i] = Integer.parseInt(elements[i]);
        }

        System.out.println("Result: " + Arrays.toString(makeLast(nums)));

    }
    public static int[] makeLast(int[] nums) {
        int[] result = new int[nums.length * 2];
        result[result.length - 1] = nums[nums.length - 1];
        return result;
    }
}
