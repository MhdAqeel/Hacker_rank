import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean ana = true;
        if(a.length() != b.length()){
            ana = false;
        }
        else{
            int [] arr = new int[26];
            for (int i =0; i<a.length() ;i++){
                arr[a.toLowerCase().charAt(i)-'a']++;
                arr[b.toLowerCase().charAt(i)-'a']--;
            }
            for(int j =0 ; j<26 ; j++){
                if (arr[j] != 0){
                    ana=false;
                }
            }
        }
        return ana;
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