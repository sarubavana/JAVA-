import java.util.*;
class pat
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int i,j,space;
  for(i=0;i<=n;i++)
  {
   for(space=0;space<n-i-1;space++)
    {
      System.out.print(" ");
	 }
      for(j=0;j<n-space;j++)
      {
	    System.out.print("*");
      }
System.out.println("\n");
   }
 }
}
 
 
    
    
   
 
  
  
  
  
