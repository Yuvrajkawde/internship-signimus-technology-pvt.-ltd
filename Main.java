package com.enumm;

public class Main {
    public static void main(String[] args) {
        printAccessLevel(UserRole.ADMIN);
        printAccessLevel(UserRole.USER);
        printAccessLevel(UserRole.GUEST);
    }

    public static void printAccessLevel(UserRole role) {
        switch (role) {
            case ADMIN:
                System.out.println("ADMIN: Full access to all system features.");
                break;
            case USER:
                System.out.println("USER: Limited access to standard features.");
                break;
            case GUEST:
                System.out.println("GUEST: Read-only access.");
                break;
            default:
                System.out.println("Unknown role.");
        }
    }
}
