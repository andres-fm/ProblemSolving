import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.valueOf(sc.nextLine());
        while(T-- >0){
            char[] s = sc.nextLine().toCharArray();
            boolean funny = true;
            for(int i = 0; i+1 < s.length; i++)
                if(Math.abs(s[i+1]-s[i]) != Math.abs(s[s.length-i-2]-s[s.length-i-1])){
                    funny = false;
                    break;
                }
            System.out.println((funny) ? "Funny" : "Not Funny");
                
        }
    }
}
