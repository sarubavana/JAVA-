import java.util.Scanner;

  class sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int orderID = fibonacci(n);

        System.out.println(orderID);
    }

    public static int fibonacci(int n) {
        if (n <= 0) {
            return -1; 
        } else if (n <= 2) {
            return 1; 
        }

        int a = 1;
        int b = 1;

        for (int i = 3; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }

        return b;
    }
}

