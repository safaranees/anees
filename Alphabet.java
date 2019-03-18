import java.io.*;
import java.util.*;
class Aon
{
	public static void main(String args[])
 {
		Scanner  aon=new Scanner(System.in);
		char aon1=aon.next().charAt(0);
		if((aon1>'a' && aon1<'z') || (aon1>'A' && aon1>'Z'))
		{
			System.out.println("Alphabet");
		}
		else
		{
			System.out.println("It is not a alaphabet");
		}
	}
}
			
