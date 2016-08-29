import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt(); 
            int M = sc.nextInt(); 
            int S = sc.nextInt(); 
            //el número de chocolate + id - 1 mod(num de personas) = persona a la que le toca el chocolate
            System.out.println((((M + S - 1) % N) == 0) ? N : (M + S - 1) % N);
        }
    }
}
