import java.util.Scanner;

public class RotateLeftThree {

    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the length of the array:");
        int length = scanner.nextInt();
        int[] nums = new int[length];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            nums[i] = scanner.nextInt();
        }

        int[] rotated = rotateLeftThree(nums);

        System.out.println("Rotated array: " + java.util.Arrays.toString(rotated));
    }

    public  static int[] rotateLeftThree(int[] nums){

        int[] rotatedArray = new int[nums.length];
        for (int i = 0; i < nums.length - 1; i++) {
            rotatedArray[i] = nums[i + 1];
        }
        rotatedArray[nums.length - 1] = nums[0];
        return rotatedArray;

    }
}
