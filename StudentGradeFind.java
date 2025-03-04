import java.util.Scanner;
public class StudentGradeFind
{
public static char gradecalculate(double average) 
{
if (average >= 90)
return 'O';
else if (average >= 80)
return 'A';
else if (average >= 70)
return 'B';
else if (average >= 60)
return 'C';
else if (average >= 50)
return 'D';
else if (average >= 35)
return 'E';
else
return 'F';
}

public static void main(String[] args) 
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the number of subjects: ");
int total_subjects = scanner.nextInt();
int marks = new int[total_subjects];
int totalmarks = 0;
for (int i = 0; i < total_subjects; i++) {
System.out.print("Enter the marks for subject " + (i + 1) + ": ");
marks[i] = scanner.nextInt();
totalmarks += marks[i];
}
double average = (double) totalmarks / total_subjects; // Ensuring floating-point division
char grade = gradecalculate(average);
System.out.println("\nTotal Marks: " + totalmarks);
System.out.println("Average of Marks: " + average);
System.out.println("Grade: " + grade);
}

}
