package Transport;

import static Transport.Verifications.*;

public class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private int maxSpeed;

    public Transport(String brand, String model, int year, String country,String color, int speed) {
        this.brand = verificationBrand(brand);
        this.model = verificationModel(model);
        this.year = verificationYear(year);
        this.country = verificationCountry(country);
        this.color = verificationColor(color);
        this.maxSpeed = verificationSpeed(speed);
    }

    public void setColor(String color) {
        this.color = verificationColor(color);
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = verificationSpeed(maxSpeed);
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

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
