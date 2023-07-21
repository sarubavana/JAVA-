import java.util.Scanner;

public class encode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the data:");
        String data = scanner.nextLine();

        System.out.println("Enter the character to count:");
        char coder = scanner.next().charAt(0);

        int count = countCharacter(data, coder);
        System.out.println("Count of the character '" + coder + "' in the data: " + count);

        scanner.close();
    }

    public static int countCharacter(String data, char coder) {
        int count = 0;
        for (char c : data.toCharArray()) {
            if (c == coder) {
                count++;
            }
        }
        return count;
    }
}
