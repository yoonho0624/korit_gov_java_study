package _24_Builder.Book;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book.Builder()
                .bookId(123)
                //.title("asd")
                .author("dfsad")
                .isbn("dsa")
                .build();
        System.out.println(book);
    }
}
