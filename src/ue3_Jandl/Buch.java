package ue3_Jandl;

public class Buch {
    private String title;
    private String isbn;
    private String author;

    public Buch(String title, String isbn, String author) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Buch{" +
                "title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
