import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());
        while(t-- > 0){
            int counter = 0;
            int j = 1;
            char[] chars = sc.nextLine().toCharArray();
            for(int i = 0; i < chars.length; i++){
                if(i + j >= chars.length)
                    break;
                if(chars[i] == chars[i + j]){
                    counter++;
                    i--;
                    j++;
                    
                }else{
                    i += j - 1;
                    j = 1;
                }
            }
            System.out.println(counter);                
        }
    }
}
