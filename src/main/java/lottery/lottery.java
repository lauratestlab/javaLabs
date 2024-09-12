package lottery;

import java.util.Arrays;

import java.util.Scanner;


public class lottery {

    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {


        System.out.println("Enter your first and last name");

        String name = scanner.nextLine();

        System.out.println("Enter the month you were born in MM format");
        int month = scanner.nextInt();

        System.out.println("Enter the day you were born in DD format");
        int day = scanner.nextInt();

        System.out.println("Enter the year you were born in YYYY format");
        int year = scanner.nextInt();
        if (year <= 2006) {
            System.out.println("Let's play, enter your numbers");

        } else {

            System.out.println("You are not old enough");
            System.exit(0);
//      Used to end/ break the code when there is no loop

        }
        String userInput;

        do {
            System.out.println("Options: (A) Pick numbers (B) Lucky dip (C) Exit");
            System.out.println("Please enter your choice");
            Scanner scanner = new Scanner(System.in);
            userInput = scanner.nextLine();


            switch (userInput.toUpperCase()) {
                case "A":
                    createTicket();
                    break;
                case "B":
                    createRadnomTicket();
//                case "C":
//                    System.exit(0);
                default:
                    System.out.println("Invaild option. Please choose again.");
            }
        } while (!userInput.equals("C"));

    }

    public static boolean createRadnomTicket() {
        boolean dupe = false;
        int help = 0;
        int luckyDip = (int) (Math.random() * 49 + 1);
        int[] winnerNumbers = {2, 7, 10, 12, 49, 33};
        int[] ticket = new int[6];
        System.out.println("Time for the Lucky Dip");
        for (int a = 0; a < 6; a++) {
            luckyDip = (int) (Math.random() * 49 + 1);
            ticket[a] = luckyDip;
        }
        for (int i = 0; i < ticket.length; i++) {
            for (int j = 0; j < ticket.length; j++) {
                if (ticket[i] == winnerNumbers[j]) {
                    help++;
                    System.out.println(help);
                }

            }
        }
        if (help <= 1) {
            System.out.println("no prize");
        } else if (help == 2) {
            System.out.println("Prize is $1");
        } else if (help == 3) {
            System.out.println("Prize is $2");
        } else if (help == 4) {
            System.out.println("Prize is 4");
        } else if (help == 5) {
            System.out.println("Prize is $8");
        } else if (help == 6) {
            System.out.println("Jack Pot!");
        }
        System.out.println(Arrays.toString(ticket));

        System.out.println("Winning numbers");
        System.out.println(Arrays.toString(winnerNumbers));
        return dupe;

    }


    public static boolean createTicket() {
        boolean dupe = false;
        int work = 0;
        int[] winningTicket = {2, 7, 10, 12, 49, 33};
        int[] ticket = new int[6];
        for (int i = 0; i < ticket.length; i++) {
            System.out.println("Enter your numbers");
            ticket[i] = scanner.nextInt();

        }

        for (int j = 0; j < ticket.length; j++) {
            for (int i = 0; i < ticket.length; i++) {
                if (ticket[j] == winningTicket[i]) {
                    work++;
                    System.out.println(work);
                }
            }
        }
        if (work <= 1) {
            System.out.println("no prize");
        } else if (work == 2) {
            System.out.println("Prize is $1");
        } else if (work == 3) {
            System.out.println("Prize is $2");
        } else if (work == 4) {
            System.out.println("Prize is 4");
        } else if (work == 5) {
            System.out.println("Prize is $8");
        } else if (work == 6) {
            System.out.println("Jack Pot!");

        }
        System.out.println("Ticket");
        System.out.println(Arrays.toString(ticket));
        System.out.println("Winning numbers");
        System.out.println(Arrays.toString(winningTicket));


        return dupe;

    }

}









