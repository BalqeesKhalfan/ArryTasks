public class ReverseArray {
    public static void main(String[] args){
        int[] arr={2,5,7};

        int[] reversed = reverse(arr);
        printArray(reversed);
    }
    public static int[] reverse(int[] arr){
        int[] reversed = new int[3];
        reversed[0] = arr[2];
        reversed[1] = arr[1];
        reversed[2] = arr[0];
        return reversed;
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
