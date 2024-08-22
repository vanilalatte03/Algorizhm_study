package chap01;
import java.util.Scanner;


public class Question03 {
  class Min3 {
    static int min4(int a, int b, int c, int d){
      int min = a;
      if(b < min)
        min = b;
      if(c < min)
        min = c;
      if(c < min)
        min = d;

      return min;

    }
  }
public static void main(String[] args) {
  @SuppressWarnings("resource")
  Scanner stdIn = new Scanner(System.in);

  System.out.print("a=의 값 : "); int a = stdIn.nextInt();
  System.out.print("b=의 값 : "); int b = stdIn.nextInt();
  System.out.print("c=의 값 : "); int c = stdIn.nextInt();
  System.out.print("c=의 값 : "); int d = stdIn.nextInt();

  System.out.println("최솟값은" + Min3.min4(a, b, c, d) +"입니다.");
  }
}
