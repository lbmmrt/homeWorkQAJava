package lesson4;

public class FirstTask {

  public static boolean setPassword(String login, String password, String confirmPassword) {
    try {
      checkLogin(login);
      checkPassword(password, confirmPassword);
      return true;
    } catch (WrongLoginException | WrongPasswordException exception) {
      return false;
    }
  }

  private static void checkLogin(String login) throws WrongLoginException {
    if (login.length() >= 20 || !login.matches("[A-Za-z0-9_]+")) {
      throw new WrongLoginException();
    }
  }

  private static void checkPassword(String password, String confirmPassword) throws WrongPasswordException {
    if (!password.contentEquals(confirmPassword) || password.length() >= 20 || !password.matches("[A-Za-z0-9_]+")) {
      throw new WrongPasswordException();
    }
  }
}
