import java.util.Scanner;

public class SmallestNumberInArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum value is: "+ min);
        sc.close();
        
    }
    
}
