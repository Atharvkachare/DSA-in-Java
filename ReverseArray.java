import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int[] rev = new int[n];
        int counter=0;
        for(int i=n-1; i>=0; i--){
            rev[counter]=arr[i];
            counter++;
        }
        System.out.println();
        //Displaying
        for(int i=0; i<n; i++){
            System.out.println(rev[i]+" ");
        }
        sc.close();
    }
}
