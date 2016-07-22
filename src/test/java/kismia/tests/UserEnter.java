package kismia.tests;

import kismia.Core.BrowEnter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;
import kismia.pageOptions.MainPage;

/**
 * Created by Kailend on 21.05.2016.
 */
public class UserEnter extends BrowEnter{


    @Test
    public void enterPage() {
        WebDriverWait wait=new WebDriverWait(driver,10); // ожидание 10 секунд
        MainPage enterPage ;
        enterPage=new MainPage();

        driver.get("https://kismia.com/");
        String mail="gvs_1986@mail.ru";
        String password ="3de6mo7n";

        MainPage mainPage;
        mainPage =new MainPage();
        mainPage.emailGet(mail);
        mainPage.passwordGet(password);
        mainPage.clikGet();

        WebDriverWait waitF = new WebDriverWait(driver,5);
        boolean result = waitForUrlContains("u18330363", 10);

        Assert.assertTrue(result);

    }

}
