import java.util.*;
class power
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k,d,i,j,d1;
		int count=0;
		for(i=0;i<n;i++)
		{
			d=i*i;
			k=n-d;
			for(j=0;j<k;j++)
			{
				if(Math.pow(j,j)==k)
				{
					System.out.println("D="+i);
					System.out.println("Diff="+k);
					System.out.println("K="+j);
					System.out.println("Yes");
					System.out.println(j+" power "+j);
					count++;
				}
			}
		}
		if(count==0)
		{
			System.out.println("No");
		}
	}
}