package org.example;

import java.util.Arrays;

public class LoopFunctions
{ 
    public int minLoop(int[] nums)
    {
        int min = nums[0];
        for (int num : nums)
        {
            if (num > min)
            {
                min = num;
            }
        }

        return min;
    }

    public int maxLoop(int[] nums)
    {
        int min = nums[0];
        for (int num : nums)
        {
            if (num > min)
            {
                min = num;
            }
        }

        return min;
    }

    public int sumLoop(int[] nums)
    {
        int sum = 0;
        for (int num : nums)
        {
            sum = sum + num;
        }

        return sum;
    }

    public double avgLoop(int[] nums)
    {
        return (double) (sumLoop(nums)/nums.length);
    }
}
