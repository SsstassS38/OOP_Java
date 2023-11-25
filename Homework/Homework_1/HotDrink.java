package OOP_Java.Homework.Homework_1;

public class HotDrink extends Product{
    private int temperature;
    public HotDrink(String name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "BottleOFWater{" +
                "name=" + super.getName() +
                ";volume=" + super.getvolume() +
                ";temperature=" + temperature +
                '}';
    }
}
