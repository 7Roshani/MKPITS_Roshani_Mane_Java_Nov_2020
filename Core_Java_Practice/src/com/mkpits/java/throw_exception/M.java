package com.mkpits.java.throw_exception;

import java.io.IOException;

public class M {
    void method()throws IOException {
        throw new IOException("device error");
    }

}
