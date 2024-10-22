public class Department {
    public String name;
    public Professor professor;
    public Student[] students;
    public Course[] courses;

    public Department(String name, Professor professor, Student[] students, Course[] courses) {
        this.name = name;
        this.professor = professor;
        this.students = students;
        this.courses = courses;
    }
    public Department(){}
}
