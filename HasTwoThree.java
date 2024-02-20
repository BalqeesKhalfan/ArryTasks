import java.util.Scanner;
import  java.util.Arrays;

public class HasTwoThree {
    public static void  main(String[] args){
        Scanner sr =new Scanner(System.in);
        int[] nums= new int[2];
        System.out.println("Enter two integers separated by space:");
        nums[0] = sr.nextInt();
        nums[1] = sr.nextInt();

        System.out.println("Result: " + (Arrays.asList(Arrays.stream(nums).boxed().toArray(Integer[]::new)).contains(2)
                || Arrays.asList(Arrays.stream(nums).boxed().toArray(Integer[]::new)).contains(3)));
    }
}
