public class Question3 {
    public static void main(String[] args) {
        for (int i = 0; i <1; i++){
//            Formula for assigning random int  min + (int)(Math.random() * (max-min+1))
//            i. 1 <= z <= 6
            System.out.println(1 + (int)(Math.random() * (6 - 1 + 1)));
//            ii. 100 < z <= 1000
            System.out.println(100 + (int)(Math.random() * (1000 - 100 + 1)));
//            iii. 0 <= z < 19
            System.out.println(0 + (int)(Math.random() * (19 - 0 + 1)));
//            iv. -3 < z < 1
            System.out.println(-3 + (int)(Math.random() * (1 - -3 +1)));
//            v. -1 < z < 11
            System.out.println(-1 + (int)(Math.random() * (11 - -1+ 1)));
        }

    }



//        Question 3b

       /*i. for (x=1; x<=10; x++) { } Executes 10 times
ii. for (x=0; x>10; x++) { } Does not execute Because the condition returns false, because initial value of x is less than 10
iii. for (x=10; x>=0; x--) { } Executes 11 times
iv. for (x=-10; x<=10; x++) { } Executes 21 times*/

//       Question 3c
        /*
        How  for loop works
        For loops are used mainly to execute a block of code  automatically until the condition for executing is false
        For loops are divided mainly into three parts;
        1. Initialization Expression: In this Expression, the loop counter is initialized to a start value. E.g i =0;
        2. Test Expression: in this expression, contains the condition for continuing the loop,  if this expression
        evaluates to true then the body of the loop executes else the loop is exited. E.g i <= 10;
        3. Update Expression: this expression holds how to change the loop condition variable by either incrementing or decrementing.
        E.g i++;

        * */

}
