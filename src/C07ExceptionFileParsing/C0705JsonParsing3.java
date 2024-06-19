package C07ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C0705JsonParsing3 {
    public static void main(String[] args) throws IOException, InterruptedException {
        // String에서는 RestTemplate을 통해서 HTTP 요청하고 Http 클라이언트가 자바에 내장된 http 클라이언트 사용.
        // 현 자바에서는 내장된
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .GET()
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        String posts = response.body();
//        System.out.println(posts);
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonList = objectMapper.readTree(posts);

        List<Post> postList = new ArrayList<>();

        for (JsonNode p: jsonList ){
            Post temppost = objectMapper.readValue(p.toString(), Post.class);
            postList.add(temppost);
        }
        // list<Post> 객체를 json으로 직렬화
        String postJson = objectMapper.writeValueAsString(postList);

        System.out.println(postList);

    }
}
class Post {
    private int userId;
    private int id;
    private String title;
    private String body;

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
    @Override
    public String toString() {
        return "\n\n[작성자: " + userId + ", id: " + id + "]\n제목: " + title + "\n내용: " + body;
    }
}
