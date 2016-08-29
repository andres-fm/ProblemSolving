import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            int c = sc.nextInt();
            int m = sc.nextInt();
            int chocolates = n/c;
            int wrappers = chocolates;
            while(wrappers >= m){                
                int qk = wrappers/m;
                wrappers = wrappers % m;
                chocolates += qk;
                wrappers += qk;
            }
            System.out.println(chocolates);
        }
    }
}
