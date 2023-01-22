package Transport;
import static Transport.Verifications.*;

public class Transport {
    private String brand;
    private String model;
    private final int year;
    private final String country;
    private int speed;

    public Transport(String brand, String model, int year, String country, int speed) {
        this.brand = verificationBrand(brand);
        this.model = verificationModel(model);
        this.year = verificationYear(year);
        this.country = verificationCountry(country);
        this.speed = verificationSpeed(speed);
    }

    public void setBrand(String brand) {
        this.brand = verificationBrand(brand);
    }

    public void setModel(String model) {
        this.model = verificationModel(model);
    }

    public void setSpeed(int speed) {
        this.speed = verificationSpeed(speed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", speed=" + speed +
                '}';
    }
}
