package lesson8;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPageObj {

  public static final String BASE_URL = "https://www.kinopoisk.ru";

  //поле для поиска фильмов
  @FindBy(how = How.XPATH, using = "//input[@placeholder='Фильмы, сериалы, персоны']")
  private SelenideElement searchField;

  //кнопка для запуска поиска
  @FindBy(how = How.XPATH, using = "//button[@data-tid='f49ca51f']")
  private SelenideElement searchButton;

  //кнопка для скачивания приложения в AppleStore
  @FindBy(how = How.XPATH, using = "//a[@href='https://10267.redirect.appmetrica.yandex.com/mainView?appmetrica_tracking_id=170895231946863928']")
  private SelenideElement downloadApplicationForIOSButton;

  public void clickSearchButton() {
    searchButton.click();
  }

  public MainPageObj setValueInSearchField(String text) {
    searchField.setValue(text);
    return this;
  }

  public boolean isVisibleDownloadApplicationForIOSButton() {
    return downloadApplicationForIOSButton.scrollTo().is(Condition.visible);
  }

}
