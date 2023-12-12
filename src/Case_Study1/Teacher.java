package Case_Study1;

class Teacher {
    static int TeacherID;
    String TName;
    String Subject;

    public Teacher(int TeacherID, String TName, String Subject) {

        this. TeacherID = TeacherID;
        this. TName = TName;
        this. Subject = Subject;
    }

    public int getTeacherID() {
        return TeacherID;
    }

    public void setTeacherID(int teacherID) {
        TeacherID = teacherID;
    }

    public String getTName() {
        return TName;
    }

    public void setTName(String name) {
        TName = name;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }
    public void TeachCourse() {
           System.out.println(getTeacherID()+" "+getTName()+" "+getSubject());
    }
    }

