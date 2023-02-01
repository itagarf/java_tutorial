class loop {
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
    }
}
