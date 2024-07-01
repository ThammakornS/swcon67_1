public class Rectangle {
    private double width;
    private double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public void setWidth(double width) {
        this.width = width;
        this.height = width;
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
}
