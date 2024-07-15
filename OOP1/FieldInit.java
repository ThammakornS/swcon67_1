public class FieldInit {
    private int x,y,z=1;
    private double d1 = Math.PI, d2 = Math.abs(-1);
    public static final int CONSTANT = 0;
    public static void main(String[] args) {
        FieldInit f = new FieldInit();
        System.out.println("x="+f.x);
        System.out.println("y="+f.y);
        System.out.println("z="+f.z);
        System.out.println("d1="+f.d1);
        System.out.println("d2="+f.d2);
    }
}
