public class Main3 {
    public static void main(String[] args) {

        Book[] books = new Book[3];

        Book Jaja = new Book(412, "Jaja", "Willy", "Houay", 2023, 100, 5);

        books[0] = Jaja;

        Book Gloo = new Book(646, "Gloo", "Jerry", "Houay" ,2022, 150, 7);

        books[1] = Gloo;

        Book Skiy = new Book(532, "Skiy", "Jerry", "Nox", 2024, 250, 10);

        books[2] = Skiy;

        Main3 object = new Main3();

        int namesOfAuthor = object.namesOfAuthor(books, "Jerry");
        System.out.println(" ");
        int publishedAfterSetYear = object.publishedAfterSetYear(books, 2022);





    }

    public int namesOfAuthor(Book[] books, String authorName){


        for(int a = 0; a<books.length; a++){
            if(books[a].getAuthor().equals(authorName)){
                System.out.println(books[a]);
            }
        }

        return 2;

    }

    public int publishedAfterSetYear(Book[] books, int year){
        for(int a=0; a< books.length; a++){
            if(books[a].getYearOfEdition()>year){
                System.out.println(books[a]);
            }
        }
        return 2;
    }





}
