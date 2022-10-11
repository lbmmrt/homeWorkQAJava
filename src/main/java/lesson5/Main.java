package lesson5;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();

    ZeroRemainder zeroRemainder = value -> value % 13 == 0;
    System.out.println(zeroRemainder.divide(input));

    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    double c = scanner.nextDouble();

    DiscriminantFinder discriminantFinder = (a1, b1, c1) -> b1 * b1 - 4 * a1 * c1;
    System.out.println(discriminantFinder.execute(a, b, c));
  }
}
