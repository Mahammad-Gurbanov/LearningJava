package az.edu.ada.learningJava.week11;

public class Book {
    String title;
    String author;
    int pageCount;

    public Book(String title, String author, int pageCounter){
        this.title = title;
        this.author = author;
        this.pageCounter = pageCounter;
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
}
