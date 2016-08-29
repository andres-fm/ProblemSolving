import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.valueOf(sc.nextLine());
        while(T-- > 0){
            String s = sc.nextLine();
            int value = Integer.valueOf(s);      
            char[] number = s.toCharArray();
            int n = 0;
            for(char c : number){
                int m = Character.getNumericValue(c);
                if(m != 0 && value % m == 0)
                   n++;
            }
            System.out.println(n);
        }
    }
}
