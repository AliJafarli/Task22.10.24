public class Main {
    public static void main(String[] args) {

        Department department = new Department();
        department.name = "Psychology";


        Student[] students = new Student[3];

        Student student1 = new Student();
        student1.name = "Abbas";
        student1.surname = "Abbasov";
        student1.age = 20;
        student1.id = 1;
        student1.professor.name = "Sigmund";
        student1.professor.surname = "Freud";
        student1.department = department;

        Student student2 = new Student();
        student2.name = "Akif";
        student2.surname = "Aliyev";
        student2.age = 23;
        student2.id = 2;
        student2.professor.name = "Martin";
        student2.professor.surname = "Seligman";
        student2.department = department;

        Student student3 = new Student();
        student3.name = "Arif";
        student3.surname = "Babayev";
        student3.age = 27;
        student3.id = 3;
        student3.professor.name = "Sigmund";
        student3.professor.surname = "Freud";
        student3.department = department;

        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        department.students = students;


        Course[] courses = new Course[2];

        Course course = new Course();
        course.CourseName = "Ethics";
        course.department = department;

        Course course1 = new Course();
        course1.CourseName = "Social";
        course1.department = department;

        courses[0] = course;
        courses[1] = course1;
        department.courses = courses;

        Professor professor1 = new Professor();
        professor1.name = "Sigmund";
        professor1.surname = "Freud";
        professor1.age = 81;
        professor1.id = 1;
        professor1.department = department;
        department.professor = professor1;

        Professor professor2 = new Professor();
        professor2.name = "Martin";
        professor2.surname = "Seligman";
        professor2.age = 77;
        professor2.id = 2;
        professor2.department = department;
        department.professor = professor2;


    }
}