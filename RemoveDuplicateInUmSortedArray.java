import java.util.HashMap;
import java.util.Scanner;

public class RemoveDuplicateInUmSortedArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        // Sorting unique elements and adding it to list
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:arr)
        {
            if(!map.containsKey(i)){
                map.put(i, 1);
            }
        }
        int[] res=new int[map.size()];
        int counter = 0;
        for(int i:map.keySet()){
            res[counter]=i;
            counter++;
        }

        //Displaying the output array
        for(int i=0; i<map.size();i++){
            System.out.println(res[i]+" ");
        }
        sc.close();
    }
}
