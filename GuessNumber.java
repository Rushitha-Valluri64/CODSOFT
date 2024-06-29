/* Number Guessing game*/

import java.util.*;
public class GuessNumber
{
public void Game()
{
 Random rand = new Random();
int number= rand.nextInt(100);
System.out.println("You are allowed to guess the number in 5 attempts only");
System.out.println("Your game begins now!");
System.out.println("Please enter your number in between 1 and 100");
for(int i=1;i<=5;i++)
{
System.out.println("Enter your number:");
Scanner sc=new Scanner(System.in);
int guess=sc.nextInt();
if(guess==number)
{
System.out.println("Congratulations! You have done it");
System.out.println("The Number is "+number);
System.out.println("And your score is "+(100-((i-1)*20))+"%");
break;
}
else if(guess < number)
{
System.out.println("Oops! The number you have guessed is lower");
System.out.println("No:of attempts left : "+(5-i));
}
else
{
System.out.println("Oops! The number you have guessed is higher");
System.out.println("No:of attempts left : "+(5-i));
}
if(i<5)
{
System.out.println("You can try again!");
}
else if(i==5)
{
System.out.println("Sorry ! No:of attempts limit reached");
System.out.println("The number is: "+number);
System.out.println("And your score is 0%");
}
}
}
public static void main(String args[])
{
GuessNumber gn=new GuessNumber();
gn.Game();
}
}