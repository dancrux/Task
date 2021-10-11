import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Question1 {
    public static void main(String[] args) {
        int length = 10, prevNumbers = 3;
        calculateSumOfPrev3(10, 3);
    }
//    function used in calculating the sum of last three numbers in the array
     private static void calculateSumOfPrev3(int length, int prevNumbers){
        int[] arrayList = new int[length];
//        assigns the value of the first position in the list as 5
         arrayList[0]= 5;

         for (int i = 1; i < length; i++){
             int position = i-1, count = 0, sum = 0;

//             calculates the value of all elements until the third one
             while (position >= 0 && count < prevNumbers){
                 sum += arrayList[position];
                 position--;
                 count++;

             }
//             assigns the value of the current position in the loop to sum
             arrayList[i] = sum;
         }
         for (int i =1; i < 2; i++){
             System.out.println(Arrays.toString(arrayList));
             System.out.println("Original Array printed in reverse order:");
             reverseList(arrayList);
         }
     }
//method used in reversing the array
     private static void  reverseList(int[] a){
        int size = a.length;
        int [] reverseArray = IntStream.range(0, size).map(i -> a[size-i-1]).toArray();
         System.out.println(Arrays.toString(reverseArray));
     }
}

