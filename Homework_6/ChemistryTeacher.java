package OOP_Java.Homework_6;

public class ChemistryTeacher extends Teacher {
    protected ChemistryTeacher(String firstName, String lastName) {
        super(firstName, lastName);
    }
    @Override
    public String toString() {
        return "ChemistryTeacher{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
//  Наследуемый класс может заменить родительский
// 
