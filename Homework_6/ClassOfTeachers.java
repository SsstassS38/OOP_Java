package OOP_Java.Homework_6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClassOfTeachers<T extends Teacher>  {
    private String nameGroup;
    private List<T> numberOfTeachers;
    private int index;

    public ClassOfTeachers(String nameGroup) {
        this.numberOfTeachers = new ArrayList<>();
        this.nameGroup = nameGroup;
    }

    public String getName() {
        return nameGroup;
    }

    public void add(T teacher){
        numberOfTeachers.add(teacher);
    }

    public int count() {
        return numberOfTeachers.size();
    }

    public T get(Integer index) {
        return numberOfTeachers.get(index);
    }

//  Принцип LSP
//  Перенес итератор в отдельный класс, оставил в классе только логику, отвечающую за формирование группы учителей
//  Класс параметаризован
}
