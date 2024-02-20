import java.util.Scanner;

public class MaxTriple {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array of integers separated by space:");
        String[] numStrings = scanner.nextLine().split(" ");
        int[] nums = new int[numStrings.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(numStrings[i]);
        }
        System.out.println("Result: " + maxTriple(nums));
    }
    public static int maxTriple(int[] nums) {
        int middleIndex = nums.length / 2;

        // Compare the first, last, and middle elements to find the largest
        int first = nums[0];
        int last = nums[nums.length - 1];
        int middle = nums[middleIndex];
        return Math.max(Math.max(first, last), middle);
    }
}
