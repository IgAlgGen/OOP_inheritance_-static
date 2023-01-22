package Transport;

import java.time.LocalDateTime;

public class Verifications {

    protected static String verificationBrand(String brand) {
        return brand == null || brand.isEmpty() || brand.isBlank() ? "default" : brand;
    }

    public static String verificationModel(String model) {
        return model == null || model.isEmpty() || model.isBlank() ? "default" : model;
    }

    public static int verificationYear(int year) {
        return year < 1886 || year > LocalDateTime.now().getYear() ? 2000 : year; //Автомобиль не может быть старше самого первого автомобиля. А также заранее построен.
    }

    public static String verificationCountry(String country) {
        return country == null || country.isEmpty() || country.isBlank() ? "default" : country;
    }

    public static String verificationBodyType(String bodyType) {
        return bodyType == null || bodyType.isEmpty() || bodyType.isBlank() ? "default" : bodyType;
    }

    public static int verificationNumberOfSeats(int numberOfSeats) {
        return numberOfSeats <= 0 ? 2 : numberOfSeats; //Я думаю, гоночные болиды не будут присутствовать в нашем списке.
    }

    public static double verificationEngineVolume(double engineVolume) {
        return engineVolume <= 0 ? 1.5 : engineVolume;
    }

    public static String verificationColor(String color) {
        return color == null || color.isEmpty() || color.isBlank() ? "белый" : color;
    }

    public static String verificationTransmission(String transmission) {
        return transmission == null || transmission.isEmpty() || transmission.isBlank() ? "default" : transmission;
    }


    public static String verificationRegistrationNumber(String registrationNumber) {
        String s = registrationNumber.toUpperCase();
        if (s == null ||
                s.isEmpty() ||
                s.isBlank() ||
                s.contains("Й") ||
                s.contains("Ц") ||
                s.contains("Г") ||
                s.contains("Ш") ||
                s.contains("Щ") ||
                s.contains("З") ||
                s.contains("Ф") ||
                s.contains("Ы") ||
                s.contains("П") ||
                s.contains("Л") ||
                s.contains("Д") ||
                s.contains("Ж") ||
                s.contains("Э") ||
                s.contains("Я") ||
                s.contains("Ч") ||
                s.contains("Ь") ||
                s.contains("Ъ") ||
                s.contains("Б") ||
                s.contains("Ю")) {
            return "default";
        } else return s;
    }

    public static String verificationTireType() { //Сменить шины на сезонные
        String month = LocalDateTime.now().getMonth().toString();
        switch (month) {
            case "DECEMBER":
            case "JANUARY":
            case "FEBRUARY":
                return "Зимняя резина";
            default:
                return "Летняя резина";
        }
    }

    public static int verificationSpeed(int speed) {
        return speed < 0 || speed > 400 ? 5 : speed;
    }

}
