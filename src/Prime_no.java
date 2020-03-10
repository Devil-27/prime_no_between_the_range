import java.util.*;
public class Prime_no 
{
	public static void main(String args[])
	{
		int a,b,count=0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		for( int n=a;n<b;n++)
		{
			int c=0;
			for(int j=1;j<=n;j++)
			{
				if(n%j==0)
				{
					c=c+1;
				}
			}
				if(c==2)
				{
					count++;	
				}
		}
		System.out.print(count);
	}
}