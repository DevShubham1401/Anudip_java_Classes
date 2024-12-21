// Write a Java program to remove all elements from a hash set.


import java.util.HashSet;

public class Hash_Set {
    public static void main(String[] args) {
        // Create a HashSet and add elements
        HashSet<String> languages = new HashSet<>();
        
        // Adding elements to HashSet
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("C++");
        languages.add("Ruby");
        
        // Print original HashSet
        System.out.println("Original HashSet: " + languages);
        System.out.println("Size of HashSet: " + languages.size());
        
        // Method 1: Using clear() method
        languages.clear();
        System.out.println("\nAfter using clear() method:");
        System.out.println("HashSet: " + languages);
        System.out.println("Size: " + languages.size());
        
        // Add elements again to demonstrate another method
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("C++");
        languages.add("Ruby");
        
        System.out.println("\nHashSet after adding elements again: " + languages);
        
        // Method 2: Using removeAll() method
        languages.removeAll(languages);
        System.out.println("\nAfter using removeAll() method:");
        System.out.println("HashSet: " + languages);
        System.out.println("Size: " + languages.size());
        
        // Add elements again to demonstrate third method
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("C++");
        languages.add("Ruby");
        
        System.out.println("\nHashSet after adding elements again: " + languages);
        
        // Method 3: Remove elements while iterating
        var iterator = languages.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        
        System.out.println("\nAfter removing elements using iterator:");
        System.out.println("HashSet: " + languages);
        System.out.println("Size: " + languages.size());
    }
}


// Output:

// Original HashSet: [Java, C++, JavaScript, Ruby, Python]
// Size of HashSet: 5

// After using clear() method:
// HashSet: []
// Size: 0

// HashSet after adding elements again: [Java, C++, JavaScript, Ruby, Python]

// After using removeAll() method:
// HashSet: []
// Size: 0

// HashSet after adding elements again: [Java, C++, JavaScript, Ruby, Python]

// After removing elements using iterator:
// HashSet: []
// Size: 0