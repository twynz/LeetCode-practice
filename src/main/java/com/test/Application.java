package com.test;

import com.test.leetcode.ReserverInteger;
import com.test.leetcode.ThreeSum;
import com.test.leetcode.TwoSum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements ApplicationRunner {

//    @Autowired
//    TwoSum easy;

//    @Autowired
//    ThreeSum threeSum;

    @Autowired
    ReserverInteger reserverInteger;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        int nums[] = {-1,0,1,2,-1,-4};
        //int target = 9;
        //easy.twoSum(nums,target);
       // threeSum.threeSum(nums);
        reserverInteger.reverse(-123);
    }

}
