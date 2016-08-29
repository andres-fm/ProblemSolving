import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s1 = sc.nextLine().toCharArray();
        char[] s2 = sc.nextLine().toCharArray();
        Map<Character, Integer> map1 = new HashMap<Character, Integer>();
        Map<Character, Integer> map2 = new HashMap<Character, Integer>();
        int result = 0, common = 0;
        for(char c : s1)
            map1.put(c, 0);
        for(char c : s2)
            map2.put(c, 0);
        for(char c : s1)
            map1.put(c, map1.get(c)+1);
        for(char c : s2)
            map2.put(c, map2.get(c)+1);
        for(char c : map1.keySet())
            if(map2.containsKey(c))
                common += (map1.get(c) < map2.get(c)) ? map1.get(c) : map2.get(c);
        result = s2.length - common;
        result += s1.length - common;
        System.out.print(result);               
    }
}
