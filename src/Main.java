public class Main {
    public static void main(String[] args) {

        Department department = new Department();
        Professor professor1 = new Professor();
        Professor professor2 = new Professor();
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        department.name = "Psychology";
        Course[] courses = new Course[2];

        Course course = new Course();
        course.name = "Ethics";
        course.department = department;

        Course course1 = new Course();
        course1.name = "Social";
        course1.department = department;

        courses[0] = course;
        courses[1] = course1;
        department.courses = courses;


    }
}