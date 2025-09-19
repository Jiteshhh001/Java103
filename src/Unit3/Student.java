package Unit3;

public class Student implements Comparable<Student>{
    int age;
    String name;
    int roll;

    public Student(int age, int roll, String name) {
        this.age = age;
        this.roll = roll;
        this.name = name;
    }
    public int compareTo(Student st){
        if(age==st.age)
            return 0;
        else if(age>st.age)
            return 1;
        else
            return -1;
    }
}
