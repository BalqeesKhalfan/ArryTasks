import java.util.Scanner;

public class SumOfFirstTwoElements {
    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Value of Length Array:");
        int length=scanner.nextInt();
        int[] nums = new int[length];
        int sum =0;
        System.out.println("Enter Element value of Array :");
        for (int i = 0; i < length; i++) {
            nums[i] = scanner.nextInt();

        }
        if (nums.length < 2) {
            sum=nums[0];
        } else if (nums.length == 0) {
            sum=0;
        }
        else {
            sum=nums[0]+nums[1];
        }
        System.out.println("Sum of the first two elements is :  "+sum);





    }
}
