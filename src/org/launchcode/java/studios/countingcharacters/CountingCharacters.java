package org.launchcode.java.studios.countingcharacters;
import java.util.ArrayList;
import java.util.HashMap;


public class CountingCharacters {
    public static void main(String[] arg){
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
                //characterCounter.value += 1;
            }

        }

        //loop through chars
        //store number of char instances for each char -- Hashmap
        //print results- also a loop
    }
}
