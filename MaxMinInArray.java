public class MaxMinInArray {
    public static void main(String[] args) {
        int arr[] = {50,20,30,4,10};
        MaxElement(arr);
        MinElement(arr);
    }

    static int MaxElement(int[] arr)
    {
        int max=arr[0];
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i] > max)
            {
                max=arr[i];
            }
        }
        System.out.println("maximum Element is: "+ max);
        return max;

    }

    static int MinElement(int[] arr)
    {
        int min=arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("Minimum element is: "+ min);
        return min;
    }
}
