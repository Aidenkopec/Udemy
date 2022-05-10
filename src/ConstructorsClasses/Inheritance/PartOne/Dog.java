package ConstructorsClasses.Inheritance.PartOne;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, brain, body, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }


    private void chew() {
        System.out.println("Dog is chewing ");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat called ");
        chew();
        super.eat();
    }


    public void walk(){
        System.out.println("Dog.walk() called ");
        move(5);
    }

    public void run(){
        System.out.println("Dog.run() called ");
        move(10);
    }

    public void movedLegs(int speed){
        System.out.println("Dog.movedLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.moved called");
        movedLegs(speed);
        super.move(speed);
    }

}
