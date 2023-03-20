class for_loop {
    public static void main(String args[]){
        for(int i=1; i<=3; i++){
            System.out.println("This is an incrementing for loop " + i);
        }

        for(int i=4; i>=1; i--){
            System.out.println("This is a decrementing for loop " + i);
        }

        //nested loop

        for(int i=1; i<=5; i++){
            System.out.println("Day " + i);
            for(int j=1; j<=9; j++){
                System.out.println(" " + (j+8) + ":00");
            }
        }
    }
}
