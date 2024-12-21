// Write a program to add elements to the HashMap given the key as integer and value data type is String.

import java.util.HashMap;
import java.util.Map;

public class Hash_Map {
    public static void main(String[] args) {
        // Create a HashMap with Integer key and String value
        HashMap<Integer, String> map = new HashMap<>();
        
        // Adding elements to HashMap using put() method
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "JavaScript");
        map.put(4, "C++");
        map.put(5, "Ruby");
        
        // Printing all elements
        System.out.println("HashMap elements:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Demonstrating some common HashMap operations
        
        // Check if a key exists
        int keyToCheck = 3;
        if (map.containsKey(keyToCheck)) {
            System.out.println("\nValue for key " + keyToCheck + ": " + map.get(keyToCheck));
        }
        
        // Update a value
        map.put(2, "Python 3.0"); // Updates existing value
        
        // Remove an element
        map.remove(5);
        
        // Get size of HashMap
        System.out.println("\nSize of HashMap: " + map.size());
        
        // Print updated HashMap
        System.out.println("\nUpdated HashMap elements:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}


// Output:

// HashMap elements:
// Key: 1, Value: Java
// Key: 2, Value: Python
// Key: 3, Value: JavaScript
// Key: 4, Value: C++
// Key: 5, Value: Ruby

// Value for key 3: JavaScript

// Size of HashMap: 4

// Updated HashMap elements:
// Key: 1, Value: Java
// Key: 2, Value: Python 3.0
// Key: 3, Value: JavaScript
// Key: 4, Value: C++