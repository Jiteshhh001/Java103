package Unit3;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting2 {
    public static void main(String[] args) {
        ArrayList<Student> al= new ArrayList<>();
        al.add(new Student(19,100,"John"));
        al.add(new Student(22,101,"Knight"));
        al.add(new Student(23,102,"Krrish"));
        al.add(new Student(21,103,"Dev"));
        al.add(new Student(31,104,"Bryan"));
        Collections.sort(al);
        for(Student st:al){
            System.out.println("Name: "+st.name+" \tAge: "+st.age+" \tRoll no.: "+st.roll);
        }
    }
}
