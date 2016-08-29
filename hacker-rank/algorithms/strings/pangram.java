import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Map<Character, Character> map = new HashMap<Character, Character>();
        for(char c : new Scanner(System.in).nextLine().toLowerCase().toCharArray())
            map.put(c, c);
        boolean pangram = true;
        for(char c : "abcdefghijklmnopqrstuvwxyz".toCharArray())
            if(!map.containsKey(c)){
                pangram = false;
                break;
            }
        System.out.print((pangram) ? "pangram" : "not pangram");
            
        
    }
}
