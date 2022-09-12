package lesson3;

import java.util.LinkedList;
import java.util.List;

public enum Breed {
  MAIN_COON, RAGDOLL, PERSIAN, SIAMESE, SPHYNX, BENGAL;

  public static List<Breed> getPopularBreeds() {
    List<Breed> breeds = new LinkedList<>();
    breeds.add(MAIN_COON);
    breeds.add(PERSIAN);
    breeds.add(BENGAL);

    return breeds;
  }
}
