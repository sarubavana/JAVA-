import java.util.*;
class seclarg
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int a[]=new int[4];
		int i,j;
		for(i=0;i<4;i++)
		{
			a[i] =sc.nextInt();
		}
		
		for(i=0;i<4;i++)
		{
			int nxtbiggest=-1;
			for(j=i+1;j<4;j++)
			{
				if(a[i]<a[j])
					{
						nxtbiggest=a[j];
						break;
					}
			}
			System.out.println(nxtbiggest);
		}
		
	}
}
				
			
			