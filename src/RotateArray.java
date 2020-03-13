import java.util.Arrays;

public class RotateArray {


    public void rotate(int[] nums, int k) {
        if(k>nums.length){
            k = k%nums.length;
        }
        while(k>0) {
            int lastele =nums[nums.length-1];
            int temp=
//            for (int i = 0; i < nums.length; i++) {
//                int temp = nums[i];
//                nums[i]=lastele;
//                lastele = temp;
//            }
            k--;
        }
    }

    private int getIndex(int size, int i, int k)
    {
        int sum = i + k;

        if(sum >= size)
            return sum - (size - 1);
        else
            return sum;
    }


    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i+=2){
            if(nums[i]!=nums[i+1]){
                return nums[i];
            }
        }
        return 0;
    }
    public void moveZeroes(int[] nums) {

        int zeropos = 0;
        for(int i=0 ;i < nums.length;i++){
            if(nums[i] != 0){
                if(zeropos < i)
                    nums[zeropos]=nums[i];
                    zeropos++;

            }
        }
    }
}
