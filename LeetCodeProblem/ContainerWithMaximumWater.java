package LeetCodeProblem;

import java.util.Arrays;

class Solution1{
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int max=nums[0];
        int maxLength=1;
        int overAllValue=0;
        int overAllLength=0,i=0;
        while(i<nums.length-1){
            if(nums[i]==nums[i+1])
                maxLength++;
            else{
                if(maxLength>overAllLength){
                    overAllLength=maxLength;
                    overAllValue=max;
                }
                maxLength=1;
                max=nums[i+1];
            }
            i++;
        }
        if(maxLength>overAllLength){
            overAllValue=max;
        }
        return overAllValue;
    }
    public  static int max(int[] array){
        Arrays.sort(array);
        return array[array.length/2];
    }
}
public class ContainerWithMaximumWater {
    public  static int container(int[] height){
        int maxAnswer=0;
        int first=0;
        int last=height.length-1;
        while(first<last){
            if(height[first]<height[last]){
                maxAnswer=Math.max(maxAnswer,height[first]*(last-first));
                first++;
            }
            else{
                maxAnswer=Math.max(maxAnswer,height[last]*(last-first));
                last--;
            }
        }
        return maxAnswer;
    }
    public static void main(String[] args){
        int[] array={1,8,6,2,5,4,8,3,7};
        int[] ar={3,2,3};
        System.out.println(container(array));
        System.out.println(Solution1.max(ar));
    }
}