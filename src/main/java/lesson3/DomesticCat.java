package lesson3;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class DomesticCat extends Cat<Sofa> implements Grafted, Pedigreed, ToyPlayer<Object> {

  private final List<String> favoriteFood = new LinkedList<>();
  private String breed;
  private Date lastGraftDate;

  private final List<Object> toys = new LinkedList<>();

  private DomesticCat() {
    favoriteFood.add("Kiteket");
    favoriteFood.add("Viskas");
  }

  public DomesticCat(Gender gender) {
    this();
    this.gender = gender;
  }

  public DomesticCat(Gender gender, String breed) {
    this(gender);
    this.breed = breed;
  }

  @Override
  protected List<String> getFavoriteFood() {
    return favoriteFood;
  }

  @Override
  public String getBreed() {
    return breed;
  }

  @Override
  public void addGraft() {
    lastGraftDate = new Date();
  }

  @Override
  public boolean isGraftExpired() {
    if (lastGraftDate == null) {
      return true;
    }
    return System.currentTimeMillis() - lastGraftDate.getTime() > GRAFT_EXPIRATION_TIME;
  }

  @Override
  public void addToy(Object toy) {
    toys.add(toy);
  }

  @Override
  public List<Object> getToys() {
    return toys;
  }
}
