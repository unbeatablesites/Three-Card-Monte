import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        displayMessage();
        selectRandomDeckOfCards();


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


    public static void selectRandomDeckOfCards(){

        Scanner scan = new Scanner(System.in);
        Random randomDeck = new Random();

        int randomNumber = 1 +randomDeck.nextInt(3);
        int userInput  = scan.nextInt();

        if(randomNumber == 1 && randomNumber == userInput){

            System.out.println("Working");

        }

        if(randomNumber == 2 && randomNumber == userInput){

            System.out.println("Working");

        }

        if(randomNumber == 3 && randomNumber == userInput){

            System.out.println("Working");

        }


    }
};
