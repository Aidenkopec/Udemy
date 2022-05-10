package ConstructorsClasses.WallArea;
//Write a class with the name Wall.
//The class needs two fields (instance variables) with name width and height of type double.
public class Wall {
    private double width;
    private double height;

    public Wall() {
    }

    public Wall(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width < 0){
            this.width = 0;
        }else{
            this.width = width;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height < 0){
            this.height = 0;
        }else{
            this.height = height;
        }
    }

    public double getArea(){
        return this.width * this.height;
    }
}
