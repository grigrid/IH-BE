package Java.ClassAndObjects;

public class ClassObjects {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "JK Rowling", 54);
        Book book2 = new Book("Moby Dick", "Herman Melville", 378);
        
        System.out.println("The book " + book1.getTitle() + " is " + book1.getLength() + " pages long.");
        
        book2.BookDescription();


    }
    
}
