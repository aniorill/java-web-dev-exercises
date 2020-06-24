package exercises;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Ch3HashMapPractice {
    public static void main(String[] args) {
        //It takes in student names and ID numbers (as integers) instead of names and grades.
        //The keys should be the IDs and the values should be the names.
        //Modify the roster printing code accordingly.
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("ID Number: ");
            newStudent = input.nextInt();

            if (!newStudent.equals("")) {
                System.out.print("Name: ");
                String newName = input.nextLine();
                students.put(newStudent, newName);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while (!newStudent.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");


        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");

        }

    }
}