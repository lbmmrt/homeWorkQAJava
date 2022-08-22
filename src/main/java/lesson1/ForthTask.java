package lesson1;

import java.util.Arrays;
import java.util.Random;

public class ForthTask {

  private final Random rand = new Random();

  public int[][] solution() {

    int[] firstArray = new int[20];
    int[] secondArray = new int[20];

    for (int i = 0; i < 20; i++) {
      firstArray[i] = rand.nextInt(50);
      secondArray[i] = rand.nextInt(50);
    }

    int[][] arrays = new int[2][20];
    int firstIndex = 0;
    int secondIndex = 0;

    for (int i = 0; i < 20; i++) {
      final int tmpIndex = i;
      if (Arrays.stream(firstArray).noneMatch(j -> j == secondArray[tmpIndex])) {
        arrays[0][firstIndex] = secondArray[tmpIndex];
        firstIndex++;
      }
      if (Arrays.stream(secondArray).noneMatch(j -> j == firstArray[tmpIndex])) {
        arrays[1][secondIndex] = firstArray[tmpIndex];
        secondIndex++;
      }
    }

    return arrays;
  }
}
