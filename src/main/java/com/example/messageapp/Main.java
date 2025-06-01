package com.example.messageapp;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        DBConnection connection = new DBConnection();

        try(Connection cnn = connection.getConnection()) {


        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
