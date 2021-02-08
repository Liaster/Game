import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String again;
        int playerNum, computerNum;
        Random rand = new Random();
        do {
            computerNum = rand.nextInt(99) + 1;

            do {
                System.out.println("Please pick a number between 1 and 100.");
                playerNum = scan.nextInt();
                scan.nextLine();
                if (playerNum < computerNum) {
                    System.out.println("Higher");
                } else if (playerNum > computerNum) {
                    System.out.println("Lower");
                } else {
                    System.out.println("Correct");
                }
            } while (computerNum != playerNum);

            System.out.println("You won!");
            System.out.println("Would you like to play again? Enter Y or N");
            again = scan.nextLine();
            System.out.println(again);

        }while(again.equalsIgnoreCase("y"));
        System.out.println("Thanks for playing!");
    }

}
