import java.util.*;
import java.lang.*;
class prac
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		//String a=sc.nextLine();
		//char c=sc.next().charAt(0);
		int n=sc.nextInt();
		//System.out.println(a);
		//System.out.println(c);
		int temp=n,length=0,temp2=n;
		while(temp!=0)
		{
			length++;
			temp/=10;
		}
		int palsum=0,rem;
		while(n!=0)
		{
			rem=n%10;
			palsum=palsum+(int)Math.pow(rem,length);
			n/=10;
		}
		if(palsum==temp2)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not");
		}

	}
}