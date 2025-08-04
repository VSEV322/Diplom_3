package tests;

import io.qameta.allure.Description;
import org.junit.Test;
import pages.ConstructorPage;

import static helper.ConstantURL.CONSTRUCTOR_PAGE;
import static helper.Waiter.waitFor;

public class ConstructorTests extends BaseTest {

    @Test
    @Description("Проверка перехода к разделу 'Соусы' при нажатии на раздел 'Соусы'.")
    public void transferToSousesTest() {
        driver.get(CONSTRUCTOR_PAGE);

        ConstructorPage constructorPage = new ConstructorPage(driver);
        constructorPage.clickSousesButton();
        constructorPage.checkSelectedSectionSousesText();
    }

    @Test
    @Description("Проверка перехода к разделу 'Начинки' при нажатии на раздел 'Начинки'.")
    public void transferToFillingsTest() {
        driver.get(CONSTRUCTOR_PAGE);

        ConstructorPage constructorPage = new ConstructorPage(driver);
        constructorPage.clickFillingsButton();


        constructorPage.checkSelectedSectionFillingsText();
    }

    @Test
    @Description("Проверка перехода к разделу 'Булки' при нажатии на раздел 'Булки'.")
    public void transferToBunsTest() {
        driver.get(CONSTRUCTOR_PAGE);

        ConstructorPage constructorPage = new ConstructorPage(driver);
        constructorPage.clickSousesButton();


        constructorPage.clickBunsButton();


        constructorPage.checkSelectedSectionBunsText();
    }
}
