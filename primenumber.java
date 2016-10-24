import java.io.*;
import java.util.*;
class primenumber
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
 int n,count=0;
System.out.println("Enter number:");
n=sc.nextInt();
for(int i=2;i<=n/2;i++)
{
if(n%i==0)
{
count++;
}
}
if(count==0)
{
System.out.println("The given number is a palindrome");
}
else
{
System.out.println("The given number is not a palindrome");
}
}
}
