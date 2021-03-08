package com.mkpits.java.finalvariable;

class sample {
    public final int roi = 12;
}

class stest {

    public static void main(String[] arg) {
        sample s = new sample();
        System.out.println("roi = " + s.roi);
        // s.roi=14; error will come since roi is declared as final

    }
}
