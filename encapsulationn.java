class Person{

    // "Private" keyword is used when the associated vairable is accessible to only the class it belongs to.
    //private String name = "Ahmed";
    private String name;
    private int age;

    //The private data can be accessed with the help of methods
    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void setAge(int a){
        age = a;
    }

    public int getAge(){
        return age;
    }
}
public class encapsulationn {
    
    public static void main(String args[]){
        Person man = new Person();
        //man.name = "Ahmed";

        //assign the values with the help of methods
        man.setName("Ahmed");
        man.setAge(20);
        System.out.println("His name is " + man.getName() + ", he is " + man.getAge() + " years old."); //Accessing the the private vairable
    }
}
