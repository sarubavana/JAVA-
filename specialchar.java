import java.util.Scanner;

class specialchar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the input string: ");
        String input = scanner.nextLine();

        int count = countAlphabeticCharacters(input);
        System.out.println("Number of alphabetic characters: " + count);
    }

    public static int countAlphabeticCharacters(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                count++;
            }
        }
        return count;
    }
}
