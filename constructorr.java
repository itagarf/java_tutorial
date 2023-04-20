/* Constructor is a special method. It has the same name as a class name. It never returns anything.
 * Just mention the access (public or private) and the name of the class.
 */

class Person{
    private String name;
    private int age;

/*     public Person(){
        System.out.println("In Constructor");
    } 
        This constructor is commented out although the comment in the main method points to this.
    */

    public Person(){
        age = 23;
        name = "Mike"; // When the main method is called, this results in Mike : 23

        /* An important aspect of constructors is: 
        When an application is trying to connect to a database or a network, the connection can be written in the constructor.
         */
    }

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}

public class constructorr {
    public static void main(String args[]){

        Person man = new Person();
        System.out.println(man.getName() + " : " + man.getAge());
        /* The output is:
         * In Constructor
           null : 0
        This is because when we create an object (Person man = new Person();), the constructor is called first.
        If we create two objects (Person man = new Person(); and Person man1 = new Person();), the constructor will be called twice resulting in the output:
            In Constructor
            In Constructor
            null : 0
          */

        man.setName("Mike");
        man.setAge(23);
    }
    
}
