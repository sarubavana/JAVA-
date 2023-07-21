import java.util.*;
{
  class frequency
  {
	  public static void main(String args[])
	  {
		  Scanner sc= new Scanner(System.in);
		  String str=sc.nextLine();
		  String[] str = text.split(" ")
		  
		  
		  
		  import java.util.Arrays;

 
        int[] a = new int[words.length];
        Arrays.fill(a, -1); // Initialize frequencies array with -1

        for (int i = 0; i < words.length; i++) {
            int count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    frequencies[j] = 0; // Set frequency to 0 for duplicates
                }
            }
            if (a[i] != 0) {
                a[i] = count;
            }
        }

        // Print the word frequencies
        for (int i = 0; i < words.length; i++) {
            if (a[i] != 0) {
                System.out.println(words[i] + ": " + a[i]);
            }
        }
    }
}
