package az.edu.ada.learningJava.week11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Book {
    String title;
    String author;
    int pageCount;

    public Book(String title, String author, int pageCount){
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public String toString(){
        return String.format(
                "title: %s, author: %s, page count: %d",
                title, author, pageCount
                );
    }

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>(List.of(
                new Book("Chapter: Fire", "Abc", 100),
                new Book("A", "Abz", 123),
                new Book("The Sequel", "Xyz", 213),
                new Book("Life", "W", 700),
                new Book("The glasses", "C", 22),
                new Book("Chapter: Air", "Abc", 123)
        ));
        List<Book> duplicateBooks = new ArrayList<>(books);

        System.out.println("Sort list alphabetically by Author names");
        System.out.println("Using Lambdas");
        books.sort((b1, b2) -> (b1.getAuthor().compareTo(b2.getAuthor())));
        books.forEach(System.out::println);
        System.out.println("Using method reference");
        duplicateBooks.sort(Comparator.comparing(Book::getAuthor));
        duplicateBooks.forEach(System.out::println);

        System.out.println("Sort the pages in descending order");
        books.sort((b1, b2) -> (Integer.compare(
                b2.getPageCount(), b1.getPageCount()
        )));
        books.forEach(System.out::println);

        System.out.println("Use method references");
        duplicateBooks.sort(Comparator.comparingInt(Book::getPageCount)
                                      .reversed());
        duplicateBooks.forEach(System.out::println);

        System.out.println("Complex Sort");
        books.sort(Comparator.comparing(Book::getAuthor)
                             .thenComparing(Book::getTitle));
        books.forEach(System.out::println);
    }
}
