package Arrays.Intro;

import java.util.Arrays;

public class ReferenceValueTypes {
    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println(myIntValue);
        System.out.println(anotherIntValue);

        anotherIntValue++;

        System.out.println(myIntValue);
        System.out.println(anotherIntValue);

        //Reference holds a reference or an address to an object in memory
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;  // 2 references to the same point in memory

        System.out.println("myintArray " + Arrays.toString(myIntArray)); //toString will convert every element in the array to a string

        System.out.println("anotherArray " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("after change myintArray " + Arrays.toString(myIntArray));

        System.out.println("after change anotherArray " + Arrays.toString(anotherArray)); // both change to 1, because of reference


        anotherArray = new int[]{4, 5, 6, 7, 8};
        modifyArray(myIntArray);

        System.out.println("after modify myintArray " + Arrays.toString(myIntArray));

        System.out.println("after modify anotherArray " + Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array) {

        array[0] = 2;
        array = new int[]{1, 2, 3, 4, 5}; //does not work because of the "new" reference

    }
}
