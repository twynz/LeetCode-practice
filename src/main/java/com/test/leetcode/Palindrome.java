package com.test.leetcode;

import org.springframework.stereotype.Component;

@Component
public class Palindrome {

    public boolean isPalindrome(int x) {
        char[] arr = ((Integer) x).toString().toCharArray();
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] == arr[j]) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
