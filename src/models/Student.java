package models;

public class Student {

    String studentname;
    int StudentID;
    int Grade;

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int studentID) {
        StudentID = studentID;
    }

    public int getGrade() {
        return Grade;
    }

    public void setGrade(int grade) {
        Grade = grade;
    }

    public Student(String studentname,int StudentID,int Grade){
        this.studentname = studentname;
        this.StudentID = StudentID;
        this.Grade = Grade;

    }

    public void Info(){
        System.out.println("Student " + this.studentname + " of Grade " +
                this.Grade + " of StudentID " + this.StudentID +
                " has taken some books from the library.");

    }
}
