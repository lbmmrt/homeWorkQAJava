import com.codeborne.selenide.WebDriverRunner;
import lesson8.MainPageObj;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class MainTest {

  @Test
  public void logInFromMainPage() {
    MainPageObj mainPageObj = open(MainPageObj.BASE_URL, MainPageObj.class);
    Assert.assertTrue(mainPageObj.isVisibleDownloadApplicationForIOSButton());
  }

  @Test
  public void checkOpenSearchPage() {
    MainPageObj mainPageObj = open(MainPageObj.BASE_URL, MainPageObj.class);
    mainPageObj.setValueInSearchField("Зеленая книга").clickSearchButton();
    String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
    Assert.assertEquals(currentUrl, "https://www.kinopoisk.ru/index.php?kp_query=%D0%97%D0%B5%D0%BB%D0%B5%D0%BD%D0%B0%D1%8F+%D0%BA%D0%BD%D0%B8%D0%B3%D0%B0", "Адрес не совпадает");
  }
}
