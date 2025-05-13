package org.example;

import java.util.Arrays;

public class StreamFunctions 
{
    public int minStream(int[] nums)
    {
        return Arrays.stream(nums).min().orElseThrow();
    }

    public int maxStream(int[] nums)
    {
        return Arrays.stream(nums).max().orElseThrow();
    }

    public int sumStream(int[] nums)
    {
        return Arrays.stream(nums).sum();
    }

    public double avgStream(int[] nums) 
    {
        return Arrays.stream(nums).average().orElseThrow();
    }
}
