package org.zgis.server.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



//数据库连接通用类
public class Common {
    public void lealone() throws Exception {
        String url = "jdbc:lealone:tcp://localhost:7210/lealone";
        Connection conn = DriverManager.getConnection(url, "root", "");
        Statement stmt = conn.createStatement();

        stmt.executeUpdate("CREATE TABLE IF NOT EXISTS test (f1 int primary key, f2 long)");
        stmt.executeUpdate("INSERT INTO test(f1, f2) VALUES(1, 1)");
        stmt.executeUpdate("UPDATE test SET f2 = 2 WHERE f1 = 1");
        ResultSet rs = stmt.executeQuery("SELECT * FROM test");
        while (rs.next()) {
            System.out.println("f1=" + rs.getInt(1) + " f2=" + rs.getLong(2));
            System.out.println();
        }
        rs.close();
        stmt.executeUpdate("DELETE FROM test WHERE f1 = 1");
        stmt.executeUpdate("DROP TABLE IF EXISTS test");
        stmt.close();
        conn.close();

    }
    //测试一下h2数据库的两种接法，一种文件方式，一种服务器方式
    //然后对比一下和lealone的区别，和其他数据库的区别
    //最后配合框架使用一下
    public void h2() throws Exception {
        String JDBC_DRIVER = "org.h2.Driver";
        String DB_URL = "jdbc:h2:file:D:\\project\\h2\\test";
        //String DB_URL = "jdbc:h2:tcp://localhost:9092/D:/project/h2/test";
        String USER = "sa";
        String PASS = "sa";
        Class.forName(JDBC_DRIVER);
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery("select * from test");
        while (rs.next()) {
            System.out.print(rs.getString(1));
            System.out.println(rs.getString(2));
        }
        rs.close();
        stmt.close();
        conn.close();
    }

    public static void main(String[] args) throws Exception {
        new Common().h2();
    }
}
