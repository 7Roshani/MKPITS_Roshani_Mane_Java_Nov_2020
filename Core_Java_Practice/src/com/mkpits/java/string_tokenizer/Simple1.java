package com.mkpits.java.string_tokenizer;

import java.util.StringTokenizer;

public class Simple1 {
    public static void main(String args[]) {
        StringTokenizer st = new StringTokenizer("my .name .is .mayuri", ".");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }

}
