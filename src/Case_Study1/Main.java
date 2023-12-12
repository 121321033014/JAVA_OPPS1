package Case_Study1;

public class Main {
    public static void main(String[] args) {
        Student s = new Student(101,"Alice","85");
        s.Register();
        Teacher t = new Teacher(201,"Mr.Smith","Mathematics");
        t.TeachCourse();
        Course c = new Course(101,"Alice","85",301,"Mathematics",5);
        c.Course_Details();
        c.grade();
        c.grade1();
        Course c1 = new Course(101,"Alice","85",302,"Science",1);
        Course c2 = new Course(102,"Joshua","85",302,"Science",1);
        c2.enrole();
        c1.enrole();




    }
}
