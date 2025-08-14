import java.util.Scanner;
//github.com/MhdAqeel
public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length() != b.length()){
            return false;
        }
        else{
            int [] arr = new int[26];
            for (int i =0; i<a.length() ;i++){
                arr[a.toLowerCase().charAt(i)-'a']++;
                arr[b.toLowerCase().charAt(i)-'a']--;
            }
            for(int j =0 ; j<26 ; j++){
                if (arr[j] != 0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
