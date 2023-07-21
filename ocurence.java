import java.util.*;

class occurence {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = removeFirstOccurrence(a, b);
        System.out.println(c);
    }

    public static String removeFirstOccurrence(String a, String b) {
        int index = a.indexOf(b);
        if (index == -1) {
            // substring not found
            return a;
        } else if (index == 0) 
		{
            // substring is at the beginning of the sentence
            return a.substring(b.length()).trim();
        } else {
            // substring is in the middle or at the end of the sentence
            String fp = a.substring(0, index);
            String sp = a.substring(index + b.length());
            return (fp + sp).trim();
        }
    }
}

