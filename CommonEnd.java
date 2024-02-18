
/*
*Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.



commonEnd([1, 2, 3], [7, 3]) → true
commonEnd([1, 2, 3], [7, 3, 2]) → false
commonEnd([1, 2, 3], [1, 3]) → true
*  */
import java.util.Scanner;
public class CommonEnd {
    public  static void main(String[] args){
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter length of First Array :");
        int lengthA= scanner.nextInt();
        int []a= new int[lengthA];

        System.out.println("Enter element  of First Array ");

        for(int i=0;i<lengthA;i++){
            a[i]=scanner.nextInt();

        }

        System.out.println("Enter length of Second Array :");
        int lengthB= scanner.nextInt();
        int []b= new int[lengthB];

        System.out.println("Enter element  of Second Array ");

        for(int i=0;i<lengthB;i++){
            a[i]=scanner.nextInt();

        }
        System.out.println("Result: " + commonEnd(a, b));


    }
    public static boolean commonEnd(int[]a,int[]b){
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];

    }
}
