import java.util.*;
public class nthlargestnumber{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int sizeOfArray = sc.nextInt();
        int position;
        for (int i = 0; i < sizeOfArray; i++) {
            queue.add(sc.nextInt());
        }
        position=sc.nextInt();
        for (int i = 1; i < position; i++) {
            queue.poll(); 
        }
        System.out.println(queue.poll());
        sc.close();
    }
}
