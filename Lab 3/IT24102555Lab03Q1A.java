import java.util.Scanner;
public class IT24102555Lab03Q1A{
     public static void main(String[] args){

    
     Scanner sc= new Scanner(System.in);
     
     double PricePerKg;
     System.out.print("Enter the price per Kg of rice:");
     PricePerKg=sc.nextDouble();
 
     double kilograms;
     System.out.print("Enter the number of kg:");
     kilograms=sc.nextDouble();

     double totalCost= PricePerKg* kilograms;

     System.out.print("The total amount to pay is:" + totalCost);
     sc.close();
  }
}

     