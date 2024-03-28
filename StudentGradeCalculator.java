
package studentgradecalculator;
import java.util.Scanner;

public class StudentGradeCalculator 
{
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       int grades;
       float totalnumOfGrades=0;
       System.out.println("Enter the number of Grades: ");
       int numOfGrades=sc.nextInt();
       int[] gradesOfStudent=new int[numOfGrades];
       for(int i=0;i<numOfGrades;i++)
       {
           System.out.println("Enter Grade: "+ (i+1) + ": ");
           grades=sc.nextInt();
           if(grades>0 && grades<=100)
               gradesOfStudent[i]=grades; else {
               System.out.println("Invalid grade! please enter valid grade");
               i--;
           }
       }
       for( int x :gradesOfStudent)
       {
           totalnumOfGrades += x;
       }
       float avg = totalnumOfGrades/numOfGrades;
       System.out.println("The avg grade of "+numOfGrades+" grades is "+avg);
    }
    
}
