public class MethodSignature  {
    public int m1(int a, int b){return 1;}
    // public int m1(int x, int y){return 1;}
    public int m1(int x){return 1;}
}

class SubMethodSignature extends MethodSignature{
    public int m1(int i, int j){return 2;}
}
