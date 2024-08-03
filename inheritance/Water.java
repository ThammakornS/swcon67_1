public class Water {
    final int WPH = 7;
}

class Acid extends Water{
    int aph;

    public Acid(){
//        this.aph = super.WPH-5;
        this.aph = this.WPH-5;
    }
}


class Mixture {
    public static void main(String[] args) {
        Acid acid = new Acid();
        System.out.println(acid.aph); //?
    }
}
