public class Professor {
    public String name;
    public String surname;
    public int id;
    public int age;
    public Department depName;

    public Professor(String name, String surname, int id, int age, Department depName) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.age = age;
        this.depName = depName;
    }
    public Professor(){}
}
