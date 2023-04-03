class Student{
    int regNo;
    String name;
    int score;
}

public class array2 {
    
    public static void main(String args[]){

        /* Create objects mannually */
        Student s1 = new Student();
        s1.regNo = 1;
        s1.name = "Amaka";
        s1.score = 92;

        Student s2 = new Student();
        s2.regNo = 2;
        s2.name = "Kabiru";
        s2.score = 71;

        Student s3 = new Student();
        s3.regNo = 3;
        s3.name = "Okeh";
        s3.score = 89;

        /* An array to hole the references to the students
        * The objects created are assigned to an array
         */
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i=0; i<students.length; i++){
            System.out.println(students[i].name + ": " + students[i].score);
        }

        //For each (or enhanced for loop)
        for (Student student : students){
            System.out.println(student.name + " : " + student.score);
        }
    }
}
