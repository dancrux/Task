import java.util.InputMismatchException;
import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {
         int integerValue = 0;
         double doubleValue = 0.0;
        String stringValue = "";
//        Variables to hold values for int double and strings entered

//        Creates a Scanner object for receiving user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an Integer");

//        Validates User input for the integer
        boolean goodInteger = false;
        while (!goodInteger){
            String integer = scanner.next();
            try{
                integerValue = Integer.parseInt(integer);
                goodInteger = true;
            }catch (NumberFormatException e){
                System.out.println("Enter a valid Integer");

            }
        }

//        Validates User Input For the Double
            System.out.println("Enter a double");
        boolean goodDouble = false;
        while (!goodDouble){
            String integer = scanner.next();
            try{
                doubleValue = Double.parseDouble(integer);
                goodDouble = true;
            }catch (NumberFormatException e){
                System.out.println("Enter a valid Double");

            }
        }
//        Validates user input For the String of Alphabets
        System.out.println("Enter a String of Alphabets");
        boolean goodAlphabetString = false;
        while (!goodAlphabetString){
            String string = scanner.next();

                if (string.matches("^[a-zA-Z]*$")){
                    stringValue = string;
                    goodAlphabetString = true;
                }else
                    System.out.println("Invalid String Format");

        }
        System.out.println("Sum of Input is:");
        System.out.println(calculateInputSum(stringValue, integerValue, doubleValue));
    }

//    function used to calculate user input
    public static int calculateInputSum(String string, int intValue, double doubleValue){
        double sum = 0;
        char [] array = string.toCharArray();
        for (int i=0; i<array.length; i++){
            int ascii = (int)array[i];
//            Checks the value of alphabets for small letters
            if (ascii >= 97 && ascii<=122){
                sum = sum + ascii -96;
                //            Checks the value of alphabets for small letters
            }else if (ascii >= 65 && ascii <=90){
                sum = sum + ascii -64;
            }
        }
        sum = sum+ doubleValue+ intValue;
        return (int) sum;
    }

    }


