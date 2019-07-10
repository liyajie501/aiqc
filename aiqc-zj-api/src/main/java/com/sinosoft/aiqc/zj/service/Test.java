package com.sinosoft.aiqc.zj.service;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("a");
        strList.add("b");
        strList.add("c");
        strList.add("d");
        strList.add("e");
        strList.add("f");

        for(String str :strList){
            System.out.println("str: " + str);
        }

    }
}
