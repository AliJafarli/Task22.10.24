public class Student {
    public String name;
    public String surname;
    public int id;
    public int age;
    public Professor professor;
    public Department depName;

    public Student(String name, String surname, int id, int age, Professor professor, Department depName) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.age = age;
        this.professor = professor;
        this.depName = depName;
    }
    public Student(){}


}
