import java.util.Scanner;
public class IT24102555Lab3Q3{
public static void main(String[] args){

      Scanner sc= new Scanner(System.in);
  
      System.out.print("Enter the current note:");
      int note= sc.nextInt();

       System.out.print("5000 notes -"+note/5000);
       note %=5000;
       System.out.print("1000 notes -"+note/1000);
       note %=1000;
       System.out.print("500 notes -"+note/500);
       note %=500;
       System.out.print("200 notes -"+note/200);
       note %=200;
       System.out.print("100 notes -"+note/100);
       note %=100;
       System.out.print("50 notes -"+note/50);
       note %=50;
       System.out.print("20 notes -"+note/20);
       note %=20;
       System.out.print("10 notes -"+note/10);
       note %=10;
       System.out.print("5 notes -"+note/5);
       note %=5;
       System.out.print("2 notes -"+note/2);
       note %=2;
       System.out.print("1 notes -"+note/1);
       note %=1;
    }
}

