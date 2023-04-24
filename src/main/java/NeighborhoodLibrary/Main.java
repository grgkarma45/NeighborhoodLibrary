package NeighborhoodLibrary;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Invite the user to buy something
        System.out.println("Hello! Welcome to my store. Would you like to purchase something");
        while (true) {
            // Read in the user's response
            String userResponse = scanner.nextLine();
            if (userResponse.equals("yes")) {
                System.out.println("Great! Here are the list of items available");
            } else if (userResponse.equals("no")) {
                System.out.println("Thanks for stopping by!");
                return;
            }
        }
    }
}
