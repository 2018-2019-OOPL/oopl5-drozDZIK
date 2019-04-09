
package pl.edu.ur.oopl5.Bookstore;

public class Book {
    private String title;
    private String author;
    private int pages;
    private int year;
    double price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public void showData(){
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Year: " + year);
        System.out.println("Pages: " + pages);
        System.out.println("Price($): " + price);
        System.out.println(" " );
    }
    
    public static void main (String [] args){
    Book book1 = new Book();
    book1.setAuthor("Adam Kowalski");
    book1.setTitle("Podroze");
    book1.setYear(1990);
    book1.setPages(120);
    book1.setPrice(24.75);
    book1.showData();
    
    Book book2 = new Book();
    book2.setAuthor("Jan Niezbedny");
    book2.setTitle("LilPumpka");
    book2.setYear(2018);
    book2.setPages(78);
    book2.setPrice(32.78);
    book2.showData();
    
    Book book3 = new Book();
    book3.setAuthor("Tet");
    book3.setTitle("abc ...");
    book3.setYear(2019);
    book3.setPages(101);
    book3.setPrice(19.99);
    book3.showData();
    
    }
    
}
