package kismia.pageOptions;

import kismia.Core.MetodFacrors;
import org.openqa.selenium.By;

/**
 * Created by Kailend on 21.07.2016.
 */
public class MIsmatchPage extends MetodFacrors{

By notLikeBatton = By.xpath("//button[@value=\"1\"]");


    public void clickAnserNot(){
        driver.findElement(notLikeBatton).click();
    }

}
