public class Person {
    private String name;
    private int age;
    private boolean isStudent;
    private int id;
    private static final int NOT_ID_SET = -1;
    public Person()
    {
        this.name = "";
        this.age = 0;
        this.id = NOT_ID_SET;
        this.isStudent = false;
    }
    public Person(String name, int age,  boolean isStudent, int id)
    {
        this.name = name;
        this.age = age;
        this.id = id;
        this.isStudent = isStudent;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setIsStudent(boolean student) {
        this.isStudent = student;
    }
    public int getAge() {
        return this.age;
    }
    public int getId() {
        return this.id;
    }
    public String getName() {
        return name;
    }
    public boolean getIsStudent() { return this.isStudent; }
}
