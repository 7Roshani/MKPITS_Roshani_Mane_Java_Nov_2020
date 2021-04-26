package com.mkpits.java.constructor;

class book {
    String bookname;
    String author;
    float price;

    //creating a blank constructor
    public book() {
        bookname = "java";
        author = "ekta";
        price = 200.00f;
    }

    public void show() {
        System.out.println("bookname = " + bookname);
        System.out.println("author = " + author);
        System.out.println("price = " + price);
    }
}

class bookex {
    public static void main(String[] arg) {
        book b = new book(); // automatically it will call constructor
        b.show();


    }
}