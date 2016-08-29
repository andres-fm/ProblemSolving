import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.valueOf(sc.nextLine());
        Map<Character, Integer> letters = new HashMap<Character, Integer>();
        int i = 0;
        for(char c : "abcdefghijklmnopqrstuvwxyz".toCharArray())
            letters.put(c, i++);
        int counter;
        while(T-- > 0){
            counter = 0;
            char[] string = sc.nextLine().toCharArray();
            for(int j = 0; j < string.length / 2; j++)
                if(letters.get(string[j]) < letters.get(string[string.length - j - 1]))
                    counter += letters.get(string[string.length - j - 1]) - letters.get(string[j]);
                else
                    counter += letters.get(string[j]) - letters.get(string[string.length - j - 1]);
            System.out.println(counter);            
        }
    }
}
