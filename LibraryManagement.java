import java.util.ArrayList;
import java.util.LinkedList;

public class LibraryManagement {
    public static void main(String[] args) {

        // Store all books in ArrayList
        ArrayList<String> books = new ArrayList<>();

        books.add("Java");
        books.add("Python");
        books.add("C");
        books.add("Data Structures");
        books.add("Operating System");

        // Store issued books in LinkedList
        LinkedList<String> issuedBooks = new LinkedList<>();

        issuedBooks.add("Java");
        issuedBooks.add("Python");

        // Display library books
        System.out.println("Books in Library:");
        System.out.println(books);

        // Display issued books
        System.out.println("\nIssued Books:");
        System.out.println(issuedBooks);

        // Issue one new book
        String newIssue = "C";
        if (books.contains(newIssue) && !issuedBooks.contains(newIssue)) {
            issuedBooks.add(newIssue);
            System.out.println("\nBook Issued: " + newIssue);
        } else {
            System.out.println("\nBook cannot be issued.");
        }

        // Return one issued book
        String returnBook = "Python";
        if (issuedBooks.remove(returnBook)) {
            System.out.println("Book Returned: " + returnBook);
        } else {
            System.out.println("Book was not issued.");
        }

        // Check whether a particular book exists
        String searchBook = "Operating System";

        if (books.contains(searchBook)) {
            System.out.println(searchBook + " exists in the library.");
        } else {
            System.out.println(searchBook + " does not exist in the library.");
        }

        // Final Lists
        System.out.println("\nFinal Library Books:");
        System.out.println(books);

        System.out.println("\nFinal Issued Books:");
        System.out.println(issuedBooks);
    }
}