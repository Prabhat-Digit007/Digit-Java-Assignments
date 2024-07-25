package DAY1;

public class Main {
    private String Studentid;
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentid() {
        return Studentid;
    }

    public void setStudentid(String studentid) {
        Studentid = studentid;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Main s1 = new Main();
        s1.setStudentid("DLI0001");
        s1.setName("Rohit");
        s1.setAge(12);

    }
}