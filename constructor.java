import java.util.*;
class box
{
	float depth;
	float hei;
	float brea;
	float vol;
	box()
 {
	 Scanner obj=new Scanner(System.in);
	 depth=obj.nextFloat();
	 hei=obj.nextFloat();
	 brea=obj.nextFloat();
	 vol=depth*hei*brea;
	 System.out.println(vol);
 }
}
	class constructor
    {
		 public static void main(String args[])
	  	{
			box mybox= new box();
		}
	 
	}