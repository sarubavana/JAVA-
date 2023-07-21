import java.util.*;

public class practice {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int lar1;
        int lar2;

        if (arr[0] > arr[1]) {
            lar1 = arr[0];
            lar2 = arr[1];
        } else {
            lar1 = arr[1];
            lar2 = arr[0];
        }

        for (int i = 2; i < n; i++) {
            if (arr[i] > lar1) {
                lar2 = lar1;
                lar1 = arr[i];
            } else if (arr[i] > lar2 && arr[i] != lar1) {
                lar2 = arr[i];
            }
        }

        System.out.println("The two largest numbers are: " + lar1 + " and " + lar2);
    }
}
