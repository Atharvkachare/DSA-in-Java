import java.util.Scanner;
public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of elements:- ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements:- ");
        for(int i= 0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        System.out.println("The total sum of array is:- "+ sum);
        sc.close();
    }
    
}
