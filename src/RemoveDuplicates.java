import com.sun.javafx.image.IntPixelGetter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.*;

public class RemoveDuplicates {

    public int[] removeDuplicatesSortedArray(int[] nums){
        int i=0;
        int j = i+1;
        int len =0;
        int pointer=0;
        boolean check = false;
        while(i<j && i<nums.length && j<nums.length){

            if(nums[i]==nums[j]){
                check = true;
             //   pointer = i;
                j++;
            }else {
                len++;
                pointer = nums[j];
                if (check) {
                    while (i < j - 1) {
                        j--;
                        nums[j] = pointer;
                    }
                    check = false;
                }
                i++;
                j++;
            }

        }


        return nums;

    }

    public int removeDuplicatesSortedArrayBrute(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int i=0;
        for(Integer item:set){
            nums[i]=item;
            i++;
            ;        }

    return set.size();
    }

    public int[] plusOne(int[] digits) {
        if(digits == null){
            return new int[0];
        }
        int carryForward =0;
        for(int i = digits.length-1;i>0;i--){
            if(i == digits.length-1){
                digits[i]= digits[i]+1;
                if(digits[i]>=10){
                    digits[i] =digits[i]%10;
                    carryForward =1;
                }
            }else{
                digits[i]= carryForward + digits[i];
                if(digits[i]>=10){
                    digits[i] =digits[i]%10;
                    carryForward =1;
                }else{
                    carryForward =0;
                }
            }
        }
        if(carryForward == 1){
           digits = newArray(digits,1);
        }
        return digits;
    }
    public int[] newArray(int[] A,int x){
        int[] res = new int[A.length+1];
        res[0] = x;
        for(int i=1;i<res.length;i++){
            res[i]=A[i-1];
        }
        return A;
    }

    public int findElementNotInSecondArray(int[] A, int[] B){
        List<Integer> list = new ArrayList<>(A.length);
        list.addAll(Arrays.asList());
        for(int i=0;i<B.length;i++){
            if(list.contains(B[i])){
                list.remove(B[i]);
            }
        }

        if(list.isEmpty()){
            return 0 ;}
        else return list.get(0);
    }


    public int removeDuplicatesSortedArrayOptimised(int[] nums){
        int i =0;
        int j = i+1;
        if (nums == null )
            return 0;
        if(nums.length==1){
            return 1;
        }
        for(int a =j;a<nums.length;a++){
         if(nums[i] != nums[a]){
             nums[j] =nums[a];
             i=j;
             j++;

         }
        }
        return j;
    }
}
