package chap01;
import java.util.Scanner;
public class Question01 {

  class Max4 {
    static int max4(int a, int b, int c, int d){
      int max = a;
      if(b > max) 
        max = b;
      if(c > max) 
        max = c;
      if(d > max) 
        max = d;
      
        return max;


    }

  }
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.print("a=의 값 : "); int a = stdIn.nextInt();
    System.out.print("b=의 값 : "); int b = stdIn.nextInt();
    System.out.print("c=의 값 : "); int c = stdIn.nextInt();
    System.out.print("d=의 값 : "); int d = stdIn.nextInt();

    System.out.println("최댓값은 " + Max4.max4(a, b, c, d) + "입니다.");


  }
}
