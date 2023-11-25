package OOP_Java.Homework.Homework_1;

public abstract class Product {
    private String name;
    private int volume;

    public Product(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getvolume() {
        return volume;
    }

    public void settemperature(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
