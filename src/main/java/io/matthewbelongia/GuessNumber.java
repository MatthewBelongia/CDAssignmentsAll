package io.matthewbelongia;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by matthewb on 4/28/16.
 */
public class GuessNumber {

    int guess = 101;
    int previousGuess = 101;
    static int countGuesses = 0;
    int magicNumber = 0;
    boolean magicNumberGuessed = false;
    boolean previousGuessBool = false;

        /** Game that asks a User to guess a number between 1 and 100, it gives 10 chances to get the right answer and alerts
        then when it is too high or too low. It does not remove a guess chance if they guess the same number consecutively
         */
        public Boolean wasMagicNumberGuessed() {
            return magicNumberGuessed;
        }

        public int increaseCountGuesses(){
            return countGuesses++;
        }

        //Generates Number 1-100
        public int generateMagicNumber() {
            Random rand = new Random();
            magicNumber = rand.nextInt(100);
            return magicNumber;

        }
        // Sets Previous Guess equal to most recent guess
        public int setPreviousGuesstoGuess(int guessInt) {
             return previousGuess = guessInt + 0;
        }
        //Ask User for a integer
        public void askForGuess() {
            System.out.println("Guess a Number 0-100");
            Scanner guessedNum = new Scanner(System.in);
            String input = guessedNum.next();
            if(input.matches("\\d+")) {
                if(input.length() > 10){
                    System.out.println("Please type a smaller number");
                    askForGuess();
                }
                else {
                    guess = Integer.parseInt(input);
                }
            }
            else{
                System.out.println("Please type a number");
                askForGuess();
            }
        }
        //Checks to see if most recent guess is higher than the magicNumber
        public Boolean checkIfGuessIsTooHigh(int guessInt,int magicNumberInt) {
            if(guessInt > magicNumberInt) {
                increaseCountGuesses();
                System.out.println("Guess too large");
                return true;
            }
            else{
                increaseCountGuesses();
                System.out.println("Guess too low");
                return false;
            }
        }
        //Check if Guess is equal previousGuess
        public Boolean checkIfGuessWasJustGuessed(int guessInt,int previousGuessInt) {
            if(guessInt == previousGuessInt){
                setPreviousGuesstoGuess(guessInt);
                System.out.println("Already Guessed");
                return previousGuessBool = true;
            }
            else {
                setPreviousGuesstoGuess(guess);
                return previousGuessBool = false;
            }
        }
        //Checks if current guess is equal to the magic number
        public Boolean checkIfGuessIsMagicNumber(int guessInt, int magicNumberInt) {
            if (guessInt == magicNumberInt) {
                increaseCountGuesses();
                System.out.println("Correct!");
                return magicNumberGuessed = true;
            } else {
                return magicNumberGuessed = false;
            }
        }
        //Checks if all guess chances have been used (right now set to be 10)
        public Boolean checkIfAllGuessesUsed(int countGuessesInt) {
            if (countGuessesInt > 9){
                return true;

            }
            else {
                return false;
            }


        }
        //prints end game stats
        public void endGame() {
            System.out.println("Guesses used " + countGuesses);
            System.out.println("Magic Number was: " + magicNumber);

        }
        //runs the GuessNumberGame
        public void runGuessNumberGame(){
            generateMagicNumber();
            while(!checkIfAllGuessesUsed(countGuesses)) {
                askForGuess();
                checkIfAllGuessesUsed(countGuesses);
                if(checkIfGuessWasJustGuessed(guess,previousGuess)){
                    continue;
                }
                checkIfGuessIsMagicNumber(guess,magicNumber);
                if(wasMagicNumberGuessed()){
                    break;
                }
                checkIfGuessIsTooHigh(guess,magicNumber);


            }
            endGame();





        }
}




