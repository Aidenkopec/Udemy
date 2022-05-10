package ConstructorsClasses.WallArea;

public class Driver {
    public static void main(String[] args) {
        Wall one = new Wall(5, 5);

        System.out.println("Width = " + one.getWidth());
        System.out.println("Height = " + one.getHeight());
        System.out.println("Area = " + one.getArea());
    }
}
