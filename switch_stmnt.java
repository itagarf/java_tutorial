class switch_stmnt {
    public static void main(String args[]){
        int grade = 70;
        switch(grade) {
            case 70:
                System.out.println("A");
                break;
            case 60:
                System.out.println("B");
                break;
            case 50:
                System.out.println("C");
                break;
            case 45:
                System.out.println("D");
                break;
            case 40:
                System.out.println("E");
                break;
            case 39:
                System.out.println("F");
                break;
            default:
            System.out.println("Invalid number");
        }
    }
}
