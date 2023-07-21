import java.util.Scanner;

public class MinimumOperations {

    public static int minOperations(String s, String t) {
        int m = s.length();
        int n = t.length();

        // Initialize a 2D DP array with dimensions (m+1) x (n+1)
        int[][] dp = new int[m + 1][n + 1];

        // Fill the first row and first column with 0 to m and 0 to n, respectively
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j;
        }

        // Calculate the minimum number of operations needed
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1]));
                }
            }
        }

        return dp[m][n];
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
