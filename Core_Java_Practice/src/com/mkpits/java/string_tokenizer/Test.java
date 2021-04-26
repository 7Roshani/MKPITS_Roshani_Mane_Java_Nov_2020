package com.mkpits.java.string_tokenizer;

import java.util.StringTokenizer;

public class Test {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("my,name,is,khan");

        // printing next token
        System.out.println("Next token is : " + st.nextToken(","));
    }

}
