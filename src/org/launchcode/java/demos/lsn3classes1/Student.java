package org.launchcode.java.demos.lsn3classes1;
import java.util.ArrayList;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int aStudentId) {
        studentId = aStudentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double aGpa) {
        gpa = aGpa;
    }

    public String getGradeLevel(int numberOfCredits) {
        String gradeLevel = "";
        if (numberOfCredits >= 0 && numberOfCredits <= 29) {
            gradeLevel = "Freshman";
        } else if (numberOfCredits >= 30 && numberOfCredits <= 59) {
            gradeLevel = "Sophomore";
        } else if (numberOfCredits >= 60 && numberOfCredits <= 89) {
            gradeLevel = "Junior";
        } else if (numberOfCredits > 90) {
            gradeLevel = "Senior";
        }
        System.out.println(gradeLevel);

        return gradeLevel;
    }

    public void addGrade(int classCredits, double classGrade){
        double currentQualityScore= gpa*numberOfCredits;
        double newQualityScore = classGrade*classCredits;
        double totalQualityScore = currentQualityScore + newQualityScore;
        int totalNumberOfCredits = classCredits + numberOfCredits;
        double newGpa = totalQualityScore/totalNumberOfCredits;

        this.gpa = newGpa;
        this.numberOfCredits = totalNumberOfCredits;
        System.out.println(gpa);
        System.out.println(numberOfCredits);
    }

    public String toString(){
        return "Current student status: Student name: " + name + ", ID Number: " + studentId + ", Number of Credits: " + numberOfCredits + ", GPA: " + gpa;
    }

    public boolean equals(Object someStudent) {

        if (someStudent == this) {
            return true;
        }
        if (someStudent == null) {
            return false;
        }
        if (someStudent.getClass() != getClass()) {
            return false;
        }
        Student theStudent = (Student) someStudent;
        return theStudent.getStudentId() == getStudentId();
    }


}