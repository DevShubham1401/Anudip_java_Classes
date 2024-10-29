// Write a program to display following pattern
// 1
// 12
// 123
// 1234
// 12345

public class NumberPattern {

    public static void main(String[] args) {
        int num = 5;        // Number of rows
        
        for(int i=1;i<=num; i++){         // Loop through each row
            for(int j=1; j<=i; j++){      // Print numbers in each row
                System.out.print(j);
            }
            System.out.println("");     // Move to the next line after each row
        }
    }    
}


// Output:
// 1
// 12
// 123
// 1234
// 12345