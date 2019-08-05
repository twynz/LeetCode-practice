package com.test.leetcode;

import org.springframework.stereotype.Component;

@Component
public class ImplementIndexOf {

    char[] needleChar = null;
    char[] str = null;
    int potentialIndex = -1;

    public int strStr(String haystack, String needle) {
      if(needle == null || needle.isEmpty()) {
          return 0;
      }
      if(needle.length()>haystack.length()) {
          return -1;
      }
      str = haystack.toCharArray();
      needleChar = needle.toCharArray();
      for(int i=0;i<str.length;i++) {
          if(isMatch(i)){
              potentialIndex = i;
              break;
          }
      }
      return potentialIndex;
    }

    private boolean isMatch(int currentIndex) {
        boolean flag = true;
        for(int i = 0;i<needleChar.length;i++,currentIndex++) {
            if(currentIndex>=str.length) {
                return false;
            }
            if(needleChar[i]==str[currentIndex]) {
                continue;
            }else {
                flag = false;
                break;
            }
        }
        return flag;

    }
}
