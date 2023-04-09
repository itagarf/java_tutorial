class Employee{

    //instance variables

    //String company; // The "company" variable will be set to "static" to make it common to all the objects
    static String company; // static has been added.
    String name;
    String position;
    int salary;

    public void show(){
        //local variables
        System.out.println("Company: " + company + "\n Name: " + name + "\n Position: " + position + "\n salary: " + salary);
    }
}



public class staticc {
    
    public static void main(String args[]){

        /* Both employees belong to the same company, hence, we need to make the "company" variable static.
         * static variables should be called withe the class name itself: Employee. eg Employee.company
         */
        Employee emp1 = new Employee();
        //emp1.company = "Genesys";
        Employee.company = "Genesys";
        emp1.name = "Kevwe";
        emp1.position = "Manager";
        emp1.salary = 2000;

        Employee emp2 = new Employee();
        //emp2.company = "Genesys";
        Employee.company = "Genesys";
        emp2.name = "Logan";
        emp2.position = "Associate";
        emp2.salary = 900;

        emp1.show();
        emp2.show();

        /* Everytime we call the constructor, the static variable initialises. Since we don't want to do that, we can create a static block so that it can be called only once instead of everytime.

        This is shown in staticcc.java
         */

    }

}
