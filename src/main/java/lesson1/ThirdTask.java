package lesson1;

import java.util.Scanner;

public class ThirdTask {

  public void solution() {
    Scanner scanner = new Scanner(System.in);

    int fullWeight = 0;
    int peopleCount = 0;

    do {
      fullWeight += scanner.nextInt();
      peopleCount++;
    } while (peopleCount <= 6 && fullWeight <= 450);

    System.out.printf("Общий вес: %d \n", fullWeight);
    System.out.printf("Общее количество людей: %d \n", peopleCount);

    if (fullWeight > 450) {
      System.out.println("Максимальный вес превышен!");
    } else {
      System.out.println("Максимальное количество людей превышено!");
    }
  }
}