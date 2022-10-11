package lesson3;

import java.util.LinkedList;
import java.util.List;

public class WildCat extends Cat {


  private final List<String> favoriteFood = new LinkedList<>();
  private boolean isHunting;

  private WildCat() {
    favoriteFood.add("Zebra");
    favoriteFood.add("Bird");
    favoriteFood.add("Mouse");
  }

  public WildCat(Gender gender) {
    this();
    this.gender = gender;
  }

  @Override
  protected List<String> getFavoriteFood() {
    return favoriteFood;
  }

  @Override
  public boolean feed(String food) {
    if (isHunting) {
      return false;
    } else {
      return super.feed(food);
    }
  }

  public void startHunting() {
    isHunting = true;
  }

  public void endHunting() {
    isHunting = false;
  }
}
