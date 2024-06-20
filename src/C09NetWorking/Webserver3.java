package C09NetWorking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.sql.*;

public class Webserver3 {
    public static void main(String[] args) throws SQLException, IOException {
        ServerSocket serverSocket = new ServerSocket(8081);
        System.out.println("8081 서비스 시작");
        String url = "jdbc:mysql://localhost:3306/board1?useSSL=false"; // userSSL = false : 보안처리 안하겠다는 의미
        String userName = "root";
        String password = "1234";
        Connection con = DriverManager.getConnection(url, userName, password);
        System.out.println("db 연결 석세스");
        while (true) {
            // accept : 클라이언트에 연결 요청을 수락
            Socket socket = serverSocket.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null && !line.isEmpty()) {
                sb.append(line + "\n");
            }
            String requestString = sb.toString();
            String firstLine = requestString.split("\n")[0];
            String infos = firstLine.split(" ")[1];
            int id = 0;
            String name = "";
            String email = "";

            if(infos.contains("?")) {
                String st1 = infos.split("\\?")[1];
                String[] stArr = st1.split("&");
                for(String s : stArr) {
                    String[] keyValue = s.split("=");
                    if(keyValue[0].equals("id")) {
                        id=Integer.parseInt(keyValue[1]);
                    }
                    if(keyValue[0].equals("name")) {
                        name=keyValue[1];
                    }
                    if(keyValue[0].equals("email")) {
                        email = keyValue[1];
                    }
                }
            }
            Statement stmt = con.createStatement();
            String myQuery = "SELECT * FROM author Where id='"+ id +"' OR name ='"+ name +"' OR email ='"+ email +"';";

            ResultSet rs = stmt.executeQuery(myQuery);
            while (rs.next()) {

                id = rs.getInt("id");
                name = rs.getString("name");
                email = rs.getString("email");
                System.out.println("id는 " + id + " name " + name + " email " + email + " password " + password);
            }


            String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + "hello world";
            // UTF-8 문자열로 RETURN
            socket.getOutputStream().write(httpResponse.getBytes(StandardCharsets.UTF_8));
            // 플러시란 일반적으로 변경사항을 확정(반영) 하는 것
            socket.getOutputStream().flush();
            socket.close();
        }

    }
}
