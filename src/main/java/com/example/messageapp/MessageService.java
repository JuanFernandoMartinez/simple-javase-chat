package com.example.messageapp;

import java.util.Scanner;

public class MessageService {

    final static Scanner scanner = new Scanner(System.in);

    public static void createMessage(){
        System.out.println("Type your message:\n");
        String message = scanner.nextLine();

        System.out.println("Type your name");
        String author = scanner.nextLine();

        Messages messages = new Messages();
        messages.setMessage(message);
        messages.setMessageAuthor(author);

        MessagesDAO.createMessageDB(messages);
    }

    public static void listMessages(){
        MessagesDAO.readMessages();
    }

    public static void deleteMessage(){
        System.out.println("Type id of message to delete");
        int id = Integer.parseInt(scanner.nextLine());
        MessagesDAO.deleteMessage(id);
    }

    public static void updateMessage(){
        System.out.println("Type id of message to update");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Write the new message");
        String  message = scanner.nextLine();

        Messages messages = new Messages();
        messages.setMessageId(id);
        messages.setMessage(message);

        MessagesDAO.updateMessage(messages);
    }
}
