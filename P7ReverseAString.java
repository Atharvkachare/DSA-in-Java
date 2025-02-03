import java.util.Scanner;

public class P7ReverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); 
        System.out.println("Enter the world");
        String s = sc.nextLine();
        String res = "";
        for(char c: s.toCharArray()){
            res=c+res;
        }  
        System.out.println("The reversed String is " + res);
        sc.close();
    }
}
