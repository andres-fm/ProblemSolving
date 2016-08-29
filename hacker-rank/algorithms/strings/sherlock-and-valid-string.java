import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        sc.close();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        Map<Integer, Integer> rep = new HashMap<Integer, Integer>();
        char[] chars = string.toCharArray();
        for(char c : chars)
            map.put(c, 0);
        for(char c : chars)
            map.put(c, map.get(c) + 1);
        for(Integer i : map.values())
            rep.put(i, i);
        String print = "";
        Collection<Integer> values = rep.values();        
        int value1 = values.iterator().next();
        int c1 = 0, c2 = 0, menor;
        if(values.size() < 3){
            for(char c : map.keySet())
                if(map.get(c) == value1)
                    c1++;
                else
                    c2++;
            if(c1 < c2)
                menor = c1;
            else
                menor = c2;
            print = (menor <= 1) ? "YES" : "NO";
        }             
        else
            print = "NO";       
            
        System.out.println(print);
                   
    }
}
