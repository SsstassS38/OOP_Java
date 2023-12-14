package OOP_Java.Homework_6;

public class ShopTeacher extends Teacher {
    protected ShopTeacher(String firstName, String lastName) {
        super(firstName, lastName);
    }
    @Override
    public String toString() {
        return "ShopTeacher{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}


//  Принцип SRP (единственная ответственность)
//  Наследуемый класс может заменить родительский
