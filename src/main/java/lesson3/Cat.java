package lesson3;

import java.util.List;

public abstract class Cat<T extends SleepingPlace> {

  protected Gender gender;

  private int pawsCount = 4;

  protected T sleepingPlace;

  protected void setPawsCount(int pawsCount) {
    this.pawsCount = pawsCount;
  }

  public int getPawsCount() {
    return pawsCount;
  }

  public boolean feed(String food) {
    return getFavoriteFood().contains(food);
  }

  protected abstract List<String> getFavoriteFood();

  public final Gender getGender() {
    return gender;
  }

  public final void setSleepingPlace(T sleepingPlace) {
    this.sleepingPlace = sleepingPlace;
  }
}
