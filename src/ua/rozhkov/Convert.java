package ua.rozhkov;

public class Convert {
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /*Convert(int width, int height){
        this.width=width;
        this.height=height;
    }*/

    public double square() {
        return this.height * this.width;
    }
}
