package kismia.tests;


import kismia.Core.BrowEnter;
import kismia.pageOptions.FooterPage;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import kismia.pageOptions.FooterPage;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * Created by Kailend on 04.07.2016.
 */
public class FooterTesting extends BrowEnter{

    @Title("Footer - About the project")
    @Test
    public void proek() {
        driver.get("https://kismia.com/");
        FooterPage footerBlock = new FooterPage();
        footerBlock.clikprojektField();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        boolean result = waitForUrlContains("about", 10);
        Assert.assertTrue(result);
    }
    @Title("Footer - Support")
    @Test
    public void maintainTry(){
        driver.get("https://kismia.com/");
        FooterPage footerBlock = new FooterPage();
        footerBlock.clikmaintanField();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        boolean result = waitForUrlContains("support", 10);
        Assert.assertTrue(result);
    }
    @Title("Footer - advice")
    @Test
    public void sovetTry(){
        driver.get("https://kismia.com/");
        FooterPage footerBlock = new FooterPage();
        footerBlock.cliksovetField();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        boolean result = waitForUrlContains("tips", 10);
        Assert.assertTrue(result);
    }
    @Title("Footer - Happy stories")
    @Test
    public void story() {
        driver.get("https://kismia.com/");
        FooterPage footerBlock = new FooterPage();
        footerBlock.clikgoodStoriesField();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        boolean result = waitForUrlContains("stories", 10);

        Assert.assertTrue(result);
    }
    @Title("Footer - Contacts")
    @Test
    public void kontaktClick() {
        driver.get("https://kismia.com/");
        FooterPage footerBlock = new FooterPage();
        footerBlock.clikkontakField();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        boolean result = waitForUrlContains("contacts", 10);
        Assert.assertTrue(result);
    }
    @Title("Footer - Privacy policy")
    @Test
    public void policeTes() {
        driver.get("https://kismia.com/");
        FooterPage footerBlock = new FooterPage();
        footerBlock.clikpoliceField();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        boolean result = waitForUrlContains("privacy", 10);
        Assert.assertTrue(result);
    }
    @Title("Footer - Affiliate program")
    @Test
    public void partnerTes() {
        driver.get("https://kismia.com/");
        FooterPage footerBlock = new FooterPage();
        footerBlock.clikpartField();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        boolean result = waitForUrlContains("partners", 10);

        Assert.assertTrue(result);

    }


}
