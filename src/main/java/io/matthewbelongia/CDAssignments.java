package io.matthewbelongia;

import java.util.*;
//import static net.mindview.util.Print.*; didnt download library

/**
 * Created by matthewb on 4/27/16.
 */
public class CDAssignments {
    public static void main(String[] args) {
        //System.out.println("Today's date is:");
        //System.out.println(new Date());
        //flipcoin(5);
        //HelloName();
        //GuessNumber guessNumber = new GuessNumber();
        //guessNumber.runGuessNumberGame();

        //StringCompare("test","test");
        //StringCompare("test","fail");
        //Random25Ints();
        //CommaOperator();
        //javaFiboDisplayAll(5);
        //disp("test");
        //disp("test1","test2");
        //vampireNumber();
        countToN();

    }

    public static void disp(String var1) {
        System.out.println("One String " + var1);
    }

    public static void disp(String var1, String var2) {
        System.out.println("Two Strings " + var1 + " " + var2);
    }

    public static void vampireNumber() {
        String stringx = "";
        String stringy = "";
        String bothStrings = "";
        String combined = "";
        int bothXandY = 0;

        ArrayList<Integer> vampNums = new ArrayList<Integer>();
        for (int x = 10; x < 100; x++) {
            for (int y = 10; y < 100; y++) {
                if (x * y > 1000) {
                    bothXandY = x * y;
                    stringx = Integer.toString(x);
                    stringy = Integer.toString(y);
                    bothStrings = stringx + stringy;
                    char[] chars = bothStrings.toCharArray();
                    Arrays.sort(chars);
                    String sorted = new String(chars);
                    combined = Integer.toString(bothXandY);
                    char[] otherchars = combined.toCharArray();
                    Arrays.sort(otherchars);
                    String othersorted = new String(otherchars);
                    if (sorted.equals(othersorted) && !vampNums.contains(bothXandY)) {
                        vampNums.add(bothXandY);
                    }
                }

            }
        }
        System.out.println(vampNums.toString());

    }

    public static void javaFiboDisplayAll(int display) {
        String result = "";
        for (int i = 0; i < display; i++) {

            result += " " + javaFibo(i);
        }
        System.out.println(result);
    }

    public static int javaFibo(int howmany) {
        int total = 0;
        if (howmany == 0) {
            //System.out.println("0");
            return 0;
        }
        if (howmany == 1) {
            //System.out.println("1");
            return 1;
        } else
            return javaFibo(howmany - 1) + javaFibo(howmany - 2);
    }

    public static void CommaOperator() {
        for (int i = 1, j = i + 10; i < 5; i++, j = i * 2) {
            System.out.println("i = " + i + " j = " + j);
        }
    }

    public static void Random25Ints() {
        Random rand = new Random();
        int compareMe = rand.nextInt();
        System.out.println(compareMe);
        for (int x = 0; x < 25; x++) {
            int rando = rand.nextInt();
            if (rando > compareMe) {
                System.out.println("rando is bigger than compareMe");
            } else {
                System.out.println("rando is tiny");
            }

        }
    }

    public static void StringCompare(String string1, String string2) {
        if (string1 == string2)
            System.out.println("They equal each other");
        if (string1.equals(string2))
            System.out.println("Contents equal each other");
        if (string1 != string2)
            System.out.println("Not equal");

    }

    private static void HelloName() {


        System.out.println("Type in your name:");

        Scanner name = new Scanner(System.in);
        String input = name.next();
        String personName = input;

        if (personName.equals("Alice") || personName.equals("Bob"))

        {
            System.out.println("Hello " + personName);
        } else

        {
            System.out.println("I don't know you!");
        }

    }

    private static void flipcoin(int flips) {
        Random rand = new Random();

        for (int x = flips; x < 10; x++) {
            int i = rand.nextInt(100);
            System.out.println(i);
            if (i > 50)
                System.out.println("Heads");
            else
                System.out.println("Tails");
        }
    }

    public static void countToN(){
        int result=0;
        Scanner numberIntake = new Scanner(System.in);
        int number = numberIntake.nextInt();
        for(int q =0;q<number;q++){
            result += q;
            System.out.println(q);
        }
        System.out.println(result);
    }


}

