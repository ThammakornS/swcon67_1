public class ConversionEx {

    public static void main(String[] args) {
        int i = (int)12.5f;  	// Casting & narrowing conversion               
        System.out.println("(int)12.5f==" + i);  	// String conversion of i's int value: 
            
        float f = i;	// Widening & assignment conversion
        System.out.println("after float widening: " + f);	// String conversion of f's float value:  
             
	    System.out.print(f); 	// String conversion of f's float value:
	    f = f * i;	// Widening & numeric conversion
		            // Numeric promotion of i's value -->float
		            // After promotion, the operation is float: 
	    System.out.println("*" + i + "==" + f); 	// Two string conversions of i and f: 

	    double d = Math.sin(f); 	// Widening & invocation conversion
		                            // Conversion of f's value -->double, needed because the 		     method Math.sin accepts only a double argument
	    System.out.println("Math.sin(" + f + ")==" + d);  	 // Two string conversions of f and d:

    }
}