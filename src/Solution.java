import Transport.Car;
import Transport.Bus;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Hi");

Car asd = new Car("Lada",
        "Kalina",
        2001,
        "Россия",
        150,
        1.5,
        "Баклажан",
        "МКПП",
        "седан",
        "а234ве",
        5,
        new Car.Key(true,false));

        System.out.println(asd);

        Transport.Bus bus1 = new Bus("ЛиАЗ",
                "677",
                1990,
                "Россия",
                "желтый",
                70);

        Transport.Bus bus2 = new Bus("ЛиАЗ",
                "677Б",
                1989,
                "Россия",
                "желтый",
                70);

        Transport.Bus bus3 = new Bus("ЛиАЗ",
                "677В",
                1987,
                "Россия",
                "желтый",
                70);


        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);

    }
}
