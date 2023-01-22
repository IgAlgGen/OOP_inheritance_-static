package Transport;


import static Transport.Verifications.*;


public class Car extends Transport {

    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessEntry;

        public Key(boolean remoteEngineStart, boolean keylessEntry) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessEntry = keylessEntry;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessEntry() {
            return keylessEntry;
        }

        @Override
        public String toString() {
            return (remoteEngineStart ? "Удаленный запуск двигателя" : "Без удаленного запуска двигателя") + ", " +
                    (keylessEntry ? "Без ключевой доступ - присутствует" : "Без ключевой доступ - отсутствует");
        }

    }

    public void setKey(Key key) {
        if (key == null) {
            key = new Key(false, false);
        }
        this.key = key;
    }

    private double engineVolume;
    private String color;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private String tireType;
    private Key key;

    public Car(String brand,
               String model,
               int year,
               String country,
               int speed,
               double engineVolume,
               String color,
               String transmission,
               String bodyType,
               String registrationNumber,
               int numberOfSeats,
               Key key) {
        super(brand, model, year, country, speed);
        setEngineVolume(engineVolume);
        setColor(color);
        setTransmission(transmission);
        this.bodyType = verificationBodyType(bodyType);
        setRegistrationNumber(registrationNumber);
        this.numberOfSeats = verificationNumberOfSeats(numberOfSeats);
        this.tireType = verificationTireType();
        setKey(key);
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = verificationEngineVolume(engineVolume);
    }

    public void setColor(String color) {
        this.color = verificationColor(color);
    }

    public void setTransmission(String transmission) {
        this.transmission = verificationTransmission(transmission);
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = verificationRegistrationNumber(registrationNumber);
    }


    public double getEngineVolume() {
        return engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getColor() {
        return color;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getTireType() {
        return tireType;
    }


    public String getRegistrationNumber() {
        return registrationNumber;
    }


    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public Key getKey() {
        return key;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", tireType='" + tireType + '\'' +
                ", key=" + key +
                "} " + super.toString();
    }
}


