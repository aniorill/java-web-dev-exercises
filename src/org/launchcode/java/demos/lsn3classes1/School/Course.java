package org.launchcode.java.demos.lsn3classes1.School;

import org.launchcode.java.demos.lsn3classes1.Student;
import java.util.ArrayList;

public class Course {
    public String nameOfCourse;
    public int numberCreditsEarned;
    public double minimumGpaRequired;
    ArrayList<String> studentRoster = new ArrayList<>();

    //public boolean equals (Object alexa) {
        //Student alexa = alexa;
        //return alexa.getGpa() ==
    //}

    public String toString(String nameOfCourse, int numberCreditsEarned){
        return " Course: " + nameOfCourse +" Credits: " + numberCreditsEarned;
    }

    Student alexa = new Student();

    public boolean equals(Object someCourse) {

        if (someCourse == this) {
            return true;
        }
        if (someCourse == null) {
            return false;
        }
        if (someCourse.getClass() != getClass()) {
            return false;
        }
        Course theCourse = (Course) someCourse;
        return theCourse.nameOfCourse == nameOfCourse;
    }

}
