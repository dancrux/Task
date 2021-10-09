import java.util.InputMismatchException;
import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {


//        Variables to hold values for int double and strings entered
        int integerValue = 0;
        double doubleValue = 0.0;
        String stringValue = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an Integer");
//        integer = scanner.nextInt();
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

    }

    }


