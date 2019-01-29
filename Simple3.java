
package guvi;

import java.util.Scanner;

public class Simple3 {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try
        {
        String s = sc.next();
        if(s.length() > 1)
                System.out.println("Invalid");
        else
        {
            if(s.matches("[a-z]"))
            {
                char c = s.charAt(0);
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                {
                    System.out.println("Vowel");
                }
                else 
                {
                    System.out.println("Consonant");
                }
            }
        
            else
            {
                System.out.println("Invalid");
            }
        }
        }
        catch(Exception e)
        {
            System.out.println("Invalid");
        }
    }
}
