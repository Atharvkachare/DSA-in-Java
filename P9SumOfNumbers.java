import java.util.*;


public class P9SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s = sc.nextLine();
        String temp = "0";
        int sum = 0;
        for(int i=0; i<s.length(); i++)
        {
            char currentChar = s.charAt(i);
            if(Character.isDigit(currentChar)){
                temp += currentChar;
            }else{
                sum += Integer.parseInt(temp);
                temp = "0";
            }
        }

        sum += Integer.parseInt(temp);
        System.out.println("The sum of all the integers in the String is " + sum);
        sc.close();
    }
}
