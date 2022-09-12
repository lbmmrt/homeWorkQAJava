package lesson2;

import java.util.Scanner;

public class SecondTaskMain {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();

    new SecondTask().solution(number);
  }
}
