import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Book {
    String title;
    int year;

    Book(String title, int year) {
        this.title = title;
        this.year  = year;
    }

    @Override
    public String toString() {
        return title + ": " + year;
    }
}


public class Library {

   
    static class BookShelf implements Iterable<Book> {

        private List<Book> books = new ArrayList<>();
        private int minYear;

        BookShelf(int minYear) {
            this.minYear = minYear;
        }

        void addBook(Book b) {
            books.add(b);
        }

       
        @Override
        public Iterator<Book> iterator() {

         
            return new Iterator<Book>() {

                int index = 0;  
               
                private Book findNext() {
                    while (index < books.size()) {
                        Book b = books.get(index);
                        index++;
                        if (b.year > minYear) {
                            return b;   
                        }
                    }
                    return null;       
                }

                Book next = findNext(); 

                @Override
                public boolean hasNext() {
                    return next != null;
                }

                @Override
                public Book next() {
                    Book result = next;  
                    next = findNext();   
                    return result;
                }
            };
        }
    }

   
    public static void main(String[] args) {

        BookShelf shelf = new BookShelf(2000); 

        shelf.addBook(new Book("Old Tales",  1985)); 
        shelf.addBook(new Book("Suun Zam",   2020)); 
        shelf.addBook(new Book("Dark Sky",   1999)); 
        shelf.addBook(new Book("New Stories",2015)); 

        for (Book b : shelf) {
            System.out.println(b);
        }
       
    }
}