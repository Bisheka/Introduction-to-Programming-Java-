import java.util.Scanner;
public class IT24102555Lab03Q2{
     public static void main(String[] args){

      Scanner sc= new Scanner(System.in);

     double monthlySalary;
     System.out.print("Enter the monthlySalary:");
     monthlySalary=sc.nextDouble();

     double OtHours;
     System.out.print("Enter the number of OtHours:");
     OtHours=sc.nextDouble();

     double OtHourlyRate;
     System.out.print("Enter the number of  OtHourlyRate:");
     OtHourlyRate=sc.nextDouble();

     double otAmount=OtHours*OtHourlyRate;
     double totalSalary=monthlySalary+otAmount;
   
     System.out.print("The OtAmount is:" + otAmount);
     System.out.print("The totalSalary is:" + totalSalary);
     
     sc.close();
  }
}
     
     