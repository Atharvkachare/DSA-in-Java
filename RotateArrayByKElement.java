import java.util.Scanner;

public class RotateArrayByKElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array eleents: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value of the k: ");
        int k=sc.nextInt();
        //Simplify k with the modulo operater with the length of the array
        k=k%n;
        // Make a duplicate array
        int[] res=new int[n];
        int counter =0;
        for(int i=k; i<n ; i++){
            res[i]=arr[counter];
            counter++;
        }
        for(int i=0; i<k; i++){
            res[i]=arr[counter];
            counter++;
        }

        //displaying the resultant array
        for(int i=0; i<n; i++){
            System.out.println(res[i]+" ");
        }
        sc.close();

    }
}
