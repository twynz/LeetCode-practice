package com.test.leetcode;

import org.springframework.stereotype.Component;

@Component
public class LongestCommonPrefix {

    int commonNumber = 0;


    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) {
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        int minLenIndex = 0;
        for(int i=0;i<strs.length;i++) {
            if(strs[i].length()<strs[minLenIndex].length()) {
                minLenIndex = i;
            }
        }
        String baseLine = strs[minLenIndex];
        char baselineArr[] = baseLine.toCharArray();
        for(int i =0;i< baselineArr.length;i++) {
            boolean andResult = false;
            for(int j=0;j<strs.length;j++) {
                if(j==minLenIndex) {
                    continue;
                }
                andResult = (strs[j].charAt(i) == baselineArr[i]);
                if(!andResult){
                    break;
                }
            }
            if(andResult) {
                commonNumber+=1;
                andResult = false;
                continue;
            }else {
                break;
            }
        }
        if(commonNumber ==0) {
            return "";
        } else {
            return strs[0].substring(0,commonNumber);
        }

    }
}
