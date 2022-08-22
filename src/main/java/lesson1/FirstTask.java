package lesson1;

import java.util.Scanner;

public class FirstTask {

  public void solution() {
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();

    if (input > 500) {
      int hundreds = input / 100;
      int tensAndUnits = input % 100;
      int units = tensAndUnits % 10;
      int tens = tensAndUnits - units;

      System.out.println(units * 100 + tens + hundreds);
    } else {
      int tensAndUnits = input % 100;
      int units = tensAndUnits % 10;
      int tens = tensAndUnits / 10;

      System.out.println(input - tensAndUnits + units * 10 + tens);
    }
  }
}
