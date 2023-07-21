import java.util.Scanner;

class geeks {

    public static int minOperations(String s, String t) {
        int m = s.length();
        int n = t.length();
        int operations = 0;

        int i = 0, j = 0;
        while (i < m && j < n) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
                operations++;
                if (m > n) {
                    i++;
                } else if (m < n) {
                    j++;
                } else {
                    i++;
                    j++;
                }
            }
        }

        return operations + Math.abs(m - n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string s: ");
        String s = scanner.next();

        System.out.print("Enter string t: ");
        String t = scanner.next();

        int result = minOperations(s, t);
        System.out.println("Output: " + result);

        scanner.close();
    }
}
