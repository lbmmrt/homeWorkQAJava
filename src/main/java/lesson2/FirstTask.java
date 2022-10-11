package lesson2;

public class FirstTask {

  public Boolean isPointInsideCircle(int circleCenterX, int circleCenterY, int circleRadius, int pointX, int pointY) {
    return ((pointX - circleCenterX) ^ 2 + (pointY - circleCenterY) ^ 2) < (circleRadius ^ 2);
  }
}
