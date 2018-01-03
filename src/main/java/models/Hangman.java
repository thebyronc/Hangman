package models;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by Guest on 1/3/18.
 */
public class Hangman {
    public Integer turn = 0;
    public static String pickRandomWord(){
        String[] wordList = {"Apple", "Orange", "Banana", "Potato"};
        Random myRandomGenerator = new Random();
        Integer randomPick = myRandomGenerator.nextInt(wordList.length);
        return wordList[randomPick];
    }
    public static String[] splitWord() {
        String randomWord = pickRandomWord();
        String[] wordSplit = randomWord.split("");
        return wordSplit;
    }
    public static String[][] guessArray() {
        String[] splitWord = splitWord();
        String[] guessArray = splitWord.clone();
        String[] turnForThisWord = {Integer.toString(splitWord.length)};
        for (int i = 0; i < guessArray.length; i++){
            guessArray[i] = "_";
        }
        String[][] gameArray = {splitWord, guessArray, turnForThisWord};
        return gameArray;
    }
    public static String[][] startGame(){
        String[][] gameArray = guessArray();
        return gameArray;
    }
    public static String[][] userInput(String userInput, String[][] gameData) {
        for (int i = 0; i < gameData[0].length; i++){
            if(userInput.equalsIgnoreCase(gameData[0][i])) {
                gameData[1][i] = userInput;
            }
        }
        return gameData;
    }
//    public static boolean checkWin(String[][] gameData){
//        boolean gameOn;
//        if(turn >= gameData[1].length) {
//            gameOn = false;
//        }
//        return gameOn;
//    }
}
