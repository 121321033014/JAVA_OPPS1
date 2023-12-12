package Case_Study1;

import static Case_Study1.Teacher.TeacherID;

class Course extends Student{
    int courseID;
    String Name;
    int MaxStudents;

    public Course( int StudentID,String SName,String grade,int courseID, String Name, int MaxStudents) {
        super(StudentID,SName,grade);
        this.courseID = courseID;
        this.Name = Name;
        this.MaxStudents = MaxStudents;
    }


    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getMaxStudents() {
        return MaxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        MaxStudents = maxStudents;
    }
    public void Course_Details(){
        System.out.println(getCourseID()+" "+getName()+" "+ getStudentID()+" "+getMaxStudents());
    }
    public void grade() {
        System.out.println("Teacher " + TeacherID + " " + " assigning a grade of " + getGrade() + " to student " + StudentID + " in " + getName() + " " + getStudentID());
        System.out.println("Grade assigned successfully.");
    }
    public void grade1(){
            System.out.println("Students enrolled in"+getName()+" "+getStudentID()+" :");
            System.out.println("Students ID :"+getStudentID()+" ,Name :"+getSName()+" Grade :"+getGrade());
        }
    public void enrole(){
        int Student=0;

    for(Student=0;Student<MaxStudents;Student++){
        System.out.println("CourseID:"+getCourseID()+" Course Name:"+getName()+" Max Students:"+getMaxStudents());
        System.out.println("enrolling student "+getStudentID()+" in course "+getCourseID()+" "+getName()+" successfully");
    }
            System.out.println("the course is already full");
        }

    }




