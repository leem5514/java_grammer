package C07ExceptionFileParsing;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

// 파일 형식
// 1) text, json
// 2) json : 문자열로 이루어진 특수 형식 (key:Value)
// stream : 전송하는 흐름
public class C0702FileParsing {
    static BufferedWriter bw;
    public static void main(String[] args) throws IOException {
        // 콘솔에서 읽기 , io 패키지 사용
//        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
//        bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        String input = br1.readLine(); // 한줄 읽기
//        System.out.println(input);

//        // 파일에서 읽기
//        BufferedReader br2 = new BufferedReader(new FileReader("src/C07ExceptionFileParsing/test_file.txt"));
//        String line;
//        while ((line=br2.readLine()) != null) {
//            System.out.println(line);
//        }

//        // NIO 패키지를 사용한 파일 처리
//        Path filePath = Paths.get("src/C07ExceptionFileParsing/test_file.txt");
//        try {
//            // 문자열 통째로 Read
//            String st1 = Files.readString(filePath);
//            System.out.println(st1);
//
//            // 문자열 각 라인을 List 형태로 Read
//            List<String> st2 = Files.readAllLines(filePath);
//            for (String s : st2) {
//                System.out.println(s + "선수");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // 파일 쓰기
        // append(추가) , write(덮어쓰기)
        // create_new(생성)
        Path filePath = Paths.get("src/C07ExceptionFileParsing/test_file.txt");

        if(Files.exists(filePath)) {
            Files.write(filePath, "홍길동\n".getBytes(), StandardOpenOption.APPEND);
        } else {
            Files.write(filePath, "".getBytes(), StandardOpenOption.CREATE_NEW);
        }
    }
}
