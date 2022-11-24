package models;

public class BorrowInfo {
    int StudentID;

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int studentID) {
        StudentID = studentID;
    }

    public int getDaysextra() {
        return daysextra;
    }

    public void setDaysextra(int daysextra) {
        this.daysextra = daysextra;
    }

    int daysextra;

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    String StudentName;
    public BorrowInfo(int StudentID,int daysextra,String StudentName){
        this.StudentID = StudentID;
        this.daysextra = daysextra;
        this.StudentName = StudentName;


    }

    int FineCalculation;

    public void Fine(){
        if(this.daysextra > 3){
            System.out.println("Since the days has taken more than 3 days s/he has to pay an additional 120 rupees.");
        } else {
            System.out.println("No fine given as book has been taken for " + this.daysextra + " Days.");
        }
    }
}
