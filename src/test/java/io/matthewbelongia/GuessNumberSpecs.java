package io.matthewbelongia;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by matthewb on 4/28/16.
 */
public class GuessNumberSpecs {
    GuessNumber guessNumber;
    @Before public void init(){
        guessNumber = new GuessNumber();
    }

    @Test
    public void generateMagicNumberTest() {

        int actualVal = guessNumber.generateMagicNumber();
        assertTrue("The expected value should be between 0 - 100 actualVal is : "+actualVal,actualVal >= 0 );
        assertTrue("The expected value should be between 0 - 100 actualVal is : "+actualVal,actualVal <= 100 );

    }

    @Test
    public void checkIfGuessIsTooHighTest() {

        int guess = 70;
        int magicNumber = 60;
        int otherguess = 50;
        assertTrue("The expected value should be higher then blah",guessNumber.checkIfGuessIsTooHigh(guess,magicNumber));
        assertFalse("The expected value should be lower then blah",guessNumber.checkIfGuessIsTooHigh(otherguess,magicNumber));
    }

    @Test
    public void checkIfAllGuessesUsedTest() {

        int countGuesses = 11;
        int otherCountGuesses = 5;

        assertTrue("True if countGuesses is > 9",guessNumber.checkIfAllGuessesUsed(countGuesses));
        assertFalse("False if countGuesses is < 10",guessNumber.checkIfAllGuessesUsed(otherCountGuesses));
    }

    @Test
    public void checkIfGuessWasJustGuessedTest() {

        int guess = 11;
        int previousGuess = 5;
        int otherGuess = 5;

        assertTrue("True if guess = previousGuess",guessNumber.checkIfGuessWasJustGuessed(otherGuess,previousGuess));
        assertFalse("False if guess != previousGuess",guessNumber.checkIfGuessWasJustGuessed(guess,previousGuess));
    }

    @Test
    public void checkIfGuessIsMagicNumberTest() {

        int guess = 11;
        int magicNumber = 5;
        int otherGuess = 5;

        assertTrue("True if guess = magicNumber",guessNumber.checkIfGuessWasJustGuessed(otherGuess,magicNumber));
        assertFalse("False if guess != magicNumber",guessNumber.checkIfGuessWasJustGuessed(guess,magicNumber));
    }


}
