public class Book implements Comparable<Book>{
    private String name;
    private String author;
    private int countOfPages;

    Book(String name, String author, int countOfPages){
        this.name = name;
        this.author = author;
        this.countOfPages = countOfPages;
    }




    @Override
    public int compareTo(Book book) {
        int differenceName = this.name.compareTo(book.name);
        int differenceAuthor = this.author.compareTo(book.author);
        int differencePages = this.countOfPages - book.countOfPages;

        if(differencePages != 0){
            return differencePages;
        }
        if(differenceName != 0){
            return differenceName;
        }

        return differenceAuthor;

    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", countOfPages=" + countOfPages +
                '}';
    }
}
