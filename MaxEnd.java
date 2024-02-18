public class MaxEnd {

        public static void main(String[] args) {
            int[] nums = {6, 1, 9};



            int[] changedArray = maxEnd(nums);


            // Output the results
            printArray(changedArray);

        }

        public static int[] maxEnd(int[] nums) {
            int max = Math.max(nums[0], nums[2]); // Get the maximum of the first and last elements

            // Set all elements to the maximum value
            nums[0] = max;
            nums[1] = max;
            nums[2] = max;

            return nums;
        }

        // Helper function to print an array
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

