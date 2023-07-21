import java.util.*;
class ocurence
{
	
 public static void main (String args[])
{
     Scanner sc = new Scanner(System.in)
	 String str = sc.nextLine()
     int index = sent.indexOf(substring);
     if (index == -1) 
	{
        
        return sentence;
    } 
	else if (index == 0) 
	{
        return sent.substring(substring.length()).trim();
    } else 
	{
   
        String a = sentence.substring(0, index);
        String b = sentence.substring(index + substring.length());
        return (a + b).trim();
    }
	    String result = removeFirstOccurrence(sentence, substring);
        System.out.println(result);
}
}

