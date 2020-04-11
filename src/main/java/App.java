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

    public static void displayMessageForOne() {

        System.out.println("    AA  ##  ##\n" +
                "\tAA  ##  ##\n" +
                "\t1   2   3");
    }

    public static void displayMessageForTwo() {

        System.out.println("    ##  AA  ##\n" +
                "\t##  AA  ##\n" +
                "\t1   2   3");
    }

    public static void displayMessageForThree() {

        System.out.println("    ##  ##  AA\n" +
                "\t##  ##  AA\n" +
                "\t1   2   3");
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

        }else if (userInput == 1 && randomNumber != 1) {
            System.out.println("Ha! Fast Eddie wins again! The ace was card number "+randomNumber+".");
            displayMessageForOne();

        }else if (userInput == 2 && randomNumber != 2) {
            System.out.println("Ha! Fast Eddie wins again! The ace was card number " + randomNumber + ".");
            displayMessageForTwo();

        }else if (userInput == 3 && randomNumber != 3) {
            System.out.println("Ha! Fast Eddie wins again! The ace was card number " + randomNumber + ".");
            displayMessageForThree();
        }
        else {
            System.out.println("You did not enter the correct number");
        }
    }
}