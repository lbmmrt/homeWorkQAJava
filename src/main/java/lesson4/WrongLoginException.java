package lesson4;

public class WrongLoginException extends Exception {

  public WrongLoginException() {
    super();
  }

  public WrongLoginException(String message) {
    super(message);
  }
}
