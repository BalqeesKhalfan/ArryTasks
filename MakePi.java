public class MakePi {

    public static void  main(String[] args){

        int[] piArray = makePi();
        System.out.println("First 3 digits of pi: {" + piArray[0] + ", " + piArray[1] + ", " + piArray[2] + "}");

    }

    public static int [] makePi(){
        return new int[]{3, 1, 4};

    }
}
