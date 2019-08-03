package com.test.leetcode;

import org.springframework.stereotype.Component;

@Component
public class MergeTwoList {


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode tempIndex = null;
        ListNode result = null;
        if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }
        while (temp1 != null && temp2 != null){
            if (tempIndex == null) {
                if(temp1.val <= temp2.val) {
                    tempIndex = temp1;
                    temp1 = temp1.next;
                }
                else {
                    tempIndex = temp2;
                    temp2 = temp2.next;
                }
                result = tempIndex;
                continue;
            }

            if (temp1.val < temp2.val) {
                tempIndex.next = temp1;
                tempIndex= tempIndex.next;
                temp1 = temp1.next;
            } else {
                tempIndex.next = temp2;
                tempIndex= tempIndex.next;
                temp2 = temp2.next;
            }

        }
        if(temp2==null&&temp1!=null) {
            tempIndex.next =temp1;
        }
        else if(temp1==null&&temp2!=null) {
            tempIndex.next =temp2;
        }
        else {
            return result;
        }
        return result;
    }
}
