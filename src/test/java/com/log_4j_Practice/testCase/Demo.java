package com.log_4j_Practice.testCase;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Demo {

    private static Logger log = LogManager.getLogger(Demo.class.getName());

    public static void main(String[] args) {

        System.out.println("selcuk");



        if (5>4) {
            log.info("ture");
        }


    }
}
