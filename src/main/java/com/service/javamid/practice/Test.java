package com.service.javamid.practice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) throws IOException {
        int[] nums = new int[]{0,0,0,0};
        List<List<Integer>> answer = threeSum(nums);
        for (List<Integer> list : answer) {
            System.out.println(list);
        }
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if (i>0 && nums[i]==nums[i-1]) continue;
            int left = i+1,right = nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    answer.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while (left< right && nums[left] == nums[left+1])left++;
                    while (left < right && nums[right] == nums[right-1])right--;
                    left++;
                    right--;
                }
            }
        }
        return answer;
    }

}
