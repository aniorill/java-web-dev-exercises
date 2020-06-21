package exercises;
import java.util.Arrays;

public class Ch3ArrayPractice {
    public static void main(String[] args){
        int [] num = {1,1,2,3,5,8};
        for (int i = 0; i<num.length; i++){
            System.out.println(i);
        for (i = 0; i<num.length; i++){
            if (i % 2 !=0){
                System.out.println(i);
            }
        }
        }
        String drSeuss ="I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        String [] drSeussSpaces = drSeuss.split(" ");
        String [] drSeussPeriods = drSeuss.split("\\.");

        System.out.println(Arrays.toString(drSeussSpaces));
        System.out.println(Arrays.toString(drSeussPeriods));


    }
}
