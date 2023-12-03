package OOP_Java.Homework_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClassOfTeachers<Teacher> teachers = new ClassOfTeachers<>("teacherss");
        teachers.add(new ChemistryTeacher("Sergey", "Michailovitch"));
        teachers.add(new ShopTeacher("Aliya", "Ashrapova"));

        for (int index = 0; index < teachers.count(); index++) {
            System.out.println(teachers.get(index));
        }




    }
}
