import java.util.Scanner;

public class numberplate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int districts = scanner.nextInt();
        String lettersRange = scanner.next();
        int digitsRange = scanner.nextInt();

        scanner.close();

       
        int lettersCount = lettersRange.length();
        int digitsCount = digitsRange + 1; // Include 0

        // Step 3: Calculate the total number of possibilities
        int totalPossibilities = districts * (int) Math.pow(lettersCount * digitsCount, 3);

        // Step 4: Exclude the special numbers
        int specialNumbers = digitsCount * 10; // Count of special numbers = digitsCount * 10
        int nonSpecialNumbers = totalPossibilities - specialNumbers;

        // Step 5: Print the result
        System.out.println(specialNumbers);
    }
}
