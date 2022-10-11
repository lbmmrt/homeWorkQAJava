package lesson3;

import java.util.List;

public interface ToyPlayer <T>{
  void addToy(T toy);
  List<T> getToys();
}
