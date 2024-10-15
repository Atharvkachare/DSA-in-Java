import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallestAndSecondLargestElementArray {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number of array elements");
    int n= sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
    }
    // Arrays.sort(arr);
    // System.out.println("Second Largest: "+ arr[arr.length-2]);
    // System.out.println("Second Smallest: "+ arr[1]);

    for(int i=0; i<arr.length; i++){
        for(int j=i+1; j<arr.length; j++){
            if(arr[i]<arr[j]){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    System.out.println("Without Defined SORT");
    System.out.println("Second Largest: "+ arr[arr.length-2]);
    System.out.println("Second Smallest: "+ arr[1]);
    sc.close();

  }
    
}
