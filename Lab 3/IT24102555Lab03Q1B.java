import java.util.Scanner;
public class IT24102555Lab03Q1B{
     public static void main(String[] args){

      Scanner sc= new Scanner(System.in);
   
     double PricePerKg;
     System.out.print("Enter the price per Kg of rice:");
     PricePerKg=sc.nextDouble();
   
     double kilograms;
     System.out.print("Enter the number of kg:");
     kilograms=sc.nextDouble();

     double totalCost= PricePerKg* kilograms;
 
     double discount=0.10*totalCost;
      double finalAmount=totalCost-discount;

     System.out.print("The total amount before discount is:" + totalCost);
     System.out.print("The  discount amount is:" + discount);
     System.out.print("The total amount before discount is:" + finalAmount);

     sc.close();
  }
}