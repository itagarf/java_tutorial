public class str_buffer_builder {
    
    public static void main(String args[]){

        //String Buffer
        
        StringBuffer s = new StringBuffer(); //StringBuffer gives a buffer size of 16 bytes
        System.out.println(s.capacity()); //output = 16

        StringBuffer sb = new StringBuffer("Itagar"); 
        System.out.println(sb.capacity()); //output = 22 (This is because it stores "Itagar", then adds 16 spaces extra)
        System.out.println(sb.length()); //output = 6

        sb.append(" Favour");
        System.out.println(sb);

        sb.deleteCharAt(5);
        System.out.println(sb); //output = Itaga Favour (The "r" is missing because it was deleted)

        
        //String Builder
        /* The difference between String Buffer and String Builder is that the former is THREAD SAFE while the later is NOT.
         * 
         * The same methods used in String Buffer are used in the String Builder
         */

    }
}
