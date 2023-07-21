import java.util.*;
class object
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first complex number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter the second complex number:");
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println("Sum: " +(a+c)+"+"+(b+d)+"i");
        System.out.println("Difference: "+(a-c)+"+"+(b-d)+"i");
        System.out.println("Product: "+(a*d + b*c)+"+"+(a*d + b*c)+"i");
    }
}