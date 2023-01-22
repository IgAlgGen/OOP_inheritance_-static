package Transport;

public class Bus extends Transport{


    public Bus(String brand, String model, int year, String country, String color, int speed) {
        super(brand, model, year, country, color, speed);
    }

    @Override
    public String toString() {
        return "Bus{} " + super.toString();
    }
}
