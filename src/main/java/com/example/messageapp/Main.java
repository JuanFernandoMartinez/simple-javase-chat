package com.example.messageapp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int option = 0;

        do {

            System.out.println("==============================");
            System.out.println("    Message Application");
            System.out.println("==============================");
            System.out.println(" 1. Create Message");
            System.out.println(" 2. List Messages");
            System.out.println(" 3. Edit Message");
            System.out.println(" 4. Delete Message");
            System.out.println(" 5. Exit");
            System.out.println("==============================");


            option = scanner.nextInt();

            switch (option) {
                case 1:
                    MessageService.createMessage();
                    break;
                case 2:
                    MessageService.listMessages();
                    break;
                case 3:
                    MessageService.updateMessage();
                    break;
                case 4:
                    MessageService.deleteMessage();
                    break;
                case 5:
                    System.out.println("Thank you for using the program");
                    break;
                default:
                    break;
            }

        } while (option != 5);


        scanner.close();
    }

}
