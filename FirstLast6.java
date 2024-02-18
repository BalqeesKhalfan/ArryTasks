import java.util.Scanner;

public class FirstLast6 {



   // fuction of chcking if the first or  last element of array is 6  and return boolean
    public static boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the array:");// input of length value of array
        int length = scanner.nextInt();
        int[] arr = new int[length];
       

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Result: " + firstLast6(arr));
    }
}
