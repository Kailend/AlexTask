package kismia.tests;

import kismia.Core.BrowEnter;
import kismia.pageOptions.MIsmatchPage;
import kismia.pageOptions.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.logging.NeedsLocalLogs;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Attachment;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static kismia.Core.MetodFacrors.driver;

/**
 * Created by Kailend on 21.07.2016.
 */
public class NotRepiatMismatches extends BrowEnter{
    By mismatchesButton=By.xpath(".//a[@href=\"/matches\"]");
    By idUser=By.xpath(".//div[@class=\"matches\"]");
//    String mail="gvs_1986@mail.ru";
//    String password ="3de6mo7n";



    public void sameIdFinder(List list){
        int count=1;
        for (int i=0;i<list.size();i++){
            for (int j=i+1;j<list.size();j++){
                if (list.get(i).equals(list.get(j))){
                    System.out.println(count++ +" ID "+list.get(i)+"index"+i);
                    saveTextIndex(i,count);
                    pngAttachment("E:/");
                    Assert.assertTrue(false);
                }
            }
        }
    }


    @Test
    @Parameters({"count", "mail","password"})
    public void runMatches(int count, String mail,String password){


        int temp=count;
        List<String> list=new ArrayList<>();
        MIsmatchPage mIsmatchPage= new MIsmatchPage();
        driver.get("https://kismia.com/");
        MainPage mainPage = new MainPage();
        mainPage.emailGet(mail);
        mainPage.passwordGet(password);
        mainPage.clikGet();
        driver.findElement(mismatchesButton).click();
        for (int i=0;i<temp;i++){
            driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
            list.add(driver.findElement(idUser).getAttribute("data-yes-user-id").toString());
            count++;
            mIsmatchPage.clickAnserNot();
        }
        sameIdFinder(list);
        saveTextLog(list);


    }

    @Attachment(value = "{0}", type = "text/plain")
    public List saveTextLog(List list) {
        return list;
    }

    @Attachment(value = "{0}", type = "text/plain")
    public String saveTextIndex(int index, int timesRepiat) {
        return "index who repiat"+Integer.toString(index)+", times repiat -"+Integer.toString(timesRepiat);
    }

    @Attachment(value = "{0}", type = "image/png")
    public static byte[] pngAttachment(String fileName){
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        // Now you can do whatever you need to do with it, for example copy somewhere
        try {
            return Files.readAllBytes(Paths.get(scrFile.getPath()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new byte[0];
    }

}
