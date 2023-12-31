package Package;

public class Book {

    private int id;
    private String name;
    private String author;
    private String publishingHouse;
    private int yearOfEdition;
    private int numberOfPages;
    private int price;

    public Book(int id, String name, String author, String publishingHouse, int yearOfEdition, int numberOfPages, int price){
        this.id = id;
        this.name = name;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.yearOfEdition = yearOfEdition;
        this.numberOfPages = numberOfPages;
        this.price = price;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getName(){
        return this.name;
    }

    public int getYearOfEdition(){
        return this.yearOfEdition;
    }

    @Override
    public String toString() {
        return "Package.Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", yearOfEdition=" + yearOfEdition +
                ", numberOfPages=" + numberOfPages +
                ", price=" + price +
                '}';
    }
}
