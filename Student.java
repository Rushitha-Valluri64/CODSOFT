import java.util.Scanner;
import java.util.ArrayList;
class Student
{
ArrayList<Integer> marks=new ArrayList<>();
int n;
void total()
{
int total=0;
for(int i=0;i<marks.size();i++)
{
total+=marks.get(i);
}
System.out.println("Total Marks = "+total);
}
void average()
{
    int total=0;
for(int i=0;i<marks.size();i++)
{
total+=marks.get(i);
}
int avg=total/n;
}
void grade(int avg)
{
    System.out.print("Your Grade is:");
if(avg>=90 && avg<=100)
{
System.out.println("A+");
}
else if(avg>=80 && avg<90)
{
System.out.println("A");
}
else if(avg>=70 && avg<80)
{
System.out.println("B");
}
else if(avg>=60 && avg<70)
{
System.out.println("C");
}
else if(avg>=50 && avg<60)
{
System.out.println("D");
}
else
{
System.out.println("F");
}
}
void display()
{
total();
int total=0;
for(int i=0;i<marks.size();i++)
{
total+=marks.get(i);
}
int avg=total/n;
System.out.println("Average Percentage="+avg);
average();
grade(avg);
}
public static void main(String args[])
{
System.out.println("Enter No:of subjects:");
Student obj=new Student();
Scanner sc=new Scanner(System.in);
obj.n=sc.nextInt();
System.out.println("Enter Marks in each subject:");
for(int i=0;i<obj.n;i++)
{
obj.marks.add(sc.nextInt());
}

obj.display();
}
}

