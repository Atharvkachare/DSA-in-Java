public class RotationOfElement {

    public static void Rotateleft(int[] arr, int  n, int k){

        // METHOD 1:-
        // k%=arr.length;
        // int[] temp= new int[k];
        // // Store the first K elements in temp aray
        // for(int i=0; i<temp.length; i++){
        //     temp[i] = arr[i];
        // }

        // // Shift rest to the arr[]
        // for(int i=0; i<arr.length-k; i++)
        // {
        //     arr[i] = arr[i+k];
        // }

        // // Store back the k element
        // for(int i=arr.length-k; i<arr.length; i++){
        //     arr[i] = temp[i -k-1];

        // }

        if(n == 0){
            return;
        }
        k=k%n;
        if(k>n){
            return;
        }
        int[] temp=new int[k];
        for(int i=0; i<k; i++){
            temp[i] = arr[i];
        }
        for(int i=0; i<n-k; i++)
        {
            arr[i] = arr[i+k];
        }
        for(int i=n-k; i<n; i++)
        {
            arr[i] = temp[i-n+k];
        }
    }
    public static void main(String[] args) {
        int n=7;
        int[] arr = {1,2,3,4,5,6,7};
        int k=2;
        Rotateleft(arr, n, k);
        System.out.println("After Rotating the elements to left ");
        for(int i=0; i<n; i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}
