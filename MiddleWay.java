

import java.util.Arrays;
public class MiddleWay {
    public static  void  main(String[] args)
    {

        int[]  a = {4, 9, 3};
        int[] b= {8, 2, 6};
        int[] result = middleWay(a, b);
        System.out.print("Middle elements: ");
        printArray(result);
    }
    public static int[] middleWay(int[] a, int[] b) {
        return new int[] {a[1], b[1]};
    }
    public  static void  printArray(int[] arr){
        System.out.println(Arrays.toString(arr));

    }
}
