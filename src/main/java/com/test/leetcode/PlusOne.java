package com.test.leetcode;

import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;

@Component
public class PlusOne {
    boolean carryFlag = false;
    public int[] plusOne(int[] digits) {
       for(int i=digits.length-1;i>=0;i--) {
           int tempResult = digits[i];
           if(carryFlag) {
               tempResult = digits[i] + 1;
           }

           if(i==digits.length-1) {
               tempResult = digits[i] + 1;
           }
           if(tempResult >= 10) {
               carryFlag = true;
               digits[i] = tempResult%10;
           } else {
               digits[i] = tempResult;
               carryFlag = false;
           }
       }

       if(carryFlag) {
           int nums[] = new int[digits.length+1];
           for(int i=0,j=1;i<digits.length;i++,j++) {
              nums[j] = digits [i];
           }
           nums[0] =1;
           return nums;
       }
       return digits;
    }
}
