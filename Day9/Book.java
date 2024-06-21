package Day9;

public class Book {
    final int isbn;
    String title;
    public Book(){
        isbn = 12866;
        title = "Java 9";
    }
    public Book(int isbn, String title) {
        super();
        this.isbn = isbn;
        this.title = title;
    }

    private void simplePrivateMethod(){
        System.out.println("This is Private Method");
    }

    public static void simpleStaticMethod()
    {
        System.out.println("This is a Private Method");
    }

    @MyAnno(priority = 1)
    public void simpleMethod(){
        System.out.println("This is public method");
    }

    public void setValue(int isbn, String title){
        System.out.println(new Book(isbn, title).toString());
    }


    @Override
    public String toString(){
        return "Book [isbn=" + isbn + ", title" + title + "]";
    }

}
