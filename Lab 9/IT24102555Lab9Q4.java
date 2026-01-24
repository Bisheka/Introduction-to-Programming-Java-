import java.util.Scanner;
public class IT24102555Lab9Q4 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String names[] = new String[5];
        double finalMarks[] = new double[5];
        char grades[] = new char[5];

       
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Name of Student " + (i+1) + ": ");
            names[i] = input.next();

            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            int assignmentMark = input.nextInt();

            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            int examPaperMark = input.nextInt();

          
            finalMarks[i] = calcFinalMark(assignmentMark, examPaperMark);

            
            grades[i] = findGrades(finalMarks[i]);

            System.out.println();


        }


        
        System.out.println("Name\tFinal Mark\tGrade");
        for (int i = 0; i < 5; i++) {
            System.out.println(names[i] + "\t" + finalMarks[i] + "\t\t" + grades[i]);
        }
    }

    
    public static double calcFinalMark(int assignmentMark, int examPaperMark) {
        return (0.3 * assignmentMark) + (0.7 * examPaperMark);
    }


    
    public static char findGrades(double finalMark) {
        char grade;
        if (finalMark >= 75) {
            grade = 'A';
        } else if (finalMark >= 60 && finalMark < 75) {
            grade = 'B';
        } else if (finalMark >= 50 && finalMark < 60) {
            grade = 'C';
        } else {
            grade = 'F';
        }
        return grade;
    }
}
