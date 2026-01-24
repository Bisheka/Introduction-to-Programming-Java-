import java.util.Scanner;
public class IT24102555Lab8Q4{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);

int StudentArray[]=new int[8];
int i=0;
while(i<StudentArray.length){
System.out.print("Enter student ID for student"+(i+1)+":");
int num=input.nextInt();

if(num > 0) {
    StudentArray[i] = num;
    i++;
} else {
  System.out.println("Error:Please enter ONLY positive number"); 
}
}
 System.out.print("Enter the Student ID to search for: ");
        int searchID = input.nextInt();


boolean found = false;
        for ( i = 0; i <8; i++) {
            if (StudentArray[i] == searchID) {
                found = true;
                break;
            }
        }

  if (found) {
            System.out.println("Student is Available");
  } else {
            System.out.println("Student is Not Available");
        }
    }
}