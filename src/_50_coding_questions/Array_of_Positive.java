package _50_coding_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Array_of_Positive {
    static void main() {
        int[] arr1 = {1,-2,3,-4,5};
        int[] arr2 = {6,-7,-8,9,10};

        System.out.println(Arrays.toString(positiveNumbers(arr1, arr2)));

    }
    static Object[] positiveNumbers(int[] arr1, int[] arr2){
        int[] combinedArray = new int[arr1.length+arr2.length];

        System.arraycopy(arr1, 0, combinedArray, 0, arr1.length);
        System.arraycopy(arr2, 0, combinedArray, arr1.length, arr2.length );

        System.out.println(Arrays.toString(combinedArray));

        ArrayList<Integer> positiveArray = new ArrayList<>();

        for(int num : combinedArray){
            if(num >= 0){
                positiveArray.add(num);

            }
        }

        return positiveArray.toArray();

//        return IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
//                .filter(num -> num >= 0)
//                .toArray();

    }
}
