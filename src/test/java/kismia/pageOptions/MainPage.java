package kismia.pageOptions;

import kismia.Core.BrowEnter;
import kismia.Core.MetodFacrors;
import kismia.Core.MetodFacrors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Kailend on 21.05.2016.
 */
public class MainPage extends MetodFacrors {
     By emailField = By.xpath(".//*[@id='user-email']");
     By passwField = By.xpath(".//*[@id='user-password']");
    By buttonEnter = By.xpath(".//*[@id='sign-in-form']/button");

    public void emailGet(String mail) {
        driver.findElement(emailField).clear();
        driver.findElement(emailField).sendKeys(""+mail+"");
    }
    public void passwordGet(String pasword) {

        driver.findElement(passwField).clear();
        driver.findElement(passwField).sendKeys(pasword);
    }

     public void clikGet(){
        driver.findElement(buttonEnter).click();

    }
    public  String inditificat(){
        String url = driver.getCurrentUrl();
        return url;
    }
}