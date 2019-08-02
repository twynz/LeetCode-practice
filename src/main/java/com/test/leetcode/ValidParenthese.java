package com.test.leetcode;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

@Component
public class ValidParenthese {

    private Stack<Character> stack = new Stack<>();

    private Map<Character, Integer> m = new HashMap();

    public ValidParenthese() {
        m.put('(', -1);
        m.put(')',1);
        m.put('[',-2);
        m.put(']',2);
        m.put('{',-3);
        m.put('}',3);
    }

    public boolean isValid(String s) {
        if(s.isEmpty()) {
            return true;
        }
        char sc[] = s.toCharArray();
        for(char tempChar : sc) {
            if(stack.isEmpty()) {
                stack.push(tempChar);
                continue;
            }

            if(m.get(stack.peek())+m.get(tempChar)==0) {
                stack.pop();
                continue;
            } else {
                stack.push(tempChar);
            }
        }
        return stack.empty();
    }
}
