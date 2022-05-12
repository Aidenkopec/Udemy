package ConstructorsClasses.InheritanceChallenge;

public class Vehicle {
    private boolean handSteering;
    private int numberOfGears;
    private double speed;
    private String colour;
    private String engineSize;


    public Vehicle() {
    }

    public Vehicle(boolean handSteering, int numberOfGears, double speed, String colour, String engineSize) {
        this.handSteering = handSteering;
        this.numberOfGears = numberOfGears;
        this.speed = speed;
        this.colour = colour;
        this.engineSize = engineSize;
    }


    public boolean isHandSteering() {
        return handSteering;
    }

    public void setHandSteering(boolean handSteering) {
        this.handSteering = handSteering;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(String engineSize) {
        this.engineSize = engineSize;
    }

    @Override
    public String toString() {
        return
                "handSteering=" + handSteering +
                ", numberOfGears=" + numberOfGears +
                ", speed=" + speed +
                ", colour='" + colour + '\'' +
                ", engineSize='" + engineSize + '\'' +
                '}';
    }
}
