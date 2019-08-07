package com.test.leetcode;

import org.apache.commons.lang3.ArrayUtils;
import org.springframework.stereotype.Component;


@Component
public class BinaryAdd {
    public String addBinary(String a, String b) {

        String aa = new StringBuffer(a).reverse().toString();
        String bb = new StringBuffer(b).reverse().toString();
        char A[] = aa.toCharArray();
        char B[] = bb.toCharArray();

        boolean carryFlag = false;
        StringBuilder result = new StringBuilder();
        int index = 0;
        boolean aNotFinish = true;
        boolean bNotFinish = true;
        while (index < A.length || index < B.length) {
            if(index>=A.length) {
                aNotFinish = false;
            }

            if(index>=B.length) {
                bNotFinish = false;
            }


            int currentA = aNotFinish?Character.getNumericValue(A[index]):0;
            int currentB = bNotFinish?Character.getNumericValue(B[index]):0;

            if (currentA+currentB == 2) {
                if (carryFlag) {
                    result.append(1);
                } else {
                    result.append(0);
                }
                index++;
                carryFlag = true;
                continue;
            }

            if (carryFlag) {
                if (currentA+currentB + 1 == 2) {
                    carryFlag = true;
                    result.append(0);
                } else {
                    result.append(1);
                    carryFlag = false;
                }
            } else {
                result.append(currentA+currentB);
                carryFlag = false;
            }
            index++;

        }

        if(carryFlag) {
            result.append(1);
        }
        return result.reverse().toString();

    }
}
