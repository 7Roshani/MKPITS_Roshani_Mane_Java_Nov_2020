package com.mkpiots.java.methodoverloading_promotionnoag;

//Output will be:- Compile Time Error, because  ne type is not de-promoted implicitly for example double cannot be depromoted to any type implicitly.

public class OverloadingCalculation3 {
    void sum(int a, long b) {
        System.out.println("a method invoked");
    }

    void sum(long a, int b) {
        System.out.println("b method invoked");
    }

    public static void main(String args[]) {
        OverloadingCalculation3 obj = new OverloadingCalculation3();
        obj.sum(20, 20);//now ambiguity
    }

}
