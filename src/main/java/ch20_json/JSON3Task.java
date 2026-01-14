package ch20_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
@Data
class Book{
    long bookId;
    String title;
    String author;
    List<String> categories;
}

public class JSON3Task {
    public static void main(String[] args) {
        Book book1 = new Book(101,"자바 마스터","안선생", List.of("프로그래밍","컴퓨터공학"));
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        Gson gson = new Gson();
        String json1 = gsonBuilder.toJson(book1);
        System.out.println(json1);

        Map<String, Object> map = gson.fromJson(json1, Map.class);
        System.out.println("도서 제목: " + map.get("title"));

        Book book2 = new Book(102L, "파이썬 입문","김철수",List.of("데이터분석"));
        List<Book> bookList = List.of(book1, book2);

        String jsonArray = gsonBuilder.toJson(bookList);

        System.out.println(jsonArray);
    }
}
