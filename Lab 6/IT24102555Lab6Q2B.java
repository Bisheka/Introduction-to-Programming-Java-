import java.util.Scanner;
  public class IT24102555Lab6Q2B {
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     int count=1;
     String Output="";
     System.out.println("Please enter 10 numbers:");
    while(count<=10){
     System.out.println("Enter number "+count+" : ");
     int number = input.nextInt();
 Output=Output+number+" ";
     count=count+1;
 }
  System.out.println("The numbers you enterd are ");
  System.out.print(Output);
		

 }
}