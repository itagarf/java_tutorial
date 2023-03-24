class Trial{
    
    public void blah()//Because of "void", it is not returning anything but performing an operation
    {
        System.out.println("Blah method");
    }

    public String notBlah(int number){
        if (number >= 10)
            return "Number is more than 9";
        else
            return "Number is less than 10";
    }

    //METHOD OVERLOADING - This is giving different methods in a class the same name with different parameters
    public int sum(int a, int b, int c){
        return a+b+c;
    }
    public int sum(int a, int b){
        return a+b;
    }
    public float sum(float a, int b){
        return a+b;
    }
}

public class method {
    public static void main(String args[]){

        Trial trial = new Trial();
        trial.blah();
        String output = trial.notBlah(6);
        System.out.println(output); 

    }
    
}
