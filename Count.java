import java.io.*;
import java.util.*;
class CountDigit
{
	public static void main(String args[])
	{
		Scanner digit=new Scanner(System.in);
		int num=digit.nextInt();
		int count=0;
		while(num!=0)
		{
			num= num/10;
			++count;
		}
		System.out.println(count);
	}
}
