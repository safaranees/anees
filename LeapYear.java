import java.io.*;
import java.util.*;
class LeapYear
{
	public static void main(String args[])
	{
		Scanner  year=new Scanner(System.in);
		int leap=year.nextInt();
	           	if(((leap%4==0) && (leap%100!=0)) || (leap%400==0))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
