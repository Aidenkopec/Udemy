package Arrays.Intro;

import java.util.*;
//import java.util.Collections;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args){

        Integer[] arr = {10,20,30,40,50};
        reverse(arr);

    }

    public static void reverse(Integer[] array){
        Collections.reverse(Arrays.asList(array));
        System.out.println(Arrays.asList(array));
    }
}
