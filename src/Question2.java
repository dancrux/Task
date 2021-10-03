import java.util.*;
public class Question2 {

    public static void main(String[] args) {
        validateInput();

    }

    private static void validateInput(){
        int x = 0;
//        initialize scanner util for receiving user input
        Scanner scanner = new Scanner(System.in);
//        prints a line giving the user required instruction
        System.out.println("Enter rows (between 3 and 10 inclusive):");
//        activates the scanner for input and saves the input in rowNumber Variable
        int rowNumber = scanner.nextInt();
//Checks that the user input matches required condition for row number
        while (rowNumber > 10 || rowNumber< 3){
            System.out.println("Enter a valid row number");
            System.out.println("Enter rows (between 3 and 10 inclusive):");
            rowNumber = scanner.nextInt();
        }

        System.out.println("Enter cols (between 5 and 10 inclusive):");
        int columnNumber = scanner.nextInt();
        //Checks that the user input matches required condition for column number
        while (columnNumber > 10 || columnNumber< 5){
            System.out.println("Enter a valid Column number");
            System.out.println("Enter rows (between 5 and 10 inclusive):");
            columnNumber = scanner.nextInt();
        }

//        for loop using the entered figure for row and columns to build an output with same number of rows and columns
        for(int row = 1; row <= rowNumber; row ++){

            for (int col = 1; col < columnNumber; col++ ){
//                multiplies the current number of each row by 100, to calculate the value for each cell
                x = row * 100;
                System.out.print( String.format("%,d",x *col) +" " +"\t");
//                System.out.println();

            }
            if(row <= rowNumber){
                System.out.println(String.format("%,d",x *row) +" ");

            }

        }


    }




}
