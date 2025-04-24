import java.util.*;
public class int_bin {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=n;
        List<Integer> l=new ArrayList<>();
        while(p!=0){
            l.add(p%2);
            p=p/2;
        }
        for(int i=l.size()-1;i>=0;i--)
        {
            System.out.print(l.get(i));
        }
        sc.close();
    }
}
