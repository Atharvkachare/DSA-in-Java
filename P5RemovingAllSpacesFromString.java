import java.util.Scanner;
import java.util.*;

public class P5RemovingAllSpacesFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        String res="";
        for(char c:s.toCharArray()){
            if(c != ' '){
                res=res+c;
            }
        }
        System.out.println("The string with removing spaces: "+res);
        sc.close();
    }
}
