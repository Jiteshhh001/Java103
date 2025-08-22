public class Student {
    int roll_no;
    String name;

    Student() {
        System.out.println("I am default");
    }

    Student(int r, String n) {
        this.roll_no = r;
        this.name = n;
    }

    public void display() {
        System.out.println("Roll no: " + this.roll_no);
        System.out.println("Name is: " + this.name);
    }
}
