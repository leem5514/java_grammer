package C07ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

// 자바 객체 -> JSON : 직렬화
// JSON -> 자바 객체 : 역직렬화

// JSON 파일 read (NIO/IO 패키지) -> 문자열 Read -> 파식(역직렬화)
public class C0703JsonParsing1 {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper(); // ObjectMapper 객체 생성
        // readTree : JsonNode 트리구조로 객체 return : 유연함
        // readValue : 원하는 객체로 변환하여 return
        Path filePath = Paths.get("src/C07ExceptionFileParsing/test_data1.json");
        String jsonString = Files.readString(filePath);
        //System.out.println(jsonString);

        //readTree : JsonNode로 변환
        // 트리구조의 장점 유연함(자료의 복잡도가 증가할 때의 장점)
        JsonNode data1 = mapper.readTree(jsonString);
        Map<String, String> studentMap = new HashMap<>();
        studentMap.put("id", data1.get("id").asText());
        studentMap.put("name", data1.get("name").asText());
        studentMap.put("classNumber", data1.get("classNumber").asText());
        studentMap.put("city", data1.get("city").asText());
        System.out.println(studentMap);

        // readVaule : 바로 객체로 변환
        Map<String, String> studentMap2 = mapper.readValue(jsonString, Map.class);
        System.out.println(studentMap2);

        Student student3 = mapper.readValue(jsonString, Student.class);
        System.out.println(student3);
    }
}
// objectMapper 은 getter, setter 메서드 명을 통해서 필드값을 유추 (값 세팅은 아님.)
// 실제 값 셋팅은 reflection 이라는 기술을 통해서 변수값에 할당
class Student {
    private int id;
    private String name;
    private String classNumber;
    private String city;


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "이름은 " + this.name + " classNumber: " + this.classNumber + " city: " + this.city;
    }

}
