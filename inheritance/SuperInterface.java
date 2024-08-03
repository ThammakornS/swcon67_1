public interface SuperInterface {
    private void m1() {
        System.out.println("m1");
    }
     default void m2(){
        m1();
     };
}

class SubImpIn implements SuperInterface{
    public static void main(String[] args) {
        SubImpIn s = new SubImpIn();
        s.m2();
    }
}
