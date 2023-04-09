class Employee{

    static String company; 
    String name;
    String position;
    int salary;

    public void show(){
        System.out.println("Company: " + company + "\n Name: " + name + "\n Position: " + position + "\n salary: " + salary);
    }

    public static void show1(){
        System.out.println("Company: " + company); 
    }
    /* You can use a static variable inside a static method, but can't use a non-static variable inside a static method. 
    * e.g name, position, and salary can't be called here.
     * This is solved in the next static method, show2 by using object references because we can differentiate the objects or variable.
    */

    public static void show2(Employee emp1){
        System.out.println("Company: " + company + "\n Name: " + emp1.name + "\n Position: " + emp1.position + "\n salary: " + emp1.salary);
    }
}



public class static_method  {
    
    public static void main(String args[]){

        Employee emp1 = new Employee();
        Employee.company = "Genesys";
        emp1.name = "Kevwe";
        emp1.position = "Manager";
        emp1.salary = 2000;

        Employee.show1();

        Employee.show2(emp1);
    }


}


