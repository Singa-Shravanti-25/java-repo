package module3;
import java.util.*;
public class listSpecificMethods{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of your list:");
        int size=sc.nextInt();
        System.out.println("Enter the list elements:");
        List<Integer> sampleList=new ArrayList<>();
        for(int i=0;i<size;i++){
            sampleList.add(sc.nextInt());
        }
        Iterator<Integer> itr=sampleList.iterator();
        System.out.print("The elements of your list are: ");
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }  
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> l1=new ArrayList<>(Arrays.asList(3,4));
        List<Integer> l2= new ArrayList<>(Arrays.asList(1,2));
        List<Integer> l3=new ArrayList<>(Arrays.asList(5,6));
        System.out.println(l1.equals(l2));
        ans.add(l1);
        ans.add(l2);
        ans.add(l3);
        System.out.println(ans.indexOf(l2));
        sc.close();
    }
}