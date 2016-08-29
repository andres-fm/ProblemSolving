import java.io.*;
import java.util.*;

public class Solution {
    
    //combinations from n (paramater) in 2
    private static int combinations(int n){
        return n*(n-1)/2;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.valueOf(sc.nextLine());
        while(T-- > 0){
            String string = sc.nextLine();
            int n = string.length();
            char[][] substrings = new char[n*(n+1)/2][1];
            int index = 0;
            Map<String, Integer> map = new HashMap<>();
            for(int i = 0; i < n; i++){
                for(int j = i+1; j <= n; j++){
                    substrings[index] = string.substring(i, j).toCharArray();
                    Arrays.sort(substrings[index]);
                    String sortedPermutation = new String(substrings[index++]);
                    if(map.containsKey(sortedPermutation))
                        map.put(sortedPermutation, map.get(sortedPermutation)+1);
                    else
                        map.put(sortedPermutation, 1);
                }
            }
            int result = 0;
            for(String s : map.keySet())
                result += combinations(map.get(s));
            System.out.println(result);
        }
    }
}
