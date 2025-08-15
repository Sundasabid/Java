import java.util.Scanner;
class Calculator {
  public int add (int a, int b) {
  int sum = a+b;
  return sum;
  }
}

public class Practicebeforeuni {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Calculator calc=new Calculator();
      System.out.print("Enter the num: ");
      int num1 =sc.nextInt();
      int num2=3;
      int result = calc.add(num1, num2);
      System.out.println(result);
      //System.out.print(sum);

    }
}

//oject have properties as well as behaviours
//class object bnanay kay liye blueprint (nishani) bnata hai class mein methods
//be define hpty hain ie functions eg public int add{}
//CLASS: NAMED GROUP OF PROPERTIES AND FUNCTION.
