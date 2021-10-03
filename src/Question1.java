import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Question1 {
    public static void main(String[] args) {
        int length = 10, prevNumbers = 3;
        calculateSumOfPrev3(10, 3);
    }
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

//        int previousSum = 0;
//         arrayList[0]= 5;
//
//         for(int i =0; i< length; i++){
//             if (i < prevNumbers){
//                 arrayList[i + 1] = arrayList[i] + previousSum;
//                 previousSum = arrayList[i + 1];
//
//             }else {
//                 arrayList[i] = arrayList[i] + previousSum - arrayList[i + 1- prevNumbers];
//                 previousSum = arrayList[i + 1];
//
//             }
//
//         }
//
//         for (int i = 0; 1< length; i++){
//             System.out.println(arrayList +", ");
//             Collections.reverse(Collections.singletonList(arrayList));
//            System.out.println(Arrays.toString(arrayList));
//         }

//        arrayList.add(0, 5);
//        int sumOf = 0;
//
//        for(int index = 0; index<9; index ++ ){
//            if(index ==1){
//
//                int prev1 = (int) arrayList.get(index- 1);
//                sumOf = prev1 +0;
//               arrayList.add(index, sumOf);
//
//            }else{
//
//                int prev1 = (int) arrayList.get(index);
//                int prev2 = (int) arrayList.get(index - 1);
//                int prev3 = (int) arrayList.get(index - 2);
//                sumOf = prev1 + prev2 + prev3;
//                arrayList.add(index, sumOf);
//            }
//            System.out.println(arrayList);
//            Collections.reverse(arrayList);
//            System.out.println(arrayList);
//        }