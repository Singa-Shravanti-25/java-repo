package module3;
import java.util.*;

public class listExample {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        List<Integer> sampleList = new ArrayList<>();
        List<Integer> sampleList2 = new ArrayList<>();
        
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        
        boolean flag1 = false;
        for (int i = 0; i < size1; i++) {
            flag1 = sampleList.add(sc.nextInt());
        }
        System.out.println("All the elements are added successfully: " + flag1);

        for (int i = 0; i < size2; i++) {
            sampleList2.add(sc.nextInt());
        }

        boolean flag3 = sampleList.addAll(sampleList2);
        System.out.println("Elements from sampleList2 added to sampleList: " + flag3);

        boolean flag = sampleList.removeAll(sampleList2);
        System.out.println("Elements removed from sampleList: " + flag);

        System.out.println("Final sampleList: " + sampleList);

        sampleList.clear();
        System.out.println("Is the list empty? " + sampleList.isEmpty());
        System.out.println("List after clearing is: " + sampleList);

        sc.close();
    }
}
