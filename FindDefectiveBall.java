import java.util.Scanner;

public class FindDefectiveBall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the index of the defective ball(0-7) : ");
        int[] balls = new int[8];
        for (int i = 0; i < 8; i++) {
            balls[i] =scanner.nextInt() ;
        }
        
        // Set the index of the defective ball
        
        //int defectiveIndex = scanner.nextInt();
        //balls[defectiveIndex] = 0;
        
        // First weighing
        int c1 = balls[0] + balls[1] + balls[2];
        int c2 = balls[3] + balls[4] + balls[5];
        int c3 = balls[6] + balls[7];
        
        if (c1 == c2) {
            // Second weighing with C3
            if (balls[6] < balls[7]) {
                System.out.println("The defective ball is B7");
            } else {
                System.out.println("The defective ball is B8");
            }
        } else if (c1 < c2) {
            // Second weighing with C1
            if (balls[0] == balls[1]) {
                System.out.println("The defective ball is B3");
            } else if (balls[0] < balls[1]) {
                System.out.println("The defective ball is B1");
            } else {
                System.out.println("The defective ball is B2");
            }
        } else {
            // Second weighing with C2
            if (balls[3] == balls[4]) {
                System.out.println("The defective ball is B6");
            } else if (balls[3] < balls[4]) {
                System.out.println("The defective ball is B4");
            } else {
                System.out.println("The defective ball is B5");
            }
        }
    }
}
