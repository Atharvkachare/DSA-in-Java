import java.util.*;

public class DNF012 {

    public static void sortColors(int[] nums)
    {
        int low=0; int mid =0 ; int high = nums.length-1;
        while(mid<=high)
        {
            if(nums[mid] == 0 )
            {
                swap(nums, low++, mid++);
            }else if(nums[mid] == 1){
                mid++;
            }else{
                swap(nums, mid, high--);
            }
        }
    }

    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
}
