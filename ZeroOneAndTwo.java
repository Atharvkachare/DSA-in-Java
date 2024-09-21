public class ZeroOneAndTwo {
    public  void sort(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int ptr=0, temp=0;
        while(ptr<= end){
            switch(nums[ptr]){
                case 0:{
                    temp = nums[start];
                    nums[ptr]=temp;
                    start++;
                    ptr++;
                    break;
                }

                case 1: {
                    ptr++;
                    break;
                }

                case 2:{
                    temp = nums[ptr];
                    nums[ptr] = nums[end];
                    nums[end] = temp;
                    end--;
                    break;
                }
            }
        }

    }
    
}
