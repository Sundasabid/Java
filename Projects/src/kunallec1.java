public class kunallec1 {
    public static void main(String[] args) {
        // int[] rno = new int[5];
        // String[] names = new String[5];

        //Student students = new Student(int, int);

        Student kunal = new Student(50, 90);
        Student sundas = new Student(15, 95);
        Student random = new Student ();
        kunal.greeting();
        sundas.greeting();

        
        System.out.println(kunal.rno);
        System.out.println(sundas.rno);
        System.out.println(kunal.grade);
        System.out.println(sundas.grade);
        System.out.println(random.grade);

    }
}
class Student{
    int rno;
    int grade;
    void greeting(){
        System.out.println("Hello my grade is"+ grade);
    }

    Student (){
        this (15, 99);
    }

    Student(int rno, int grade){
        this.rno= rno;
        this.grade = grade;
    }
}
//all class objects in java should be alloted dynamically