package edu.kirkwood;
import java.util.ArrayList;
import edu.kirkwood.crcu.cis171.Student;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Student> students = new ArrayList<>();
        Student s1 = new Student();
        s1.setName("Gage", "Lake");
        Student s2 = new Student();
        s2.setName("Andrew", "Rompot");

        students.add(s1);
        students.add(s2);

        for(Student p : students) {
            System.out.println(p.greet());
        }

        /*for(Student p : students){
            System.out.println(p.formalGreet());
        }*/
    }
}
