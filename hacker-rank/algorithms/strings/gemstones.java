import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.valueOf(sc.nextLine());
        int i = N;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char[] alphabet = "qwertyuiopasdfghjklñzxcvbnm".toCharArray();
        for(char c : alphabet)
            map.put(c, 0);
        while(i-- > 0){
            Set<Character> stringSet = new HashSet<Character>();
            for(char c : sc.nextLine().toCharArray())
                stringSet.add(c);
            for(char c : stringSet)
                map.put(c, map.get(c) + 1);
        }
        int counter = 0;
        for(char a : alphabet)
            if(map.get(a) == N)
                counter++;
        System.out.print(counter);
    }
    
}
