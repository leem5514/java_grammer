package C09NetWorking;

import java.io.IOException;
import java.sql.*;

public class C0903DatabaseConnect {
    public static void main(String[] args) throws SQLException {
        // mysql 드라이버 필요
        String url = "jdbc:mysql://localhost:3306/board1?useSSL=false"; // userSSL = false : 보안처리 안하겠다는 의미
        String userName = "root";
        String password = "1234";
        Connection con = DriverManager.getConnection(url, userName, password);

        System.out.println("db 연결 석세스");
        Statement stmt = con.createStatement();
        String myQuery = "SELECT * FROM post";
        ResultSet rs = stmt.executeQuery(myQuery);
        int id = 0;
        String title = "";
        while (rs.next()) {
            id = rs.getInt("id");
            title = rs.getString("title");
            System.out.println("id는 " + id + " title은 " + title);
        }
    }
}
