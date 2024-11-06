import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class FindAllDuplicatesInArray{
    public List<Integer> findDuplicatesConstantSpace(int[] nums){
        List<Integer> resultSet = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            int index = Math.abs(nums[i]) -1;
            if(nums[index]<0){
                resultSet.add(index + 1);
            }
            nums[index] = nums[index] * -1;
        }
        return resultSet;
    }

    public List<Integer> findDuplicatesLinearSpace(int[] nums){
        List<Integer> resultSet = new ArrayList<>();
        Set<Integer> uniquSet = new HashSet<>();
        for(int num:nums){
            if(uniquSet.contains(num)){
                resultSet.add(num);
            }
            uniquSet.add(num);
        }
        return resultSet;
    }
}