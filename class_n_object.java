class Subtract{
    int a; //Variable

    public int sub(int x, int y){
        //System.out.println("This is the class");
        int r = y - x;
        return r;
    }
}

public class class_n_object{
    public static void main(String args[]){
        int x = 2;
        int y = 7;

        Subtract subtract = new Subtract(); //Creating an object of a class
        //int result = subtract.sub(2,7); // This is hardcoding the value.
        int result = subtract.sub(x,y);
        System.out.println(result); // result = 5
    }
}