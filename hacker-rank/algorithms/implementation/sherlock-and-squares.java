import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int a = (int)Math.ceil(Math.sqrt(A));
            int b = (int)Math.floor(Math.sqrt(B));
            System.out.println(b-a+1);
        }
    }
}
