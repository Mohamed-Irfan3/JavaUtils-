package Demo;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Collection {

    public static void main(String[] args) {
        // Creating data 
        LinkedList<String> linkedList = new LinkedList<>();
        ArrayList<String> arrayList = new ArrayList<>();
        HashMap<Integer, String> hashMap = new HashMap<>();
        HashSet<String> hashSet = new HashSet<>();
        linkedList.add("Data1");
        linkedList.add("Data2");
        arrayList.add("Data1");
        arrayList.add("Data2");
        
        System.out.println("LinkedList contents: " + linkedList);
        System.out.println("ArrayList contents: " + arrayList);
        
        // Adding data 
        hashMap.put(1, "Value1");
        hashMap.put(2, "Value2");
        
        System.out.println("HashMap contents: " + hashMap);
        hashSet.add("Data1");
        hashSet.add("Data2");
        
        System.out.println("HashSet contents: " + hashSet);
        
        // Searching data 
        boolean foundInLinkedList = linkedList.contains("Data1");
        boolean foundInArrayList = arrayList.contains("Data2");
        
        if (foundInLinkedList) {
            System.out.println("Data1 found in LinkedList");
        } else {
            System.out.println("Data1 not found in LinkedList");
        }
        
        if (foundInArrayList) {
            System.out.println("Data2 found in ArrayList");
        } else {
            System.out.println("Data2 not found in ArrayList");
        }
        boolean foundInHashMap = hashMap.containsValue("Value1");
        
        if (foundInHashMap) {
            System.out.println("Value1 found in HashMap");
        } else {
            System.out.println("Value1 not found in HashMap");
        }
        boolean foundInHashSet = hashSet.contains("Data2");
        
        if (foundInHashSet) {
            System.out.println("Data2 found in HashSet");
        } else {
            System.out.println("Data2 not found in HashSet");
        }
        
        // Removing data 
        linkedList.remove("Data1");
        arrayList.remove("Data2");
        
        System.out.println("After removing Data1 from LinkedList: " + linkedList);
        System.out.println("After removing Data2 from ArrayList: " + arrayList);
        hashMap.remove(1);
        
        System.out.println("After removing Value1 from HashMap: " + hashMap);
        hashSet.remove("Data1");
        
        System.out.println("After removing Data1 from HashSet: " + hashSet);
    }

}
