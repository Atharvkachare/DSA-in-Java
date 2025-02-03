import java.util.Scanner;

public class P6RemoveNonAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the world");
        String s = sc.nextLine();
        String res = "";
        for(char c : s.toCharArray())
        {
            if((c >= 65 && c <= 90) || (c >= 97 && c <= 122))
            {
                res = res + c;
            }
          
        }
        System.out.println("The string with removing non alphabets is: " + res);
        sc.close();
    }
}
