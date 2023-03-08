import java.util.Scanner;

public class Hello {

  public static void main(String[] args) {
//    Scanner in = new Scanner(System.in);

    // Print values from 1 to 100

//    int x = 1;
//
//    while(x < 101) {
//      System.out.println(x);
//      x++;
//    }

//    for(init; condition; post)
//      for(int x = 1; x < 101; x++) {
//        System.out.println(x);
//      }

      String s = "Hello";

      for (char c : s.toCharArray()) {
          System.out.println(c);
      }
  }
}
