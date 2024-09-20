import java.util.Arrays;

public class ReverseArray{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
       // reverseArray(arr); //Using Same array
       reverseArray2(arr, 0,n-1); //Using recursion
        System.out.println(Arrays.toString(arr));
    }

    // Using Same array
    // static void reverseArray(int[] arr)
    // {
    //     int n =arr.length;
    //     for(int i=0; i<n/2; i++)
    //     {
    //         int temp = arr[i];
    //         arr[i] = arr[n-1-i];
    //         arr[n-1-i] = temp;
    //     }
    // }

     static void reverseArray2(int[] arr, int start, int end)
    {
        if(start>end)return;
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseArray2(arr, start+1, end-1);
    }
}