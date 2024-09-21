
import java.util.*;

public class KthMinMax {
    public static void main(String[] args) {
        Integer arr[] = new Integer[]{6,3,4,8,10, 54};
        int k=3;
        System.out.println("Kth smallest element in array: ");
        Arrays.sort(arr);
        System.out.println(arr[k-1]+" ");

        System.out.println("\nKth largest element in array: ");
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(arr[k-1] + " ");

    }
}
