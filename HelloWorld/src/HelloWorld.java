public class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Hello World!");

        /*
        data types in java:
            int is an integer
            double is a decimal
            float is also a decimal but worse
            boolean is true/false
            char is one 'thing' ie 'h' or 'i' but not 'hi'
            String is a combo of chars ie "Hello World!"
        */

        int intNumber = 30;
        double decimalNumber = 3.14;
        float floatNumber = 4.5f;
        boolean booleanVariable = true;
        char character = 'a';
        String string = "This is a String!";

        // System.out.println(floatNumber);

        /*
        arithmetic operations in java:
            +, -, *, /, %
            note that if one operand is a double, result is a double
         */

//        System.out.println( 1.0 / 2 );

        int[] integerArray = {0,2,5,3,4,4};
//        System.out.println(integerArray[5]);

        int i = 0;
        for (i=0; i < integerArray.length; i = i+1) {
            System.out.println(integerArray[i]);
        }
    }
}