import java.util.HashMap;
import java.util.Scanner;

public class FindingAllReapeatingElementInArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:arr)
        {
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        System.out.println("Repeating elements in array are: ");
        for(int i:map.keySet()){
            if(map.get(i)>1){
                System.out.println(i+" ");
            }
        }
        sc.close();
    }
    
}
