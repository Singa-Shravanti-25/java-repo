import java.util.*;
public class prime {
    public static boolean isPrime(int n){
        if(n<=1)
        return false;
        if(n==2 || n==3)
        return true;
        for(int i=2;i*i<=n;i++){
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=n+1;
        int ct=0;
        while(ct<5){
            if(isPrime(p)){
                System.out.println(p);
                ct++;
            }
            p++;
        }
        sc.close();
    }
}
