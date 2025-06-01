package com.example.messageapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MessagesDAO {


    public static void createMessageDB(Messages messages) {

        DBConnection connection = new DBConnection();

        try (Connection dbConn = connection.getConnection()) {

            PreparedStatement preparedStatement = null;

            try {
                String query = "insert into messages (mensaje, autor_mensaje) values (?,?)";
                preparedStatement = dbConn.prepareStatement(query);
                preparedStatement.setString(1, messages.getMessage());
                preparedStatement.setString(2, messages.getMessageAuthor());

                preparedStatement.executeUpdate();
                System.out.println("Message created Successfully");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void readMessages() {
        DBConnection connection = new DBConnection();

        try (Connection dbConn = connection.getConnection()) {

            PreparedStatement preparedStatement = null;
            ResultSet resultSet = null;


            String query = "Select * from messages";
            preparedStatement = dbConn.prepareStatement(query);


            resultSet = preparedStatement.executeQuery();


            while (resultSet.next()) {
                System.out.println("=================================");
                System.out.println("ID: " + resultSet.getInt("id_mensaje"));
                System.out.println("Mensaje: " + resultSet.getString("mensaje"));
                System.out.println("Author: " + resultSet.getString("autor_mensaje"));
                System.out.println("Fecha: " + resultSet.getString("fecha_mensaje"));
                System.out.println("=================================");


            }

        } catch (SQLException e) {
            System.out.println("Couldn't read messages");
            e.printStackTrace();
        }
    }


    public static void deleteMessage(int id) {
        DBConnection connection = new DBConnection();

        try (Connection dbConn = connection.getConnection()) {

            PreparedStatement preparedStatement = null;

            try {
                String query = "delete from messages where id_mensaje = ?";
                preparedStatement = dbConn.prepareStatement(query);
                preparedStatement.setInt(1, id );

                preparedStatement.executeUpdate();
                System.out.println("Message deleted Successfully");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void updateMessage( Messages messages) {
        DBConnection connection = new DBConnection();

        try (Connection dbConn = connection.getConnection()) {

            PreparedStatement preparedStatement = null;

            try {
                String query = "update messages set mensaje = ? where id_mensaje = ?";
                preparedStatement = dbConn.prepareStatement(query);
                preparedStatement.setString(1, messages.getMessage());
                preparedStatement.setInt(2, messages.getMessageId() );

                preparedStatement.executeUpdate();
                System.out.println("Message updated Successfully");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
