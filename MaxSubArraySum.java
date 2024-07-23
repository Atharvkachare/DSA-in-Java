
// Kdance Algorithm

public class MaxSubArraySum{
    public static long MaxSubArraySum(int[] arr, int n)
    {
        long sum=0;
        long max = 0;

        for(int i=0; i<n; i++)
        {
            sum+=arr[i]; // update the value of sum
            if(sum<0)
            {
                sum = 0;
            }
            if(sum>max)
            {
                max = sum; //update max
            }

            
        }
        return max;
    }
}