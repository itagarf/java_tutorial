class while_loop {
    public static void main(String args[]){

        //while loop
        int a = 1;
        while (a <= 10){
            System.out.println(a + " Print me!!!!");
            a++;
        }

        //nested while loop
        int i = 1;
        while (i < 5){
            System.out.println(" Print me!!!!");
            int j = 1;
            while (j <= 3){
                System.out.println("I'm in here!!");
                j++;
            }
            i++;
        }

        //Do-while loop

        int b = 5;
        while (b <= 4){
            System.out.println("Print this one!!!");
            b++;
        }  //This doesnt print anything because x is not less than or equal to 4

        //Try this
        int x = 5;
        do{
            System.out.println("Print this one!!!");
            x++;
        }while (x <= 4); //A semi-colon is required here because if you put the while before the curly brackets, the curly brackets becomes a statement, but if you put the while after the curly brackets, you need to end it with a semi-colon

        //The previous statement did not print anything because x is not less than or equal to 4 but the next one will execute the statement at least once before checking the condition


    }
}
