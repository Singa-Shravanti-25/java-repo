package module3;
import java.util.*;
public class hashMapExample {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // Initialising a hashmap
        HashMap<Integer,Integer> sampleMap = new HashMap<>();

        System.out.println("Enter the number of key value pairs in the map:");
        int sizeOfMap = sc.nextInt();

        // Inserting key-value pairs to hashmap
        for(int i = 0 ; i < sizeOfMap ; i ++ ){
            System.out.println("Enter you key and value:");
            int key = sc.nextInt();
            int value = sc.nextInt();
            sampleMap.put(key,value);
        }

        // Fetching a particular value based on key 
        System.out.println("Enter the key of the value you want to fetch from hashmap :");
        System.out.println(sampleMap.get(sc.nextInt()));

        // Removing a key from the hash map
        System.out.println("Enter the key you want to remove");
        int removeKey = sc.nextInt();
        sampleMap.remove(removeKey);
        System.out.println(sampleMap.get(removeKey));

        // 
        System.out.println("Enter the key you want to check if it is there in the map");
        System.out.println(sampleMap.containsKey(sc.nextInt()));

        System.out.println("Enter the value you want to check if it is there in the map");
        System.out.println(sampleMap.containsValue(sc.nextInt()));
        sampleMap.put(null,5);
        System.out.println(sampleMap.get(null));

        System.out.println(sampleMap.keySet());

        System.out.println(sampleMap.values());

        System.out.println(sampleMap.entrySet());
        sc.close();
    }
}
