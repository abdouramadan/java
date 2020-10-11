package com.company;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        UserProfile user = new UserProfile();
        user.welcomeMessage(input);
        System.out.println();
    }
}

class UserProfile {
    // Get user input's function
    public void logUserIn(Scanner input) {
        String name;
        String pass;

        System.out.println("Enter your name : ");
        name = input.next();
        System.out.println("Enter your pass : ");
        pass = input.next();

        login(name, pass);
    }

    // Welcome message
    public void welcomeMessage(Scanner input) {
        int choise;

        System.out.println("=======================================================================");
        System.out.println("=======================================================================");
        System.out.println("=== Welcome to your account please sign in or login to your account ===");
        System.out.println("=== (1) - Login");
        System.out.println("=== (2) - Signup");
        System.out.println("=== Enter (1) or (2) to continue ===");
        choise = input.nextInt();

        if(choise == 1) {
            logUserIn(input);
        } else if(choise == 2) {
            System.out.println("Signup");
        } else {
            System.out.println("Wrong choise");
        }

    }

    // Login user
    public static void login(String name, String pass) {
        Scanner input = new Scanner(System.in);
        int choise;

        System.out.println("Your details are : ");
        System.out.println("Username : " + name);
        System.out.println("Password  : " + pass);

        System.out.println("=======================================================================");
        System.out.println("=======================================================================");
        System.out.println("=== Update your account or logout ===");
        System.out.println("=== (1) - Update account");
        System.out.println("=== (2) - Logout");
        System.out.println("=== Enter (1) or (2) to continue ===");
        choise = input.nextInt();

        if(choise == 1) {
            updateUser();
        } else if(choise == 2) {
            logout();
        }
    }

    // Update user
    public static void updateUser() {
        Scanner input = new Scanner(System.in);

        String name, pass;

        System.out.println("Enter your name : ");
        name = input.next();
        System.out.println("Enter your pass : ");
        pass = input.next();

        login(name, pass);
    }

    // Logout
    public static int logout() {
        return 0;
    }
}
