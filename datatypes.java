public class datatypes {
    public static void main(String a[])
    {
        int num1 = 5;
        byte num2 = 127;
        short num3 = 567;
        long num4 = 67473l;

        float num5 = 3.142f;
        double num6 = 3.142;

        char character = 'c';

        boolean b = true;

        //working with literals

        // base 2
        int num10 = 0b101;
        System.out.println(num10); // output = 5

        // hexadecimal
        int num11 = 0x7E;
        System.out.println(num11); // output = 126

        // you can put underscore between zeros to differentiate them
        //e.g.
        int num12 = 100_000_000;
        System.out.println(num12); // output = 100000000

        //double
        //integers get converted to double automatically when the "double" parameter is specified
        double num13 = 12;
        System.out.println(num13); // output = 12.0

        //to store a large number, epsilon (e) can be used
        double num14 = 12e10;
        System.out.println(num14); // output = 1.2E11

        //boolean
        boolean bo = true;
        System.out.println(bo); // output = true

        //character
        char ch = 'a';
        ch++;
        System.out.println(ch); // output = b

    }
}
