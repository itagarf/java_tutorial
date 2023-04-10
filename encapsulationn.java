class Person{

    // "Private" keyword is used when the associated vairable is accessible to only the class it belongs to.
    //private String name = "Ahmed";
    private String name;
    private int age;

    //The private data can be accessed with the help of methods
    public void setName(String n){ //setter
        name = n;
        //name is an instance variable, n is a local variable
    }

    public String getName(){ //getter
        return name;
    }

/* 
    public void setAge(int a){ 
        age = a;
        //age is an instance variable, a is a local variable
    }
     */

    public void setAge(int age){ //setter
        this.age = age;
        /*
        Using age = age will result in the local variable, age assigning a value to itself. That is zero (0)
        "This" is a keyword which represents the current object which is calling the method.
        The "this" keyword is used to tell the compiler the variable we are referring to.
         */
    }

    public int getAge(){ //getter
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
