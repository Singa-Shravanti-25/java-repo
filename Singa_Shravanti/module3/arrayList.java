package module3;
import java.util.*;
class arrayList{
public static void main ( String args[] ){
    Scanner sc = new Scanner ( System.in );
    // Creation of an ArrayList
    List<Integer> sampleList = new ArrayList<>();
    System.out.println("Enter the size of the list : ");
    int sizeOfList = sc.nextInt();
    // Adding the elements to the array list
    for( int iterator = 0 ; iterator < sizeOfList ; iterator ++ ){
        sampleList.add( sc.nextInt() );
    }
    // Displaying the elements of the array list
    System.out.println("The elements of the list are :");
    for(int iterator = 0 ; iterator < sizeOfList ; iterator ++){
        System.out.print(sampleList.get(iterator)+" ");
    }
    System.out.print("\n");
    // Removing an element at an index in the array list 
    System.out.println("Enter the index of the value you want to delete ");
    int removeIndex=sc.nextInt();
    sampleList.remove(removeIndex);
    // Modifying the array list 
    System.out.println("Enter the element you want to update at the index in the  list");
    int modificationIndex=sc.nextInt();
    int newElement=sc.nextInt();
    sampleList.set(modificationIndex,newElement);
    // Displaying the list after modifications
    System.out.println("List after modification is:");
    System.out.println(sampleList);
    // Displaying the size of the array List
    System.out.println("The size of the sampleList is : "+sampleList.size());
    sc.close();
}
}
