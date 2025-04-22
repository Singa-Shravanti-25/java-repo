import java.util.*;
public class Pattern  
{  
    public static void main(String args[])  
    {   
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n=sc.nextInt();
        for(int i=0;i<2*n;i++){
            for(int j=0;j<2*n;j++){
                if((j + i <= n) || ( j - i <= -n ) || ( j - i >= n-1 ) || ( j + i>= (n+(2*n))-1))
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }  
}
