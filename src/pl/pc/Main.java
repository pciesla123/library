package pl.pc;

import java.util.Scanner;

public class Main {

    private static Book[] listOfBooks = new Book[100];

    private static Scanner scan = new Scanner(System.in);

    //metoda tworząca książki i wypełniająca tablicę
    private static void initialize() {

        Book bookOne = new Book();
        bookOne.setAuthor("Adam Mickiewicz");
        bookOne.setTitle("Dziady");
        bookOne.setType(BookType.HORROR);
        bookOne.setNumberOfPages(150);

        Book bookTwo = new Book("Bajki Robotów", "Stanisław Lem", 200, BookType.SCIENCE_FICTION);
        Book bookThree = new Book("Wiedźmin", "Andrzej Sapkowski", 300, BookType.FANTASY);
        Book bookFour = new Book("Morderstwo w Orient Ekspresie", "Agatha Christie", 280, BookType.CRIME_STORY);

        listOfBooks[0] = bookOne;
        listOfBooks[1] = bookTwo;
        listOfBooks[2] = bookThree;
        listOfBooks[3] = bookFour;
    }

    //menu główne
    private static void action() {
        initialize();

        System.out.println(libraryHello);

        do {
            System.out.println("Wybierz operację: ");
            System.out.println("1. Wyświetl wszystkie książki");
            System.out.println("2. Wyszukaj");
            System.out.println("0. Wyjście");

            String choice = scan.nextLine();

            switch (choice) {
                case "1":
                    displayAllBooks();
                    break;
                case "2":
                    search();
                    break;
                case "0":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Podano złą operację");
            }
        } while (true);
    }

    //metoda wyświetlająca wszystkie książki
    private static void displayAllBooks() {
        for (int i = 0; i < listOfBooks.length; i++) {
            Book currentBook = listOfBooks[i];

            if (currentBook == null) {
                break;
            }

            System.out.println((i + 1) + ". " + currentBook.getAuthor() + " - " + currentBook.getTitle());
        }
    }

    //menu wyszukiwania
    private static void search() {
        System.out.println("Wybierz opcję:");
        System.out.println("1. Szukaj po gatunku");
        System.out.println("2. Szukaj po tytule");
        System.out.println("3. Szukaj po autorze");
        System.out.println("0. Wróć");

        String choice = scan.nextLine();

        switch (choice) {
            case "1":
                System.out.println("nie jest jeszcze obsługiwane");
                break;
            case "2":
                searchByTitle();
                break;
            case "3":
                System.out.println("nie jest jeszcze obsługiwane");
                break;
            case "0":
                break;
            default:
                System.out.println("zła operacja");
        }
    }

    private static void searchByTitle() {

        System.out.println("Podaj tytuł");
        String searchTitle = scan.nextLine();
        for (int i = 0, j = 0; i < listOfBooks.length; i++) {
            Book curBook = listOfBooks[i];
            if (curBook != null) {
                if (curBook.getTitle().equalsIgnoreCase(searchTitle)) {
                    System.out.println("Znaleziony tytuł: " + curBook.getTitle());
                    j++;
                }
            }

            if (i == listOfBooks.length - 1 && j == 0) {
                System.out.println("nie znaleziono książki");
            }

        }

    }

    public static void main(String[] args) {
        action();
    }

    private static String libraryHello =
            "  _  ___  _     ___  _ ___ _         \n" +
                    " |_)  |  |_) |   |  / \\ | |_ |/  /\\  \n" +
                    " |_) _|_ |_) |_ _|_ \\_/ | |_ |\\ /--\\ \n" +
                    "                                     ";
}
