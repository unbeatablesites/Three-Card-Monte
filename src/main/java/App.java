import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        displayMessage();

        selectRandomDeckOfCards();

        System.out.println(selectionFromUser());
    }


    public static void displayMessage(){

        System.out.println("You slide up to Fast Eddie's card table and plop down your cash.\n" +
                "He glances at you out of the corner of his eye and starts shuffling.\n" +
                "He lays down three cards.\n" +
                "\n" +
                "Which one is the ace?\n" +
                "\n" +
                "\t##  ##  ##\n" +
                "\t##  ##  ##\n" +
                "\t1   2   3");
    }

    public static int selectionFromUser(){

        Scanner scan = new Scanner(System.in);

        int userInput  = scan.nextInt();

        return userInput;

    }

    public static void selectRandomDeckOfCards(){

        Random randomDeck = new Random();
        int randomNumber;

       for(int i = 0; i < 20; i++){
           System.out.println(randomNumber = 1 +randomDeck.nextInt(5));
       }
        System.out.println("Done");
    }
};
