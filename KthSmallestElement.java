import java.util.PriorityQueue;

public class KthSmallestElement {

    public static int FindKSmallestElement(int[] arr, int k)
    {
        if(arr == null || arr.length < k  || k<= 0)
        {
            throw new IllegalArgumentException("Invalid input or K value");
        }

        // Max heap to store smallest element
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b - a);
        for(int num : arr)
        {
            maxHeap.add(num);
            if(maxHeap.size()>k){
                maxHeap.poll(); // Remove the largest element in queue
            }
        }
        return maxHeap.peek(); // Kth smallest element
    }
    public static void main(String[] args) {
        int[] arr = {7,10,4,3,20,15};
        int k=3; // Find 3rd smallest 
        System.out.println("Kth smallest Element: " + FindKSmallestElement(arr, k));
    }
}
