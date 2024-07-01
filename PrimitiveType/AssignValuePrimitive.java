public class AssignValuePrimitive {

    public static void main(String[] args) {
        int i = 0;
        // i = 0.0; //wrong type assignment
        double d = 0.0;
        d = i;
        float f; 
        // f = d; //wrong type assignment
        f = i;
        f = 0.0f;
    }
}