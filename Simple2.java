
package guvi;

import java.util.Scanner;

public class Simple2 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try
        {
        int n = sc.nextInt();
        
        if(n % 2 == 0)
             System.out.println("Even");
        else 
             System.out.println("Odd");
        }
        catch(Exception e)
        {
               System.out.println("Invalid");     
        }
        
        } 
}
