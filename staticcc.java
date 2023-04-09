class Employee{

    static String company; 
    String name;
    String position;
    int salary;

    /* Everytime we call the constructor, the static variable initialises. Since we don't want to do that, we can create a static block so that it can be called only once instead of everytime.
    Static block is used to initialize the static variables.
    */

    static{
        company = "Genesys";
    }

    public Employee(){
        name = "Logan";
        position = "Associate";
        salary = 900;
    }

    public void show(){
        System.out.println("Company: " + company + "\n Name: " + name + "\n Position: " + position + "\n salary: " + salary);
    }
}



public class staticcc {
    
    public static void main(String args[]) throws ClassNotFoundException{ //Exception is included here because of the class class special class

  /* 
        Commenting this block out to run the class class special class
  
        Employee emp1 = new Employee();
        Employee.company = "Genesys";
        emp1.name = "Kevwe";
        emp1.position = "Manager";
        emp1.salary = 2000;

        Employee emp2 = new Employee();

        emp1.show();
        emp2.show(); 
        
        */


        /* 
        Typically, if we don't create the object, it will not load the class. So if we don't write "Employee emp2 = new Employee;", the static variable nor the class will not be called. 

        We can also load the class without without creating the object.
        This can be done by using a special class provided by Java called Class class (forName) 
        */

        Class.forName("Employee");

    }

}

