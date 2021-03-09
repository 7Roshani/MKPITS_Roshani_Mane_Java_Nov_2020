package com.mkpits.java.obj_class;

class parent {

}

class tob extends parent {
    public static void main(String[] args) {
        parent t = new tob();
        Object obj = t.getClass();
        System.out.println("obj = " + obj);
    }
}
