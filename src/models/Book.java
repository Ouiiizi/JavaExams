package models;

public class Book {

    String bookname;
    int BookISBN;

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public int getBookISBN() {
        return BookISBN;
    }

    public void setBookISBN(int bookISBN) {
        BookISBN = bookISBN;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    String Author;
    int Year;


    public Book(String bookname,int bookISBN, String Author, int year) {
        this.bookname = bookname;
        this.BookISBN = bookISBN;
        this.Author = Author;
        this.Year = year;
    }

    public void BookInfo(){
        System.out.println("Book Name : "+ this.bookname);
        System.out.println("Book ISBN: " + this.BookISBN);
        System.out.println("Book Published Year: " +this.Year);
        System.out.println("Author of The Book: " + this.Author);
    }
    }

