import java.util.Scanner;

public class buliding
 {
    public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
        int left=0,right=n-1,maxWater=0;
        while (left<right) 
		{
            int water=(right-left-1)*Math.min(arr[left],arr[right]);
            maxWater=Math.max(maxWater,water);
            if(arr[left]<arr[right])
			{
                left++;
            } 
			else
			{
                right--;
            }
        }
        System.out.println("Maximum water that can be trapped: " + maxWater);
    }
}