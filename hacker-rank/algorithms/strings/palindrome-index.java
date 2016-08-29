import java.io.*;
import java.util.*;

public class Solution {
    
    /*Tells wether a string (represented as a char array) is palindrome
      or not by ignoring a specific index (omitting one char)*/
    private static boolean isPalindrome(char[] s, int ignoring){
        int j = s.length - 1;    
        for(int i = 0; i < s.length / 2 + 1; i++){
            if(i == ignoring)
                i++;
            if(j == ignoring)
                j--;
            if(s[i] != s[j--])
                return false;
        }
        return true;       
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int T = Integer.valueOf(sc.nextLine());
        for(int j = 0; j < T; j++){
            
            String s = sc.nextLine();
            char[] array = s.toCharArray();  
            /* flag */
            boolean notPalindrome = false;
            for(int i = 0; i < s.length(); i++)
                if(array[i] != array[array.length - 1 - i]){
                    notPalindrome = true;
                    if(isPalindrome(array, i))
                        System.out.println(i);
                    else
                        System.out.println(s.length() - 1 - i);
                    break;
                }
            if(!notPalindrome)
                System.out.println(-1);
            
        }
        
    }
}
