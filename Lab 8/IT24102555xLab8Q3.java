import java.util.Scanner;
public class IT24102555xLab8Q3{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);
int max;
int myArray[] = new int[6];
int i=0;
while(i<myArray.length){
System.out.print("Enter a positive number ("+(i+1)+"/6):");
int num=input.nextInt();

if(num > 0) {
    myArray[i] = num;
    i++;
} else {
  System.out.println("Error:Please enter a positive number"); 
}
}
System.out.println("Array Contents:");
for (i = 0; i < myArray.length; i++) {
System.out.print(myArray[i]  + " ");
        }
       
        System.out.println();

max = myArray[0] ;
        for (i = 1; i < 6; i++) {
            if (myArray[i]  > max) {
                max = myArray[i] ;
            }
        }

        System.out.println("The Maximum Number Entered: " + max);

}
}
