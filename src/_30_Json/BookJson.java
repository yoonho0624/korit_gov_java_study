package _30_Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

// Book 클래스 만들고 객체 생성
// isbn, title, author, price, publisher => String
// "978-1234567890", "자바의 정석", "남궁성", "38000", "도우출판"
// Book객체 => Json 문자열
// Json => Map
// Map => pretty Json
// Json => Book 객체
@AllArgsConstructor
@ToString
class Book {
    private String isbn;
    private String title;
    private String author;
    private String price;
    private String publisher;
}
public class BookJson {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();

        String bookJson;
        Book book1 = new Book("978-1234567890", "자바의 정석", "남궁성", "38000", "도우출판");
        bookJson = gson.toJson(book1);
        System.out.println(bookJson);

        Map<String, String> map1 = gson.fromJson(bookJson, Map.class);
        System.out.println(map1);
        String prettyJsonFromMap = gsonBuilder.toJson(map1);
        System.out.println(prettyJsonFromMap);
        Book book2 = gson.fromJson(bookJson, Book.class);
        System.out.println(book2);
    }
}
