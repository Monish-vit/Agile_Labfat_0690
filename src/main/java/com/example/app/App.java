package com.example.app;
import java.util.Scanner;

class Voter {
    String name;
    int age;
    String citizenship;
    String voterId;
    boolean isIdValid;

    public Voter(String name, int age, String citizenship, String voterId, boolean isIdValid) {
        this.name = name;
        this.age = age;
        this.citizenship = citizenship;
        this.voterId = voterId;
        this.isIdValid = isIdValid;
    }

    public String checkEligibility() {
        if (age < 18) return "Ineligible: Underage (Must be 18+)";
        if (!citizenship.equalsIgnoreCase("Indian")) return "Ineligible: Not a citizen";
        if (!isIdValid) return "Ineligible: Invalid Voter ID";
        return "Eligible to Vote";
    }
}

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Voting Eligibility System");
        System.out.println("Monishwar - 23MIS0690");
        
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter citizenship: ");
        String citizen = sc.nextLine();
        System.out.print("Enter Voter ID: ");
        String vId = sc.nextLine();
        System.out.print("Is ID valid? (true/false): ");
        boolean isValid = sc.nextBoolean();

        Voter v = new Voter(name, age, citizen, vId, isValid);
        System.out.println("\nResult for " + v.name + ": " + v.checkEligibility());
    }
}
