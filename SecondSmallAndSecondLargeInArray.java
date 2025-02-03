import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallAndSecondLargeInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of  elements");
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        // Arrays.sort(arr);
        // System.out.println("Second Largest: "+ arr[arr.length-2]);
        // System.out.println("Second Smallest: "+ arr[1]);


        // Without defining method sort methon
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println("Without defining merge sort");
        System.out.println("Second Largest: "+arr[arr.length-2]);
        System.out.println("Second Smallest: "+arr[1]);
        sc.close();

    }
}
