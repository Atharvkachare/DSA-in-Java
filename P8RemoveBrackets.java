import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P8RemoveBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the world");
        List<Character> brackets = Arrays.asList('(', ')');
        String s =sc.nextLine();
        String res = "";
        for(char c: s.toCharArray())
        {
            if(!brackets.contains(c))
            {
                res=res+c;
            }
        }
        System.out.println("The String With Removing Brackets is " + res);
        sc.close();
    }
}
