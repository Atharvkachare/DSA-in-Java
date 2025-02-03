
import java.util.HashMap;
import java.util.Scanner;
public class CountFrequencyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n= sc.nextInt();
        int[] arr = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }

        for(int i:map.keySet()){
            System.out.println("The frequency of "+i+" in array is "+map.get(i));
        }
        sc.close();  
    }
}
