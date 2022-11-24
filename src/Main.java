import models.Book;
import models.BorrowInfo;
import models.Student;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Viva La Vida",12003,"Daniel Green",2017);
        Book book2 = new Book("The Witches ",12976,"Roald Dahl",2019);
        Book book3 = new Book("The Art of War",12678,"Sun Tzu",2011);

        Student stu1 = new Student("Daniel Brown", 189037,11);
        Student stu2 = new Student("Pierre Gasly",19371,12);
        Student stu3 = new Student("Green Norris",19817,12);


        BorrowInfo b1 = new BorrowInfo(189037,11,"Daniel Brown");
        BorrowInfo b2 = new BorrowInfo(19371,5,"Pierre Gasly");
        BorrowInfo b3 = new BorrowInfo(19817,0,"Green Norris");

        book1.BookInfo();
        System.out.println("-------------------------------------------");
        stu2.Info();
        System.out.println("--------------------------------------------");
        b3.Fine();

    }
}