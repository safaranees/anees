import java.io.*;
import java.util.*;
class LeapYear
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int year=s.nextInt();
if(year%4==0)
{
 System.out.println("it is leap year");
}
else
{
 System.out.println("it is not a leap year");
}
}
}
