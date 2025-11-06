package com.ll.c.oop2.pratice;

public class Book {
    String title;
    String author;
    int price;
    String isbn;

    public Book(String title, String author) {
        this(title, author, 0,null);
    }

    public Book(String title, String author, int price) {
        this(title, author, price, null);
    }

    public Book(String title, String author, int price, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    //    displayInfo(): 책 정보 출력
    public void displayInfo() {
        displayInfo(false);
    }

    //    displayInfo(boolean detailed): 상세 정보 여부에 따라 다르게 출력
    public void displayInfo(boolean detailed) {
        System.out.println(title + " - 저자: " + author + ", 가격: " + price + "원");
        if(detailed && isbn != null) {
            System.out.println(isbn);
        }
    }

    //    applyDiscount(int percent): 할인율 적용
    void applyDiscount(int percent) {
        price = price *(100-percent) / 100;
    }

    //    applyDiscount(int amount, boolean isPercent): 할인 금액/율 적용
    void applyDiscount(int amount, boolean isPercent) {
        if (isPercent) {
            applyDiscount(amount);
        } else {
            price -= amount;
        }
    }

    String getTitle() {
        return title;
    }

    String getAuthor() {
        return author;
    }

    int getPrice() {
        return price;
    }
}
