import java.util.Scanner;
public class IT24102555Lab8Q1B{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);

 int myArray[] = new int[5];
 
System.out.println("Enter 5 numbers:");

for(int i=0;i<myArray.length;i++){
   System.out.print("Enter number"+(i+1)+":");
   myArray[i]=input.nextInt(); }

System.out.println("Array in reverse order:");

for(int i=myArray.length-1;i>=0;i--){
  System.out.print(myArray[i]+" ");
}
int evenCount = 0;
for (int i = 0; i < myArray.length; i++) {
if (myArray[i] % 2 == 0) {
evenCount++;      
}
   }
 System.out.println();  

int evenArray[] = new int[evenCount];      
int evenIndex = 0;

for (int i = 0; i < myArray.length; i++) {
if (myArray[i] % 2 == 0) {
       evenArray[evenIndex] = myArray[i];
                evenIndex++;
}
        }

   System.out.println("evenArray:");
        for (int i = 0; i < evenArray.length; i++) {
            System.out.print(evenArray[i] + " ");
        }
        System.out.println();
    }
}