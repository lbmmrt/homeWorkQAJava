package lesson2;

public class SecondTask {

  public void solution(Integer num) {
    printNumberByDigits(num);
  }

  private void printNumberByDigits(Integer num) {
    if (num == 0) return;

    printNumberByDigits(num / 10);

    System.out.println(num % 10);
  }
}
