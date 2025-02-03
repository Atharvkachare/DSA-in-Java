import java.util.Scanner;

public class RearrangeArrayElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        // Increasing order: Bubble sort
        System.out.println("Increasing order: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        // Displaying
        for(int i=0; i<n; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();

        // Decreasing order: Bubble Sort
        System.out.println("Decreasing order: ");

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0; i<n; i++){
            System.out.println(arr[i]+" ");
        }
        sc.close();
        
    }
}
