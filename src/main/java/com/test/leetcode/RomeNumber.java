package com.test.leetcode;

import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class RomeNumber {

    Map<Character, Integer> numberMap = new HashMap<>();
    Stack<Character> stack = new Stack<>();
    //List<Integer> result = new ArrayList<>();
    int result = 0;

    public RomeNumber() {
        numberMap.put('I', 1);
        numberMap.put('V', 5);
        numberMap.put('X', 10);
        numberMap.put('L', 50);
        numberMap.put('C', 100);
        numberMap.put('D', 500);
        numberMap.put('M', 1000);
    }


    public int romanToInt(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (stack.empty()) {
                stack.push(arr[i]);
                continue;
            }
            if (numberMap.get(arr[i]) > numberMap.get(stack.get(0))) {
                result = result + (numberMap.get(arr[i]) - numberMap.get(stack.get(0)));
                stack.pop();
            } else {
                result = result + numberMap.get(stack.get(0));
                stack.pop();
                stack.push(arr[i]);
            }
        }
        if(!stack.empty()) {
            result = result + numberMap.get(stack.get(0));
        }
        return result;
    }
}
