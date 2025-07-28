//github.com/MhdAqeel
import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        for(int i=0; i<s.length() ; i++ ){
            String word1 = s.substring(i, k);
            String word2 = s.substring(i+1, k+1);
            if (word1.compareTo(word2)>0){
                smallest= word1;            
            }
            else {
                largest = word2;
            }
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}