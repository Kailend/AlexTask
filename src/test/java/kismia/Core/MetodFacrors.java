package kismia.Core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Kailend on 21.05.2016.
 */
public class MetodFacrors {
    public static WebDriver driver;

    public WebDriver chooseBrowser(String brow){
        if (brow.equalsIgnoreCase("ch")){
            return driver=new ChromeDriver();
        }
        if (brow.equalsIgnoreCase("ie")){
            return driver=new InternetExplorerDriver();
        }
        if (brow.equalsIgnoreCase("ff")){
            return driver=new FirefoxDriver();
        } else return driver;

    }


    public boolean waitForUrlContains(String text, int sec){
        for(int i = 0; i<=sec*10; i++){
            if(driver.getCurrentUrl().contains(text)) {
                return true;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public boolean isElement(By by){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        List<WebElement> elementList=driver.findElements(by);     //(".//div[@id='u_0_5']/../div[@class=\"_5dbb _5634\"]"));
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        //System.out.println(elementList);
        if (elementList.size()>0) {
            return true;
        }
        else{
            return false;
        }

    }

}
