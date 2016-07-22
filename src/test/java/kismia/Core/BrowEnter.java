package kismia.Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

/**
 * Created by Kailend on 21.05.2016.
 */
    public class BrowEnter extends MetodFacrors{


    @BeforeTest
    @Parameters({"web"})
    public void setUp(String web){
    chooseBrowser(web);
       // driver=new ChromeDriver();


        driver.manage().window().maximize();  // максимальный размер окна
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

    }

    @AfterTest
    public void terDown(){
        driver.close();
        driver.quit();

        }

}
