package chap01;
import java.util.Scanner;

public class Question02 {
  class Min3 {
    static int min3(int a, int b, int c){
      int min = a;
      if(b < min)
        min = b;
      if(c < min)
        min = c;

      return min;

    }
  }
public static void main(String[] args) {
  Scanner stdIn = new Scanner(System.in);

  System.out.print("a=의 값 : "); int a = stdIn.nextInt();
  System.out.print("b=의 값 : "); int b = stdIn.nextInt();
  System.out.print("c=의 값 : "); int c = stdIn.nextInt();

  System.out.println("최솟값은" + Min3.min3(a, b, c) +"입니다.");
  }
}
