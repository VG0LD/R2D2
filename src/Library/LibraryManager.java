package Library;

import java.util.ArrayList;

public class LibraryManager {

    private static ArrayList<Book> library = new ArrayList<>();

    public static void addBook(Book book) {
        library.add(book);
    }

    public static void removeBook (Book book) {
        library.remove(book);
    }

    public static void listBooks() {
        for (Book books: library) {
            System.out.println("Title: " + books.getTitle());
            System.out.println("Author: " + books.getAuthor());
            System.out.println("Year: " + books.getYear());
            System.out.println(); // Пустая строка для разделения книг

        }
    }
}
