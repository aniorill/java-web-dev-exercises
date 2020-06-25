package org.launchcode.java.studios.countingcharacters;
/*import java.util.ArrayList;
import java.util.HashMap;


public class CountingCharacters {
    public static void main(String[] args){
        String quote = "If the product of two terms is zero " +
                "then common sense says at least one of the two terms has to be zero " +
                "to start with. So if you move all the terms over to one side, " +
                "you can put the quadratics into a form that can be factored " +
                "allowing that side of the equation to equal zero. Once you’ve done that, " +
                "it’s pretty straightforward from there.";
        String lowerCaseQuote = quote.toLowerCase();
        char[] characterArray = lowerCaseQuote.toCharArray();
        HashMap<Character,Integer> characterCounter = new HashMap<>();
            characterCounter.put('a', 0);
            characterCounter.put('b', 0);
            characterCounter.put('c', 0);
            characterCounter.put('d', 0);
            characterCounter.put('e', 0);
            characterCounter.put('f', 0);
            characterCounter.put('g', 0);
            characterCounter.put('h', 0);
            characterCounter.put('i', 0);
            characterCounter.put('j', 0);
            characterCounter.put('k', 0);
            characterCounter.put('l', 0);
            characterCounter.put('m', 0);
            characterCounter.put('n', 0);
            characterCounter.put('o', 0);
            characterCounter.put('p', 0);
            characterCounter.put('q', 0);
            characterCounter.put('r', 0);
            characterCounter.put('s', 0);
            characterCounter.put('t', 0);
            characterCounter.put('u', 0);
            characterCounter.put('v', 0);
            characterCounter.put('w', 0);
            characterCounter.put('x', 0);
            characterCounter.put('y', 0);
            characterCounter.put('z', 0);

        for (int i=0; i<characterArray.length;i++){
            if (characterCounter.containsKey(i)){
                characterCounter.values(i) += 1;
            }

        }
        for (Character letter : characterCounter){
            System.out.println(letter);
        }

        //loop through chars
        //store number of char instances for each char -- Hashmap
        //print results- also a loop
    }
}
 */

//import java.io.File;
//import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        String quote = "If the product of two terms is zero " +
                "then common sense says at least one of the two terms has to be zero " +
                "to start with. So if you move all the terms over to one side, " +
                "you can put the quadratics into a form that can be factored " +
                "allowing that side of the equation to equal zero. Once you’ve done that, " +
                "it’s pretty straightforward from there.";
        String lowerCaseQuote = quote.toLowerCase();
        char[] characterArray = lowerCaseQuote.toCharArray();
        HashMap<Character, Integer> occurrences = new HashMap();

        for (char character:lowerCaseQuote.toLowerCase().toCharArray()) {
            if (Character.isLetter(character)) {
                if (occurrences.get(character) != null) {
                    occurrences.put(character, occurrences.get(character) + 1);
                } else {
                    occurrences.put(character, 1);
                }
            }
        }
        System.out.println(occurrences.toString());

    }
}
