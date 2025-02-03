public class KedanesAlogorithm {
    public static int maxSubArraySum(int[] arr){
        // Edge case: Empty array
        if(arr == null || arr.length == 0)
        {
            throw new IllegalArgumentException("Array can not be null or empty");
        }

        int maxSum = arr[0]; // MaxSum = First element
        int currentSum = arr[0];
        for(int i=0; i<arr.length; i++)
        {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr1[] = {-2,1,-3,4,-1,2,1,-5,4}; // Normal Case
        int[] arr2 = {-1,-2,-3,-4}; // All negative valuse
        int [] arr3 = {1,2,3,4,5}; //All positive vales
        
        System.out.println("Maximum sub array sum(arr1): " + maxSubArraySum(arr1));
        System.out.println("Maximum sub array sum(arr2): " + maxSubArraySum(arr2));
        System.out.println("Maximum sub array sum(arr3): " + maxSubArraySum(arr3));
    }
}
