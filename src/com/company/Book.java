package com.company;

public class Book {
    public String author;
    public String title;
    public double price;
    public String description;
    public String isbn;


    public String summary()
    {
        return author +" wrote a book about " + description;
    }
   public double pricePlusShipping()
   {
       double result= price + 5.0;
       return result;
   }
public String priceSummary()
{
    return " book cost" + (price +5.0);
}
}
