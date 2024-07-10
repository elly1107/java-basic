package construct.ex;

public class BookMain {
    public static void main(String[] args){
        Book book1=new Book();
        book1.displayInfo();

        Book book2=new Book("1", "1");
        book2.displayInfo();

        Book book3 = new Book("2", "2",2);
        book3.displayInfo();


    }
}
