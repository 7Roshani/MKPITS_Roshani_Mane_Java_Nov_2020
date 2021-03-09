package com.mkpits.java.bookex;

class book {
    String bookname;
    String author;
    float price;

    //creating a method
    public void getbook() {
        bookname = "java";
        author = "ekta";
        price = 200.00f;

    }

    //overloading the method getbook
    public void getbook(String bn, String au, float pr) {
        bookname = bn;
        author = au;
        price = pr;
    }

    //overloading the method getbook
    public void getbook(String bn, float pr, String au) {
        bookname = bn;
        author = au;
        price = pr;
    }


    public void show() {
        System.out.println("bookname = " + bookname);
        System.out.println("author = " + author);
        System.out.println("price = " + price);
    }
}

class bookex {
    public static void main(String[] arg) {
        book b = new book(); // automatically it will call constructor without parameters
        System.out.println("\n");
        System.out.println("book 1 details");
        b.getbook();
        b.show();

        book b1 = new book();//constructor with 3 parameters
        System.out.println("\n");
        System.out.println("book 2 details");
        b1.getbook("oracle", "mayuri", 500.0f);
        b1.show();

        book b2 = new book();//constructor with 3 parameters
        System.out.println("\n");
        System.out.println("book 3 details");
        b2.getbook("oracle", 500.0f, "visual basic");
        b2.show();


    }
}