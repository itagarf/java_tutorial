class conditional_statement{
    public static void main(String args[]){
        
        int a = 5;

        if (a < 10 && a < 2)
        System.out.println("Hello First!");
        System.out.println("No Hello First!"); //because the result is false, it skips the first "Hello" and prints "No Hello"
        // But if the result is true, it prints both "Hello" and "No Hello". This isn't the best thing to do.

        //instead we can use "if" and "else"

        if (a < 10 && a > 2)
        System.out.println("Hello Second!");
        else
        System.out.println("No Hello Second!");

        
        // Print the higher number in a conditional statement or something

        int x = 27;
        int y = 91;

        if (x > y)
        System.out.println(x);
        else
        System.out.println(y);




        //Comparing more than two values

        int i = 4;
        int j = 7;
        int k = 11;

        if (k > i && k > j){
            System.out.println("K is greater than i");
            System.out.println("K is also greater than j");
        }
        else
            System.out.println("K is not greater than i and j");


        // Another example

        if (i > j && i > k)
        System.out.println("i is greater than j and k");
        else if (j > i && j > k)    // To make this more efficient, remove j>i and compare j to k because i is false
        System.out.println("j is greater than i and k");
        else
        System.out.println("K is greater than i and j");



        ////////////////////////////////////////////////////////////////

        int b = 6;
        String output = ""; 
        if (b%2 == 0)
        output = "even";
        else 
        output = "odd";
        System.out.println(output);

        //This can also be done using a tenary operator - ?:

        String output1 = "";
        output1 = b%2 == 0 ? "even" : "odd";
        System.out.println(output1);
    }
}