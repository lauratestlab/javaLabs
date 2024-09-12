package calculatorgame;

import java.util.Scanner;


record Player(String name, int age) {
}

// record is a special type of class that contain information that is not executable
record Highscore(Player name, int score) {
}

//In this record include the name of the previous record Player and type name
//Because I already created the record for player
public class calculatorgame {

    public static void main(String[] args) {

        Player moon = createPlayer();
//        The moon is a variable that will print the class Player
//        The class Player contains the method for createPlayer
//        The return statement will be a new player, Ex: Player [name=(name enter, age(age entered)
        System.out.println(moon);


        boolean qestion = addQuestion(2, 2);
        addQuiz(5);

//        boolean answer = moduloQuestion(1,4);
//        moduloQuiz(100);
    }

    public static Player createPlayer() {

        Scanner scanner = new Scanner(System.in);
//        This will enable the scanner to work
        System.out.println("What is your name");
//        This will print the line what is your name and ask you to write a name
        String name = scanner.nextLine();
//        This will print the name you write inside the record player

        System.out.println(("How old are you?"));
//        This will print the age you write inside the record player
        int age = scanner.nextInt();
//         This will print the age you write inside the record player

        Player player = new Player(name, age);
//          This is the new player that will be printed when all of the information is captured
//          This is contained by the return type Player that contains the method of createPlayer

        return player;


    }

    public static boolean addQuestion(int a, int b) {
//        System.out.println("[start addQuesrtoin]");
//        used to check work
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is 2+2=");
        int userEntery = scanner.nextInt();
        boolean yes = true;
        int result = a + b;

        if (result != userEntery) {
            yes = false;
//      Created a condition used with the is statement that means if userEntery not equal
//      the results
        }
        System.out.println(yes);

//        System.out.println("[end addQuesrtoin]");
//        used to check work
        return yes;
    }
    public static int addQuiz(int length) {

        boolean answer = addQuestion(5, 3);
        int score = 0;
        for (int i = 0; i < length; i++) {
            if (answer) {
                score++;
            }
        }
        System.out.println(score);
        return score;


    }
//    public static int moduloQuiz(int length) {
//        boolean answer = addQuestion(4, 5);
//        Scanner scanner = new Scanner(System.in);
//        int score = 0;
//        for (int i = 0; i < length; i++) {
//            if (answer) {
//                score++;

    }






