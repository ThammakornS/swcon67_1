public class FinalMethod {
    public final void m() {}
    private void n(){}
}

class SubFinalMethod extends FinalMethod {
//    public void m(){
//        //new implementations
//    }

      public void n(){} //Is not considered as override method
}
