import java.util.Scanner;


public class SameFirstLast {

    public  static  void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = scanner.nextInt();
        int [] arr= new int[length];

        System.out.println("Enter elements of array :");
        for(int i=0;i<length; i++)
        {
            arr[i]=scanner.nextInt();
        }
        System.out.println("Result: " + sameFirstLast(arr));


    }
    public static boolean sameFirstLast(int[] arr){
        return arr.length >= 1 && arr[0] == arr[arr.length - 1];

    }
}
