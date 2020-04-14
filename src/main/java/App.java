import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        displayMessage();
        selectRandomDeckOfCards();


    }


    public static void displayMessage() {

        System.out.println("You slide up to Fast Eddie's card table and plop down your cash.\n" +
                "He glances at you out of the corner of his eye and starts shuffling.\n" +
                "He lays down three cards.\n" +
                "\n" +
                "Which one is the ace?\n" +
                "\n" +
                "\t##  ##  ##\n" +
                "\t##  ##  ##\n" +
                "\t1   2   3\n" + "Enter selection here  ++++++>");
    }

    public static int displayMessageForOne() {

        System.out.println("    AA  ##  ##\n" +
                "\tAA  ##  ##\n" +
                "\t1   2   3");
        return 1;
    }

    public static int displayMessageForTwo() {

        System.out.println("    ##  AA  ##\n" +
                "\t##  AA  ##\n" +
                "\t1   2   3");
        return 2;
    }

    public static int displayMessageForThree() {

        System.out.println("    ##  ##  AA\n" +
                "\t##  ##  AA\n" +
                "\t1   2   3");
        return 3;
    }


    public static void selectRandomDeckOfCards() {

        Scanner scan = new Scanner(System.in);
        Random randomDeck = new Random();

        int randomNumber = 1 + randomDeck.nextInt(3);
        int userInput = scan.nextInt();

        if (userInput == 1 && randomNumber == 1) {
            System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
            displayMessageForOne();

        } else if (userInput == 2 && randomNumber == 2) {
            System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
            displayMessageForTwo();

        } else if (userInput == 3 && randomNumber == 3) {
            System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
            displayMessageForThree();
        }else {
            System.out.println("You did not enter the correct number");



        if (randomNumber != userInput && randomNumber == 1) {
            System.out.println("Ha! Fast Eddie wins again! The ace was card number 3.\n");
            displayMessageForOne();
        } else if (randomNumber != userInput && randomNumber == 2) {
            System.out.println("Ha! Fast Eddie wins again! The ace was card number 3.\n");
            displayMessageForTwo();
        } else if (randomNumber != userInput && randomNumber == 3) {
            System.out.println("Ha! Fast Eddie wins again! The ace was card number 3.\n");
            displayMessageForThree();
        } else {
            System.out.println("Something broke");
            }
        }
    }
}

// Working