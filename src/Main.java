import java.util.Scanner;
/**
 * The main method that runs the game.
 * It prompts the user to guess a randomly generated number.
 * The program will tell the user if the guess is too large, too small, or correct.
 * When the user guesses correctly, the game will end and display the correct number.
 *
 */
public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        //MINI PROJECT
        final int myNumber = (int)(Math.random()*100);

        int userNumber = 0;


        do {

            System.out.println("Guess my number(1-100) : ");

            userNumber = sc.nextInt();

            if(userNumber == myNumber) {
                System.out.println("WOOHOO .. CORRECT NUMBER!!!");
                break;
            }
            else if(userNumber > myNumber) {
                System.out.println("your number is too large");
            } else {
                System.out.println("your number is too small");
            }

        } while(userNumber >= 0);


        System.out.print("My number was : ");

        System.out.println(myNumber);
        sc.close();
    }

}

