import java.util.*;
class stringsort
{
	public static void main(String args[]) 
	{
		
		Scanner sc = new Scanner(System.in);
		int i ,j,l;
		String k=sc.nextLine();
		String[] c=k.split(" ");
		int b= c.length;
		String tem =" ";
		for(i=0;i<b;i++)
		{
			for(j=0;j<b;j++)
			{
				if(c[i].length()<c[j].length())
				{
					tem=c[i];
					c[i]=c[j];
					c[j]=tem;
				}
			}
		}
		for(i=0;i<b;i++)
		{
			System.out.print(c[i]+" ");
		}
	}
}
