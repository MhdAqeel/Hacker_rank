//github.com/MhdAqeel
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        boolean palin = true;
        int half = A.length()/2;
        for (int i =0; i<half;i++ ){
            if (A.charAt(i) != A.charAt((A.length()-1)-i)){
                palin = false;
                break;
            }
        }
        if (palin){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}



