import java.util.*;
class linklist
{
	public static void main(String args[])
	{
		LinkedList <String> a1=new LinkedList <String>();
		a1.add("saru");
		a1.add("vijay");
		Iterator <String> i = a1.iterator();
		while(i.hasNext());
		{
			System.out.println(i.next());
		}
	}
}

		