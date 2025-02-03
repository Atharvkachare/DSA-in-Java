import java.util.Scanner;

public class AverageOfArrayElements {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the array elements: ");
        // int n=sc.nextInt();
        // int[] arr=new int[n];
        // for(int i=0; i<n;i++){
        //     arr[i]=sc.nextInt();
        // }
        // int sum=0;
        // for(int i:arr){
        //     sum+=i;
        // }
        // float avg=(float) sum/n;
        // System.out.println("The average of the array is: "+avg);
        // sc.close();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array elements:- ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int sum=0;
        for(int i:arr){
            sum+=1;
        }
        float avg=(float) sum/n;
        System.out.println("The average of the array is: "+avg);
        sc.close();
    }
}
