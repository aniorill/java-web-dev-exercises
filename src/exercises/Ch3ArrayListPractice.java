package exercises;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;


public class Ch3ArrayListPractice {
    public static void main (String[] args){
        int [] numbers = {1,2,3,4,5,6,7,8,9,10,11,12};
        int sum = 0;
        ArrayList<Integer> numberSum =  new ArrayList<Integer>();
        for (int i= 0; i < numbers.length; i++){
            numberSum.add(numbers[i]);
            }
        for (int i =0; i < numberSum.size(); i++) {
            if (numberSum.get(i) % 2 == 0){
                sum += numberSum.get(i);
                System.out.println(sum);
            }
        }
        //System.out.println(numberSum);


    }
}
