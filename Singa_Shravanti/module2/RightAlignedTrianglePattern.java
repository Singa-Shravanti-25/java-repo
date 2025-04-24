import java.util.*;
public class RightAlignedTrianglePattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows in the pattern :");
        int size = sc.nextInt();

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row + col <= size - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
