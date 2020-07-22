package exercises.technology;

import java.util.Scanner;

public class Smartphone extends Computer {
    String phoneNumber;
    String password;
    Scanner input;

    public Smartphone(int storage, boolean internetAccess, int batteryLevel, String aPhoneNumber, String aPassword) {
        super(storage, internetAccess, batteryLevel);
        phoneNumber = aPhoneNumber;
        password = aPassword;

    }

    public String checkPassword(){
        String userPassword;
        input = new Scanner(System.in);
        System.out.println("Enter password:");
        userPassword = input.next();
        input.close();

        String checkPasswordOutput;

        if (userPassword.equals(password)){
            checkPasswordOutput = "Welcome!";
        } else {
            checkPasswordOutput = "Incorrect Password.";
        }
        return checkPasswordOutput;
    }
    public String checkPassword(String userPassword){
        String checkPasswordOutput;

        if (userPassword.equals(password)){
            checkPasswordOutput = "Welcome!";
        } else {
            checkPasswordOutput = "Incorrect Password.";
        }
        return checkPasswordOutput;
    }
}
