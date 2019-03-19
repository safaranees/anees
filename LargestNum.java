import java.io.*;
import java.util.*;
class LargestNum
{
	public static void main(String args[])
	{
		Scanner num=new Scanner(System.in);
		int num1=num.nextInt();
		int num2=num.nextInt();
		int num3=num.nextInt();
		if(num1>num2 && num1>num3)
		{
			System.out.println("num1 is greater");
		}
		else if(num2>num3)
		{
			System.out.println("num2 is greater");
		}
		else
		{
			System.out.println("num3 is greater");
		}
	}
}
