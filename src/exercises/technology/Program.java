package exercises.technology;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;




public class Program {

    Computer test_computer;
    Laptop test_laptop;
    Smartphone test_smartphone;
    String userPassword;

    @Before

    public void createTestObjects(){
        test_computer = new Computer(100,true,75);
        test_laptop = new Laptop(100, true, 50, 16, 16);
        test_smartphone = new Smartphone(100, true, 15, "727-867-5309","password");
        userPassword = "password";
    }

    //Computer Tests
    @Test
    public void internetAccessTestComputer(){
    assertEquals("You are now connected to the internet", test_computer.internetAccessCheck());
   // assertTrue(test_computer.internetAccessCheck().equals("You are now connected to the internet"));
    }

    @Test
    public void batteryLevelTestComputer(){
        assertTrue(test_computer.needsACharge().equals("Battery is at 75 percent."));
    }

    //Laptop Tests
    @Test
    public void internetAccessTestLaptop(){
        assertEquals("You are now connected to the internet",test_laptop.internetAccessCheck());
        //assertTrue(test_laptop.internetAccessCheck().equals("You are now connected to the internet"));
    }

    @Test
    public void batteryLevelTestLaptop(){
        assertTrue(test_laptop.needsACharge().equals("Battery is at 50 percent."));
    }

    @Test
    public void memoryAvailableTest(){
        assertTrue(test_laptop.memoryAvailable().equals("Not enough memory."));
    }

    //Smartphone Tests
    @Test
    public void internetAccessTestSmartphone(){
        assertEquals("You are now connected to the internet", test_smartphone.internetAccessCheck());
    }

    @Test
    public void batteryLevelTestSmartphone(){
        assertTrue(test_smartphone.needsACharge().equals("Charge battery."));
    }

    @Test
    public void passwordCheck(){
        //System.out.println(test_smartphone.checkPassword(userPassword));
        assertTrue(test_smartphone.checkPassword(userPassword).equals("Welcome!"));
    }
}
