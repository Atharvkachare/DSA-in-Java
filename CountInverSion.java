import java.util.Arrays;

public class CountInverSion {
    private static int mergeAndCount(int[] arr, int l, int m, int r){
        // Lef subaray
        int[] left = Arrays.copyOfRange(arr, l, m+1);

        // Right Subarray
        int[] right = Arrays.copyOfRange(arr, m+1, r+1);

        int i=0, j=0, k=l, swap=0;

        while(i<left.length && j<right.length)
        {
            if(left[i] <= right[j])
            {
                arr[k++] = left[i++];
            }else{
                arr[k++] = right[j++];
                swap += (m+1) - (l+i);
            }
        }

        while(i<left.length)
            arr[k++] = left[i++];
        while(j<right.length)
             arr[k++] = right[j++];
        return swap;
    }

    // merge Sort function
    private static int mergeSortAndCount(int[] arr, int l, int r)
    {
        int count=0;
        if(l<r)
        {
            int m = (l+r) / 2;

            // Left subarray count
            count += mergeSortAndCount(arr, l, m);

            // Right subarray count
            count += mergeSortAndCount(arr, m+1, r);

            //Merge count
            count += mergeAndCount(arr, l, m, r);

        }
        return count;
    }

    // Driver code
    public static void main(String[] args) {
        int arr[] = {8,4,2,1};
        System.out.println(mergeSortAndCount(arr, 0, arr.length-1));
    }

}



// import java.util.*;

// public class ValidPermutations {
//     static final int MOD = 1_000_000_007;

//     public static int countValidPermutations(int n, int[][] requirements) {
//         int maxInversions = 0;
//         for (int[] req : requirements) maxInversions = Math.max(maxInversions, req[1]);

//         long[][] dp = new long[n + 1][maxInversions + 1];
//         dp[0][0] = 1;

//         for (int i = 1; i <= n; i++) {
//             long[] prefixSum = new long[maxInversions + 2];

//             for (int j = 0; j <= maxInversions; j++) {
//                 prefixSum[j + 1] = (prefixSum[j] + dp[i - 1][j]) % MOD;
//             }

//             for (int j = 0; j <= maxInversions; j++) {
//                 int left = Math.max(0, j - (i - 1));
//                 dp[i][j] = (prefixSum[j + 1] - prefixSum[left] + MOD) % MOD;
//             }
//         }

//         // Validate against requirements
//         Map<Integer, Integer> reqMap = new HashMap<>();
//         for (int[] req : requirements) {
//             reqMap.put(req[0] + 1, req[1]);
//         }

//         int result = 0;
//         for (int j = 0; j <= maxInversions; j++) {
//             if (reqMap.containsKey(n) && reqMap.get(n) != j) continue;

//             boolean valid = true;
//             for (int key : reqMap.keySet()) {
//                 if (dp[key][reqMap.get(key)] == 0) {
//                     valid = false;
//                     break;
//                 }
//             }

//             if (valid) result = (result + (int) dp[n][j]) % MOD;
//         }
        
//         return result;
//     }

//     public static void main(String[] args) {
//         int n1 = 3;
//         int[][] req1 = {{2, 2}, {0, 0}};
//         System.out.println(countValidPermutations(n1, req1)); // Output: 2

//         int n2 = 3;
//         int[][] req2 = {{2, 2}, {1, 1}, {0, 0}};
//         System.out.println(countValidPermutations(n2, req2)); // Output: 1

//         int n3 = 2;
//         int[][] req3 = {{0, 0}, {1, 0}};
//         System.out.println(countValidPermutations(n3, req3)); // Output: 1
//     }
// }
