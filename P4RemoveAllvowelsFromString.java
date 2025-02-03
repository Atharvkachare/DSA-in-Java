
import java.util.*;

public class P4RemoveAllvowelsFromString {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        List<Character> vowel = Arrays.asList('a','e','i','o','u','A','E','I','O','U');
        String res="";
        for(char c:s.toCharArray()){
            if(!vowel.contains(c)){
                res=res+c;
            }
        }

        System.out.println("the string with removing vowels is "+res);
        sc.close();

    }
    
}
