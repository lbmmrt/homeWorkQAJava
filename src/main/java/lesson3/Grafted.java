package lesson3;

import java.util.concurrent.TimeUnit;

public interface Grafted {

  long GRAFT_EXPIRATION_TIME = TimeUnit.DAYS.toDays(365);

  void addGraft();

  boolean isGraftExpired();
}
