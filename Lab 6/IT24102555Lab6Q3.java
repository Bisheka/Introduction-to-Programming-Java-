import java.util.Scanner;

public class IT24102555Lab6Q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        int sumOfSquares = 0;
        
   System.out.println("Enter positive integers (terminate with -99):");

        while {
            System.out.print("Enter a number :");
            int num = input.nextInt();

            
            if (num == -99) {
                break;
            }

            if (num < 0) {
                System.out.println("Please enter a positive integer or -99 to terminate:");
                continue;
            }

            sumOfSquares =  sumOfSquares + num * num;
            count++;
        }

            double rootMeanSquare = Math.sqrt(sumOfSquares / count);
            System.out.println("The Root Mean Square of the entered numbers: " + rootMeanSquare);
       

    }
}
