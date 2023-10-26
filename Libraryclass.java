import java.util.ArrayList;
import java.util.List;
class Book{
    String bookName;
    public Book(String bookName){
        this.bookName=bookName;
    }
    public String getBookName(){
        return bookName;
    }  
}
class Library{
    private List<Book>books;
    public Library(){
        books=new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added to the library: " + book.getBookName());
    }
    public void removeBook(Book book) {
        books.remove(book);
            System.out.println("Book removed from the library: " + book.getBookName());
    }
    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("The library is empty.");
        } 
        else {
            System.out.println("Library Books:");
            for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.println(book.getBookName());
            }
        }
    }
}
    public class Libraryclass {
        public static void main(String[]args){
            Library library=new Library();
            Book book1 = new Book("JAVA");
            Book book2 = new Book("HTML");
            Book book3 = new Book("PYTHON");
            library.addBook(book1);
            library.addBook(book2);
            library.addBook(book3);
            library.listBooks();
            library.removeBook(book3);
            library.listBooks(); 
        }     
    }



    