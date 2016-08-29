import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        Map<String, Integer> mapA = new HashMap<>();
        Map<String, Integer> mapB = new HashMap<>();
        int n = Integer.valueOf(sc.nextLine());
        for(String s : sc.nextLine().split(" "))
            if(mapA.containsKey(s))
                mapA.put(s, mapA.get(s)+1);
            else
                mapA.put(s, 1);
        int m = Integer.valueOf(sc.nextLine());
        for(String s : sc.nextLine().split(" "))
            if(mapB.containsKey(s))
                mapB.put(s, mapB.get(s)+1);
            else
                mapB.put(s, 1);
        List<String> missing = new LinkedList<>();
        for(String b : mapB.keySet())            
            if(!mapA.containsKey(b) || mapB.get(b) > mapA.get(b))
                missing.add(b);        
        Collections.sort(missing);
        for(String s : missing)
            System.out.print(s + " ");            
    }
}
