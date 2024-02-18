public class SumArrayElements {
    public  static void main(String[] args)
    {
        int[] arr={3,8,7};

        System.out.println("Sum of Element's array is :"+sumArray(arr));


    }
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
