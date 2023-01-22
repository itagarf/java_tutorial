//Conversion is automatic conversion while casting is explicit conversion

class type_castng_convrsn {
    public static void main(String a[]){
        //To convert float to an integer, you need to typecast instead of implicitly converting it
        float f = 3.7f;
        int i = (int)f;
        System.out.println(i); //result: 3

        //To convert an int to a byte, you need to typecast it as implicitly converting int to byte will not work
        int n = 129;
        byte b = (byte) n;
        System.out.println(b);


        //Type remotion
        byte x = 40;
        byte y = 40;
        int result = x * y;
        System.out.println(result);
        
    }
}
