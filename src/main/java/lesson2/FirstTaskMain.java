package lesson2;

import java.util.Scanner;

public class FirstTaskMain {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int circleCenterX = scanner.nextInt();
    int circleCenterY = scanner.nextInt();
    int circleRadius = scanner.nextInt();
    int pointX = scanner.nextInt();
    int pointY = scanner.nextInt();

    FirstTask firstTask = new FirstTask();
    boolean result = firstTask.isPointInsideCircle(circleCenterX, circleCenterY, circleRadius, pointX, pointY);

    System.out.println(result);
  }
}
