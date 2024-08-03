import java.util.Arrays;

public class Rectangle implements Cloneable {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle r) {
        this.width = r.width;
        this.height = r.height;
    }

    public void setWidth(double width) { this.width = width;  }
    public void setHeight(double height) { this.height = height; }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", height=" + height +  '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class TestCloneRectangle{
    public static void main(String[] args) throws CloneNotSupportedException {
        Rectangle[] rec1 = {new Rectangle(1, 1),
                new Rectangle(2, 2),
                new Rectangle(3, 3)};

//        --Using Arrays.copyOf-- --> not work
//        Rectangle[] recCopy = Arrays.copyOf(rec1, rec1.length);
//        rec1[0].setWidth(999);

//       --Using clone()--
        Rectangle[] recCopy = new Rectangle[rec1.length];
        for(int i=0; i< rec1.length; i++){
            recCopy[i] = (Rectangle) rec1[i].clone();
        }
        recCopy[0].setWidth(999);

    //    --Using constructor--
    //    Rectangle[] recCopy = new Rectangle[rec1.length];
    //    for(int i=0; i< rec1.length; i++){
    //        recCopy[i] = new Rectangle(rec1[i]);
    //    }

       rec1[0].setWidth(999);

        System.out.println(Arrays.toString(recCopy));
        System.out.println(Arrays.toString(rec1));

//        Rectangle [] rec2 = rec1.clone();
//        rec2[0].setWidth(999);
//        System.out.println(Arrays.toString(rec1));
//        System.out.println(Arrays.toString(rec2));
    }
}



