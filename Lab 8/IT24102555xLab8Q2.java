import java.util.Scanner;
public class IT24102555xLab8Q2{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);

int A[]={10,20,30,40,50};
int B[]={34, 67, 12, 89, 12};

System.out.println("A array contents:");

for(int i=0;i<A.length;i++){
System.out.print(A[i]+" ");}

             System.out.println();

System.out.println("B array contents:");

for(int i=0;i<B.length;i++){
System.out.print(B[i]+" ");}
             
              System.out.println();

System.out.println("A array contents(A+B):");

for(int i=0;i<A.length;i++){
System.out.print(A[i]+B[i]+" ");}

               System.out.println();

}
}