import java.util.Scanner;
import java.util.Arrays;

public class Start1 {
    public  static  void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter elements of array a separated by space:");
        int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println("Enter elements of array b separated by space:");
        int[] b = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println("Result: " + start1(a, b));
    }

    public  static  int start1(int[] a,int[] b){
        int count=0;
        if(a.length > 0 && a[0]==1){
            count++;
        }
        if(b.length > 0 && b[0]==1){
            count++;
        }
        return count;
    }
}
