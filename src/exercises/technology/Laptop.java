package exercises.technology;

public class Laptop extends Computer {
    int memory;
    int memoryInUse;

    public Laptop(int storage, boolean internetAccess, int batteryLevel, int aMemory, int aMemoryInUse) {
        super(storage, internetAccess, batteryLevel);
        memory = aMemory;
        memoryInUse = aMemoryInUse;
    }

    public String memoryAvailable(){
        String memoryAvailableOutput;
        if(memory-memoryInUse <= 0){
            memoryAvailableOutput ="Not enough memory.";
        }else {
            memoryAvailableOutput = "Memory available: " + (memory - memoryInUse);
        }
        return memoryAvailableOutput;
    }
}
