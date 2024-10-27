package Library;

import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a genre out of 'Fiction', 'Non Fiction', 'Reference'");
        String genre = scanner.nextLine();
        if (genre == "Fiction" || genre == "Non Fiction" || genre == "Reference") {
            System.out.println("Insert the number of books");
            int amount = scanner.nextInt();
            if (amount >= 1) {
                for (int i = 0; i < amount; i++) {

                }
            } else {
                System.out.println("The number of book can not be less than 0 or more than 10 at the same time");
            }
        } else {
            System.out.println("Insert a right genre");
        }

        System.out.print("Insert a book's title: ");
        String title = scanner.nextLine();

        System.out.print("Insert a book's author: ");
        String author = scanner.nextLine();

        System.out.print("Insert a book's year of publication: ");
        int year = scanner.nextInt();

        FictionBook HarryPotter = new FictionBook(title, author, year);
        NonFictionBook StephenWolf = new NonFictionBook("Stephen Wold", "Herman Hesse", 1940);
        ReferenceBook ProgrammingReference = new ReferenceBook("Programming Reference", "Mark Twen", 2010);

        LibraryManager.addBook(HarryPotter);
        LibraryManager.addBook(StephenWolf);
        LibraryManager.addBook(ProgrammingReference);

        LibraryManager.listBooks();
    }
}
