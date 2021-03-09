package com.mkpits.java.this_keyword;

public class book {
    //creating instance variable
    String bookname;

    //creating a constructor with parameters
    public book(String bookname) {
        this.bookname = bookname;
    }

    //creating a method display
    public void display() {
        System.out.println("bookname " + bookname);
    }
}

//creating a class
class thisex1 {
    public static void main(String[] arg) {
        book b1 = new book("java");
        b1.display();
    }
}
