import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.valueOf(sc.nextLine());
        int result;
        int difference = 0;
        while(T-- > 0){
            char[] s = sc.nextLine().toCharArray();
            int comun = 0;
            if(s.length % 2 != 0)
                result = -1;
            else{
                result = 0;
                char[] s1 = new char[s.length/2];
                char[] s2 = new char[s.length/2];
                int j = 0;
                for(int i = 0; i < s.length; i++)
                    if(i < s.length/2)
                        s1[i] = s[i];
                    else
                        s2[j++] = s[i];
                Map<Character, Integer> map1 = new HashMap<Character, Integer>();
                Map<Character, Integer> map2 = new HashMap<Character, Integer>();
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
                        comun += (map1.get(c) < map2.get(c)) ? map1.get(c) : map2.get(c);
                result = s2.length - comun;
            }
            System.out.println(result);
        }
    }
}
