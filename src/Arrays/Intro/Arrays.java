package Arrays.Intro;

public class Arrays {
    public static void main(String[] args) {
        int[] myIntArray = new int[10];

        double[] myDoubleArray = new double[50];


        for (int i = 0; i <= myIntArray.length; i++) {
            System.out.print(i);
        }

        System.out.println();

    printArray(myDoubleArray);

    }

    public static void printArray(double[] myDoubleArray){
        for (int i = 0; i <= myDoubleArray.length; i++) {
            myDoubleArray[i] = i*0.7;
//            System.out.println("Element value is " + i + " Value is " + myDoubleArray[i]);
            System.out.println("Element value is " + i);
        }
    }
}
