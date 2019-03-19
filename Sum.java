import java.io.*;
import java.util.*;
class Sum
{
	public static void main(String args[])
	{
		Scanner num=new Scanner(System.in);
		int num1=num.nextInt();
		int sum=0;
		for(int i=0;i<=num1;i++)
		{
			sum=sum+i;
		}
	System.out.println(sum);
	}
}
