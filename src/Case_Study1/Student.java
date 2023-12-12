package Case_Study1;


class Student {
    static int StudentID;
    String SName;
    String Grade;

    public Student(int studentID, String sname, String grade) {
       this. StudentID = studentID;
        this.SName = sname;
       this. Grade = grade;
    }




    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int studentID) {
        StudentID = studentID;
    }

    public String getSName() {
        return SName;
    }

    public void setSName(String sname) {
        SName = sname;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }
    public void Register() {
        System.out.println(getStudentID()+" "+getSName()+" "+getGrade());

    }

}
