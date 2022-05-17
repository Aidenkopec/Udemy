package Arrays.Intro;

import java.util.Scanner;

public class MinElementChallenge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter array size: ");

        int n = in.nextInt();

        int[] array = new int[n];


        System.out.print("Enter Integers " + n + " to show min value: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }

        int min = getMinValue(array);

        System.out.println("Min Value is " + min);

    }

    public static int getMinValue(int[] array) {
        int minValue = Integer.MAX_VALUE;
        for (int j : array) {
            if (j < minValue) {
                minValue = j;
            }
        }
        return minValue;
    }
}
