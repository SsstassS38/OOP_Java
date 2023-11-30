package OOP_Java.Homework_3;

import java.util.Collections;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Students one = new Students("Stan", "Ryabovsky", 25);
        Students two = new Students("Vova", "Matrosov", 22);
        Students three = new Students("Michael", "Grigoryan", 26);


        List<Students> numberGroup = new ArrayList<>();
        numberGroup.add(one);
        numberGroup.add(two);
        numberGroup.add(three);
//      System.out.println(numberGroup);


//        for (Students student : numberGroup) {
//            System.out.println("Name: " + student.getName());
//            }
//
//        Iterator<Students> iterator = numberGroup.iterator();
//        while (iterator.hasNext()) {
//            Students students = iterator.next();
//            System.out.println("Name: " + students.getName());
//        }
        System.out.println(numberGroup);
//        Collections.sort(numberGroup);
        numberGroup.sort(new StudentsComporator());

        System.out.println(numberGroup);
//

    }
}
