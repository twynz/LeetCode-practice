package com.test.leetcode;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ReserverInteger {

    public int reverse(int x) {

        int res = 0;
        List<Integer> list = new ArrayList<>();
        boolean negFlag = false;
        if (x < 0) {
            negFlag = true;
        }
        while (x != 0) {
            int temp = x % 10;
            x = x / 10;
            list.add(temp);
        }
        for(int i=0;i<list.size();i++) {
            if(list.get(0)==0&&i==0){
                continue;
            }
            res = res*10+list.get(i);
        }
        if (res>Integer.MAX_VALUE/10 || (res==Integer.MAX_VALUE/10 )) return 0;
        if (res<Integer.MIN_VALUE/10 || (res==Integer.MIN_VALUE/10 )) return 0;
        return res;

    }
}
