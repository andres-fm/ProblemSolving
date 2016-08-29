import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.valueOf(sc.nextLine());
        for(int i = 0; i < T; i++){
            String a = sc.nextLine();
            Map<Character, Character> A = new HashMap<Character, Character>();
            for(char c : a.toCharArray())
                A.put(c, c);                   
            String b = sc.nextLine();
            boolean yes = false;
            for(char c : b.toCharArray()){
                if(A.containsKey(c)){
                    System.out.println("YES");
                    yes = true;
                    break;
                }                    
            }
            if(!yes)
                System.out.println("NO");
        }
    }

}
