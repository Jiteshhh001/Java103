
public class collegeStudent extends Student1 {
    public collegeStudent(String name, int roll_no) {
        super(roll_no, name);
    }

    public void attend_class() {
        System.out.println(this.name + " Attend class");
    }

    public void give_exam() {
        System.out.println(this.roll_no + " Give exam in online mode");
    }
}
