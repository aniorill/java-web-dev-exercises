package exercises.technology;

public abstract class AbstractEntity {
    private static int nextStudentID = 1;
    private int studentID;

    public AbstractEntity () {
        this.studentID = nextStudentID;
        nextStudentID++;
    }

    public int getID(){
        return studentID;
    }
}
