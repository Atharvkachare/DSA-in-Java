import java.util.Scanner;
public class SamallInArray{
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the number of elements: ");
        // int n=sc.nextInt();
        // int[] arr=new int[n];
        // for(int i=0; i<n; i++)
        // {
        //     arr[i]=sc.nextInt();
        // }
        // int min=arr[0];
        // for(int i=0; i<n; i++)
        // {
        //     if(arr[i]<min)
        //     {
        //         min=arr[i];
        //     }
        // }
        // System.out.println("The minimum value in the array is: "+min);
        // sc.close();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }

        int min=arr[0];
        for(int i=0; i<n; i++)
        {
            if(arr[i]<min){
                min=arr[i];
            }
        }

        System.out.println("Minimum element in the array is: "+min);
        sc.close(); 

    }

}