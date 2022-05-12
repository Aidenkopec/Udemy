package ConstructorsClasses.InheritanceChallenge;

public class Driver {
    public static void main(String[] agrs) {
        Car car = new Car(true, 7, 100, "Blue", "V8",
                4, 4, "Compact", "Hyundai", 2022, 50_000);
        System.out.println(car);
    }
}
