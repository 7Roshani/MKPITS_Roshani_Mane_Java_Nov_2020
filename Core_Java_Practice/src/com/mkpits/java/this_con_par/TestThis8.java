package com.mkpits.java.this_con_par;

public class TestThis8 {
    public static void main(String args[]) {
        Student s1 = new Student(111, "ankit", "java");
        Student s2 = new Student(112, "sumit", "java", 6000f);
        s1.display();
        s2.display();
    }

}
