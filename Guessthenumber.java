import java.util.Random;
import java.util.Scanner;
public class Guessthenumber
{
public static void main(String[] args)
{
Scanner scanner=new Scanner(System.in);
Random random=new Random();
int low=1;
int high=100;
int validguess=random.nextInt(high)+1;
int attempts=0;
int guess=0;
System.out.println("Number Game !!!");
System.out.println("guess a number between 1 to 100.");
while(true)
{
System.out.println("Enter the guessed number:");
guess=scanner.nextInt();
attempts++;
if(guess<validguess)
{
System.out.println("Too low! Try again.");
}
else if(guess>validguess)
{
System.out.println("Too high! Try again.");
}
else
{
System.out.println("Congratulations! You guessed the correct number in"+attempts+"attempts.");
}
}
}
