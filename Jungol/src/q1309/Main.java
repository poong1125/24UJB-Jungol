package q1309;

import java.util.Scanner;

public class Main {
   public static long factorial(long p) {
      if (p == 0)
         return 1;
      else {
         System.out.print(p + "! = ");
         if (p == 1)
            System.out.println(p);
         else
            System.out.println(p + " * " + (p - 1) + "!");
         return p * factorial(p - 1);
      }
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      long P = sc.nextInt();
      sc.close();

      System.out.println(factorial(P));
   }
}
