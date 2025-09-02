package Unit1;

abstract class Student1 {
    String name;
    int roll_no;

    public Student1(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }

    abstract void attend_class();

    abstract void give_exam();
}