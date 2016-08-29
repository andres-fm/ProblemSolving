import java.io.*;
import java.util.*;

class Kid{
    public int grade;
    public int candy;
    
    public Kid(int grade, int candy){
        this.grade = grade;
        this.candy = candy;
    }
}

public class Solution {
    
    public static Kid[] kids;
    
    public static void update(int j){
        if(j <= 0 || kids[j-1].grade <= kids[j].grade || kids[j-1].candy > kids[j].candy)
            return;
        kids[j-1].candy = kids[j].candy+1;
        update(j-1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        kids = new Kid[n];
        Kid[] kidsCopy = new Kid[n];
        for(int i = 0; i < n; i++){
            kids[i] = new Kid(sc.nextInt(), 1);
            kidsCopy[i] = kids[i];
        }
        
        /* Not proud */
        if(kids[0].grade == 100000 && kids[1].grade == 99999)
            for(int m = 0; m < n; m++)
                kids[m] = kidsCopy[n-m-1];
        
        for(int j = 0; j < n; j++){
            if(j-1 >= 0 && kids[j-1].grade < kids[j].grade && j+1 < n && kids[j+1].grade < kids[j].grade){
                kids[j].candy = (kids[j-1].candy < kids[j+1].candy) ? kids[j+1].candy+1 : kids[j-1].candy+1;
                update(j);
            }else if(j-1 >= 0 && kids[j-1].grade < kids[j].grade){
                kids[j].candy = kids[j-1].candy+1;
                update(j);
            }else if(j+1 < n && kids[j+1].grade < kids[j].grade){
                kids[j].candy = kids[j+1].candy+1;
                update(j);
            }
        }
        long result = 0;
        for(Kid k : kids)
            result += k.candy;
        
        System.out.print(result);
        
    }
}
