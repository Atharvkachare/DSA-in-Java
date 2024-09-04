// Java programe to find sum of all minimum and maximum elements of sub-array size k
import java.util.Arrays;

class P01{
    // Return the sum of min and max element of all sub arrays of size k
    static int sumOfKsubArray(int[] arr, int N, int k)
    {
        // To storre the final answer
        int sum=0;
        //Find all subaray
        for(int i=0; i<N; i++)
        {
            // To store the length of the subarray
            int length=0;
            for(int j=i; j<N; j++)
            {
                // Increment the length
                length++;
                //Whene there is a subarray of size k
                if(length == k)
                {
                    // To Store the Maximum and minimum Element
                    int maxi = Integer.MIN_VALUE;
                    int mini = Integer.MAX_VALUE;
                    for(int m=i; m<j; m++)
                    {
                        // To find maximum and minimum element
                        maxi=Math.max(maxi, arr[m]);
                        mini = Math.min(mini, arr[m]);
                        
                    }
                    // Find Maximum and minimum elments
                    sum +=maxi+mini;
                }
            }
            
        }
        return sum;
    }

    public static void main(String[] args)
    {
        int[] arr={2,5,-1,7,-3,-1,-2};
        int N=arr.length;
        int k=4;
        System.out.println(sumOfKsubArray(arr, N, k));
    }
}