import java.util.Scanner;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int k=0;
        for(int j=1; j<arr.length; j++)
        {
            if(arr[k] != arr[j])
            {
                k++;
                arr[k] = arr[j];

            }
        }
        System.out.println("After removing duplicate element: ");
        for(int i=0; i<k+1; i++)
        {
            System.out.println(arr[i] + " ");

        }
        sc.close();
    }
}
