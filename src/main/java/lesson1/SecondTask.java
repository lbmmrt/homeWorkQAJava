package lesson1;

public class SecondTask {
  public void solution() {

    for (int i = 100; i <= 990; i += 10) {
      int sum = 0;
      for (int j = 1; j <= i; j++) {
        if (i % j == 0 && j % 2 != 0) {
          sum += j;
        }
      }
      if (sum % 10 == 0) {
        System.out.println(i);
      }
    }
  }
}
