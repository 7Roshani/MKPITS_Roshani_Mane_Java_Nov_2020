package com.mkpits.java.static_nested;

public class TestOuter1Inner {
    TestOuter1Inner(){}
    void msg(){
        System.out.println((new StringBuilder()).append("data is ")
                .append(TestOuter1.data).toString());
    }

}
