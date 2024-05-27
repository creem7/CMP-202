public class Person {
    private String name;
    private String schoolName = "Bingham University";
    private String password;
    private String matricNo;
    private int staffNo;
    Person() {
        System.out.println("Object created");
    }

    public Person(String name, String schoolName, String password, String matricNo) {
        this.name = name;
        this.schoolName = schoolName;
        this.password = password;
        this.matricNo = matricNo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", password='" + password + '\'' +
                ", matricNo='" + matricNo + '\'' +
                ", staffNo=" + staffNo +
                '}';
    }

    public Person(String name, String schoolName, String password, int staffNo) {
        this.name = name;
        this.schoolName = schoolName;
        this.password = password;
        this.staffNo = staffNo;
    }

    //default constructor, student constructor and staff constructor
    //we access private variables using getter and setter methods
    //Don't hardcode the value except the value doesn't change
    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;

    }
    void setPassword(String password) {
        this.password = password;
    }
    void displayName() {
        System.out.println(name);
    }
}
