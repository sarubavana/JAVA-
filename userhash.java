
import java.util.*;

class userhash{
	
static boolean Scramble(String S1,
						String S2)
{
	
	//  if Strings of non-equal length
	// cant' be scramble strings
	if (S1.length() != S2.length())
	{
		return false;
	}
	
	int n = S1.length();

	// Empty strings are scramble strings
	if (n == 0)
	{
		return true;
	}
	
	// Equal strings are scramble strings
	if (S1.equals(S2))
	{
		return true;
	}
	
	// Converting string to
	// character array
	char[] tempArray1 = S1.toCharArray();
	char[] tempArray2 = S2.toCharArray();
	
	// Checking condition for Anagram
	Arrays.sort(tempArray1);
	Arrays.sort(tempArray2);
	
	String obj_S1 = new String(tempArray1);
	String obj_S2 = new String(tempArray2);
	
	if (!obj_S1.equals(obj_S2))
	{
		return false;
	}
		
	for(int i = 1; i < n; i++)
	{
		
		// Check if S2[0...i] is a scrambled
		// string of S1[0...i] and if S2[i+1...n]
		// is a scrambled string of S1[i+1...n]
		if (Scramble(S1.substring(0, i),
					S2.substring(0, i)) &&
			Scramble(S1.substring(i, n),
					S2.substring(i, n)))
		{
			return true;
		}

		// Check if S2[0...i] is a scrambled
		// string of S1[n-i...n] and S2[i+1...n]
		// is a scramble string of S1[0...n-i-1]
		if (Scramble(S1.substring(n - i, n),
					S2.substring(0, i)) &&
			Scramble(S1.substring(0, n - i),
					S2.substring(i, n)))
		{
			return true;
		}
	}
	
	// If none of the above
	// conditions are satisfied
	return false;
}

// Driver Code
public static void main(String[] args)
{
	String S1 = "saru";
	String S2 = "asru";
	
	if (Scramble(S1, S2))
	{
		System.out.println("Yes");
	}
	else
	{
		System.out.println("No");
	}
}
}

