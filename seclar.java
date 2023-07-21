import java.util.Scanner;

class seclar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int number : arr) {
            if (number < min1) {
                min2 = min1;
                min1 = number;
            } else if (number < min2 && number != min1) {
                min2 = number;
            }
        }
        System.out.println(min1);
        System.out.println(min2);
    }
}
