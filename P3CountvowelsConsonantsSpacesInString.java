import java.util.Scanner;
import java.util.*;

public class P3CountvowelsConsonantsSpacesInString {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String: ");
    String s = sc.nextLine();
    s = s.toLowerCase();
    List<Character> vowels = Arrays.asList('a','e','i','o','u');
    int vowelscount = 0;
    int consonantcount =0;
    int spacecount = 0;
    for(char c:s.toCharArray()){
        if(vowels.contains(c)){
            vowelscount++;
        }else if(c == ' '){
            spacecount++;
        }
        else if(Character.isLetter(c) && !vowels.contains(c)){
            consonantcount++;
        }
    }

    System.out.println("vowel count="+ vowelscount+" consonant count="+consonantcount+" spacecount"+spacecount);
    sc.close();

    }
}
