public class array {

    public static void main(String args[]){
        int nums[] = {2,4,6,8};
        //To make this dynamic, we use a different syntax:
        int nums1[] = new int[4];
        nums[2] = 10; //update the 3rd index

        nums1[0] = 2;
        nums1[1] = 4;
        nums1[2] = 6;
        nums1[3] = 8;

        System.out.println(nums[2]);
        System.out.println(nums1[2]); //To output all of them, there will be repitition of code. Therefore, it is nice to use a loop

        for(int i=0; i<4; i++){
            System.out.println(nums1[i]);
        }

        
        System.out.println("Mult-dimensional array");


        //Multi-dimensional array

        int mult[][] = new int[3][4];

        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                mult[i][j] = (int)(Math.random() * 10);
                System.out.print(mult[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println("Mult-dimensional array");
        
        //Enhanced For-loop

        for(int n[] : mult){
            for(int m: n){
                System.out.print(m + " ");
            }
            System.out.println();
        }

    }
}
