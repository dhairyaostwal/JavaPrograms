interface Library {
  void issueBook(Book b);
  void retrieveBook(Book b);

  public class Book {

    int bookId;
    String bookName;
    int issueDate;
    int returnDate;
  }

  public class Sample {

    public void show() {
      System.out.println("Sample Class inside Interface");
    }
  }
}

public class ClassInsideInterface implements Library {

  public void issueBook(Book b) {
    System.out.println("Book Issued");
  }

  public void retrieveBook(Book b) {
    System.out.println("Book Retrieved");
  }

  public static void main(String args[]) {
    ClassInsideInterface obj = new ClassInsideInterface();
    obj.issueBook(new Library.Book());
    obj.retrieveBook(new Library.Book());
    Sample s = new Sample();
    s.show();
  }
}
