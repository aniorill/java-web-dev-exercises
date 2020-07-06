package org.launchcode.java.demos.lsn3classes1;

import org.launchcode.java.demos.lsn3classes1.School.Course;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student Alexa = new Student();
        Alexa.setName("Alexa");
        Alexa.setStudentId(12909);
        Alexa.setNumberOfCredits(1);
        Alexa.setGpa(4.0);

        Student Becca = new Student();
        Becca.setStudentId(12345);

        System.out.println(Alexa.toString());

        Alexa.getGradeLevel(45);
        Alexa.addGrade(4, 3.5);

        Course bio = new Course();
        bio.nameOfCourse = "bio";
        System.out.println(bio.toString("bio", 4));
        Course chem = new Course();
        chem.nameOfCourse = "chem";

        System.out.println(Alexa.equals(Becca));

        System.out.println(bio.equals(chem));
    }

}
