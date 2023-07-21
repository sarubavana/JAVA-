import java.util.*;
class plumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int r=sc.nextInt();
		int[] inc=new int[n];
		int[] out=new int[m];
		int sum=0;
		int i;
		int sum1=0;
		int temp=0;
		for(i=0;i<n;i++)
		{
			inc[i]=sc.nextInt();
		sum=sum+inc[i]-r;
		}
		for(i=0;i<m;i++)
		{
			out[i]=sc.nextInt();
			sum1=sum1+out[i]-r;
		}
		if(sum==sum1)
		{
			System.out.println("BALANCED");
		}
		else
		{
			temp=sum1-sum;
			System.out.println(temp-r);
		}
	}
}