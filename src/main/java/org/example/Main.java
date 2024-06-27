package org.example;

import org.example.Shop.Book;
import org.example.Shop.Library;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    private static Library library = new Library();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Library Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book by Title");
            System.out.println("4. Search Book by Author");
            System.out.println("5. Search Book by Year");
            System.out.println("6. Search Book by ISBN");
            System.out.println("7. Display All Books");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    removeBook();
                    break;
                case 3:
                    searchBookByTitle();
                    break;
                case 4:
                    searchBookByAuthor();
                    break;
                case 5:
                    searchBookByYear();
                    break;
                case 6:
                    searchBookByIsbn();
                    break;
                case 7:
                    displayAllBooks();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addBook() {
        try {
            System.out.print("Enter title: ");
            String title = scanner.nextLine();
            System.out.print("Enter author: ");
            String author = scanner.nextLine();
            System.out.print("Enter year: ");
            int year = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter ISBN: ");
            String isbn = scanner.nextLine();

            Book book = new Book(title, author, year, isbn);
            library.addBook(book);
            System.out.println("Book added successfully.");
        } catch (Exception e) {
            System.out.println("Failed to add book. Please try again.");
        }
    }

    private static void removeBook() {
        try {
            System.out.print("Enter ISBN of the book to remove: ");
            String isbn = scanner.nextLine();

            if (library.removeBook(isbn)) {
                System.out.println("Book removed successfully.");
            } else {
                System.out.println("Book not found.");
            }
        } catch (Exception e) {
            System.out.println("Failed to remove book. Please try again.");
        }
    }

    private static void searchBookByTitle() {
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        List<Book> books = library.searchByTitle(title);
        displayBooks(books);
    }

    private static void searchBookByAuthor() {
        System.out.print("Enter author: ");
        String author = scanner.nextLine();
        List<Book> books = library.searchByAuthor(author);
        displayBooks(books);
    }

    private static void searchBookByYear() {
        System.out.print("Enter year: ");
        int year = Integer.parseInt(scanner.nextLine());
        List<Book> books = library.searchByYear(year);
        displayBooks(books);
    }

    private static void searchBookByIsbn() {
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();
        Optional<Book> book = library.searchByIsbn(isbn);
        book.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("Book not found.")
        );
    }

    private static void displayAllBooks() {
        List<Book> books = library.getAllBooks();
        displayBooks(books);
    }

    private static void displayBooks(List<Book> books) {
        if (books.isEmpty()) {
            System.out.println("No books found.");
        } else {
            books.forEach(System.out::println);
        }
    }
}

