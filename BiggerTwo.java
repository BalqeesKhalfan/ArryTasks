import java.util.Arrays;
import java.util.Scanner;

public class BiggerTwo {

    public  static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements of array a separated by space:");
        int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println("Enter elements of array b separated by space:");
        int[] b = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        System.out.println("Result: " +Arrays.toString(largestTwo(a,b)));
    }
    public  static  int[] largestTwo(int[] a , int[] b)
    {
        int sumA = Arrays.stream(a).sum();
        int sumB = Arrays.stream(b).sum();
        /*if(sumA> sumB){
            return a;
        }
        else{
            return b;
        }*/
        return (sumA >= sumB) ? a : b;

    }
}
