import java.io.*;
import java.util.*;
//https://github.com/MhdAqeel
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] sol = s.trim().split("[^a-zA-Z]+");
        if (sol.length == 1 && sol[0].isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(sol.length);
            for (String token : sol) {
                System.out.println(token);
            }
        }
        scan.close();
    }
}

