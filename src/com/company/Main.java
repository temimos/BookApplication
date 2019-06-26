package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Book b= new Book();
        b.author=" Queen Temi";
        b.price= 25.99;
        b.description= " How to sleep in class";

        //print summary
        String message= b.summary();
        System.out.println(message);
        System.out.println(b.pricePlusShipping());
        System.out.println(b.priceSummary());;
    }
}
