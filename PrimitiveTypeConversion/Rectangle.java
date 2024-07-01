public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // public String toString() {
    //     return "Rectangle{" +
    //             "width=" + width +
    //             ", height=" + height +
    //             '}';
    // }

    public void printRectangle(){
        System.out.println("Rectangle width: "+this.width+ " height: "+this.height);
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2.0, 3.5);
        System.out.println(r1);

        Rectangle r2 = r1; 
        System.out.println("r1 width:"+r1.width);
        System.out.println("r2 width:"+r2.width);

        r2.setWidth(1);
        System.out.println("r1 width:"+r1.width);
        System.out.println("r2 width:"+r2.width);

    }
}
