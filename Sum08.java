import java.io.*;
import java.util.*;
class Sum08
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int sum=0;
		for(int i=0;i<=num;i++)
		{
			sum=sum+i;
		}
	System.out.println(sum);
	}
}
