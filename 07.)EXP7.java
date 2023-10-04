//NAME:-LUQMAAN SHAIKH
//ROLL NO:-22AD1009
//BATCH:-B2

import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        // Step 1: Start.
        // Step 2: Define class Palindrome.
        
        // Step 3: Declare 2 String variables str and rev.
        String str, rev = "";
        
        // Step 4: Take input from the user for String str
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = scanner.nextLine();
        
        // Step 5: Declare StringBuffer variable str1 using String str as a parameter
        StringBuffer str1 = new StringBuffer(str);
        
        // Step 6: Reverse StringBuffer str1
        str1.reverse();
        
        // Step 7: Convert StringBuffer str1 to String and store it in String rev
        rev = str1.toString();
        
        // Step 8: Check if String str equals to String rev
        if (str.equals(rev)) {
            // Step 8.1: Display String str is a palindrome
            System.out.println("String '" + str + "' is a palindrome.");
        } else {
            // Step 8.2: Display String str is not a palindrome
            System.out.println("String '" + str + "' is not a palindrome.");
        }
        
        
    }
}
