package kismia.tests;

import kismia.Core.BrowEnter;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import kismia.pageOptions.FooterPage;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * Created by Kailend on 21.05.2016.
 */
public class LangTest extends BrowEnter{

    @Title("English")
    @Test
    public void langEng(){
        driver.get("https://kismia.com/");
        FooterPage footerBlock = new FooterPage();
        footerBlock.clikenglishField();
        WebDriverWait wait = new WebDriverWait(driver,5);
        boolean result = waitForUrlContains("en.", 10);
        Assert.assertTrue(result);
    }
    @Title("Portugal")
    @Test
    public void langPort(){
        driver.get("https://kismia.com/");
        FooterPage footerBlock = new FooterPage();
        footerBlock.clickPortugalLang();
        WebDriverWait wait = new WebDriverWait(driver,5);
        boolean result = waitForUrlContains("pt.", 10);
        Assert.assertTrue(result);
    }
    @Title("Espanoil")
    @Test
    public void langEspanol(){
        driver.get("https://kismia.com/");
        FooterPage footerBlock = new FooterPage();
        footerBlock.clickEspanolLang();
        WebDriverWait wait = new WebDriverWait(driver,5);
        boolean result = waitForUrlContains("es.", 10);
        Assert.assertTrue(result);
    }
    @Title("France")
    @Test
    public void langFrance(){
        driver.get("https://kismia.com/");
        FooterPage footerBlock = new FooterPage();
        footerBlock.clickFranceLang();
        WebDriverWait wait = new WebDriverWait(driver,5);
        boolean result = waitForUrlContains("fr.", 10);
        Assert.assertTrue(result);
    }

    }

