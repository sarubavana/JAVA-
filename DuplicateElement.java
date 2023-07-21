import java.util.Scanner;

class DuplicateElement 
{
  public static void main(String[] args) 
   {
    Scanner sc = new Scanner(System.in);
    System.out.print("number of elements:");
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) 
    {
      arr[i] = sc.nextInt();
    }
     for (int i = 0; i < n-1; i++) 
     {
      for (int j = i + 1; j < n; j++)
      {
        if (arr[i] == arr[j] && i != j) 
         {
          System.out.println(arr[j]);
         }
      }
    }
  }
}
