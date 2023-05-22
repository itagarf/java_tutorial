/* Whenever you create an object of a class, it will call the constructor of subclass and superclass both.
 * First is the superclass and Second is the subclass.
 */


 /* You don't need to mention super() in the constructor unless you want to make some changes.
  * Every constructor has a method which is "super" whether you mention it or not. 
  * e.g 
    class First{
        public First(){
            super();
            System.out.println("In the First Constructor");
        }
        public First(int f){
            super();
            System.out.println("In the First parameterized Constructor");
        }
    }

    class Second extends First{
        public Second(){
            super();
            System.out.println("In the Second Constructor");
        }
        public Second(int s){
            super();
            System.out.println("In the Second parameterized Constructor");
        }
    }
 */

 /* Every class in Java extends the OBJECT class. The object is a class in Java which has lots of methods. 
    You don't need to mention it all the time but it is present. 
    Hence "super" in the first default and parameterized constructors makes sense.
    The "super" here is calling the constructor of the object class.
    * Therefore, Second extends First, First extends constructor of the Object class.
    */

class First{
    public First(){
        System.out.println("In the First Constructor");
    }
    public First(int f){
        System.out.println("In the First parameterized Constructor");
    }
}

class Second extends First{
    public Second(){
        System.out.println("In the Second Constructor");
    }
    public Second(int s){
        super(s); // A value is passed here because the default constructor of the superclass will be called if no value is passed.
        System.out.println("In the Second parameterized Constructor");
    }

    public Second(int s, int a){
        this(); // The use of "this" keyword in the constructor
        System.out.println("In the Second parameterized Constructor in float");
    }
}

public class this_super {
    public static void main(String args[]){
        Second s = new Second();
        /* The output of running this is:
         * In the First Constructor
         * In the Second Constructor
         * This is because it calls both constructors.
         */

         // Doing the same for parameterized constructors:
         Second s1 = new Second(5);
         /* The output of running this is:
          * In the First parameterized Constructor
          * In the Second parameterized Constructor
          This is because the parameterized constructor of the superclass is called instead of the default constructor.
          */


          //Now, we want to get the call the default constructor of First and both constructors of Second.
          /* We will use the keyword "this" to execute the constructor of the same class 
             while the "super" keyword is used to execute the constructor of superclass.
          */
         Second s2 = new Second(5, 7);
        /*  The output of this is:
         *  In the First Constructor
            In the Second Constructor
            In the Second parameterized Constructor in float
        */
    }
}
