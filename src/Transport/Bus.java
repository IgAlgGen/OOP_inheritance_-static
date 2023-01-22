package Transport;

public class Bus extends Transport{


    public Bus(String brand, String model, int year, String country, int speed) {
        super(brand, model, year, country, speed);
    }


    @Override
    public String toString() {
        return "Bus{} " + super.toString();
    }
}
