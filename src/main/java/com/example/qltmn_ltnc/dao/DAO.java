package com.example.qltmn_ltnc.dao;


import java.sql.Connection;
import java.sql.DriverManager;
public class DAO {
    public static Connection connection;

    public DAO(){
        if(connection == null){
            String dbUrl = "jdbc:sqlserver://127.0.0.1:1433;database=qltmn;user=sa;password=123456;trustservercertificate=true;connectTimeout=1;connection_limit=1000";
            try {
                connection = DriverManager.getConnection (dbUrl);
            }catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}
