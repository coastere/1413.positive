package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums={-3,2,-3,4,2};

        int min=1;
        int sum=0;
        for (int i = 0; i <nums.length ; i++) {
            sum = sum + nums[i];
            if (sum < min) {
                min=sum;
            }
        }

        if (min > 0) {
            min = 1;
        } else {
            min=1-min;
        }

        System.out.println(min);

    }
}
