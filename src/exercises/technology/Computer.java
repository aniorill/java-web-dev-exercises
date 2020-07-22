package exercises.technology;
import java.util.Scanner;

public class Computer {
    private int storage;
    private boolean internetAccess;
    private int batteryLevel;



    public Computer (int storage, boolean internetAccess, int batteryLevel){
        this.storage = storage;
        this.internetAccess = internetAccess;
        this.batteryLevel = batteryLevel;
    }

    public int getStorage() {
        return storage;
    }

    public boolean getInternetAccess() {
        return internetAccess;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public String internetAccessCheck (){
        String output;
        if (internetAccess){
            output = "You are now connected to the internet";
        }else{
            output = "No internet connection available.";
        }
        return output;
    }

    public String needsACharge (){
        String needsAChargeOutput;
        if (batteryLevel == 100){
            needsAChargeOutput = "Battery is fully charged";
        } else if(batteryLevel < 20) {
            needsAChargeOutput ="Charge battery.";
        } else{
            needsAChargeOutput = "Battery is at " + batteryLevel + " percent.";
            }
        return needsAChargeOutput;
        }
}
