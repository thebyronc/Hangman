import models.Hangman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Guest on 1/3/18.
 */
public class App {
    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[][] newGameData = Hangman.startGame();
//        System.out.println("Debugging newGameData" + Arrays.toString(newGameData[0]) + " " + Arrays.toString(newGameData[1]));
        String[][] inProgressGameData;
        try {
            System.out.println("Your word has " + newGameData[0].length + " letters. What is your first guess?");
            String userFirstInput = bufferedReader.readLine();
            inProgressGameData = Hangman.userInput(userFirstInput, newGameData);
//            System.out.println("Debugging" + Arrays.toString(inProgressGameData[0]) + " " + Arrays.toString(inProgressGameData[1]));
            while (true) {
                System.out.println("These are your remaining letters: " + Arrays.toString(inProgressGameData[1]));
                System.out.println("What is your next guess?");
                String userInput = bufferedReader.readLine();
                inProgressGameData = Hangman.userInput(userInput, inProgressGameData);
//                System.out.println("Debugging in while" + Arrays.toString(inProgressGameData[0]) + " " + Arrays.toString(inProgressGameData[1]));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
