public class kunallec1_practice {
    public static void main(String[] args) {
        Me Sundas = new Me("Sundas", 33, 98);
        System.out.println(Sundas.name);
    }
}

class Me {
    String name;
    int rno;
    int grade;

    Me(String name, int rno, int grade) {
        this.name = name;
        this.rno = rno;
        this.grade = grade;
    }
}
