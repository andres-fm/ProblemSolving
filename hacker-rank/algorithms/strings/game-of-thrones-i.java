import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.nextLine().toCharArray();
        sc.close();
        Map<Character, Integer> string = new HashMap<>();
        for(char c : s)
            string.put(c, 0);
        for(char c : s)
            string.put(c, string.get(c)+1);
        boolean palindrome = true;
        if(s.length % 2 == 0){
            for(char c : string.keySet())
                if(string.get(c) % 2 != 0){
                    palindrome = false;
                    break;  
                }
        }else{
            int odd = 0;
            for(char c : string.keySet())
                if(string.get(c) % 2 != 0){
                    odd++; 
                }
            if(odd != 1)
                palindrome = false;
        }
        System.out.print((palindrome) ? "YES" : "NO");
    }
}
