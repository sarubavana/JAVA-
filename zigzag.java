import java.util.*;

class Zigzag {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int n = sc.nextInt();

    int[] arr = new int[n];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    for (int i = 0; i < n - 1; i++) {
      if (i % 2 == 0 && arr[i] > arr[i + 1]) {
        int temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
      } else if (i % 2 != 0 && arr[i] < arr[i + 1]) {
        int temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
      }
    }

    System.out.println("Array after zigzag sorting:");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}


		   
			  
		  