package ConstructorsClasses.InheritanceChallenge;

public class Car extends Vehicle{
    private int doors;
    private int wheels;
    private String size;
    private String make;
    private int year;
    private double kms;

    public Car() {
    }

    public Car(int doors, int wheels, String size, String make, int year, double kms) {
        this.doors = doors;
        this.wheels = wheels;
        this.size = size;
        this.make = make;
        this.year = year;
        this.kms = kms;
    }

    public Car(boolean handSteering, int numberOfGears, double speed, String colour, String engineSize, int doors, int wheels, String size, String make, int year, double kms) {
        super(handSteering, numberOfGears, speed, colour, engineSize);
        this.doors = doors;
        this.wheels = wheels;
        this.size = size;
        this.make = make;
        this.year = year;
        this.kms = kms;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getKms() {
        return kms;
    }

    public void setKms(double kms) {
        this.kms = kms;
    }

    @Override
    public String toString() {
        return "Car{" +
                "doors=" + doors +
                ", wheels=" + wheels +
                ", size='" + size + '\'' +
                ", make='" + make + '\'' +
                ", year=" + year +
                ", kms=" + kms +
                "} " + super.toString();
    }
}
