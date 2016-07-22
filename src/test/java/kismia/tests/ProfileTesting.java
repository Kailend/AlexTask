package kismia.tests;


import kismia.Core.BrowEnter;
import kismia.pageOptions.MainPage;
import kismia.pageOptions.ProfilePage;
import kismia.pageOptions.SettingsPage;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;



/**
 * Created by Kailend on 04.07.2016.
 */
public class ProfileTesting extends BrowEnter{

    String mail="gvs_1986@mail.ru";
    String password ="3de6mo7n";

    @Test(priority = 1)
    public void enterToSite(){
        driver.get("https://kismia.com/");
        MainPage mainPage = new MainPage();
        mainPage.emailGet(mail);
        mainPage.passwordGet(password);
        mainPage.clikGet();
        SettingsPage setPage = new SettingsPage();
    }

    @Test(dependsOnMethods = "enterToSite")
    public void statusWrite(){
       driver.get("https://kismia.com/profile");
        ProfilePage prof=new ProfilePage();
        prof.addStatus("Life is good!!!");
        prof.saveStatusButton();
        boolean result=false;
        if (driver.getPageSource().indexOf("Life is good!!!")>0){
            result=true;
        }
        WebDriverWait wait=new WebDriverWait(driver,1);
        Assert.assertTrue(result);

    }

    @Test(dependsOnMethods = "enterToSite")
    public void meetRoom(){
        driver.get("https://kismia.com/profile");
        ProfilePage prof=new ProfilePage();
        prof.enterMeetingRoom();
        boolean result=waitForUrlContains("meeroom", 10);
        WebDriverWait wait=new WebDriverWait(driver,1);
        Assert.assertTrue(result);
    }

    @Test(dependsOnMethods = "enterToSite")
    public void letToMe(){
        driver.get("https://kismia.com/profile");
        ProfilePage prof=new ProfilePage();
        prof.fitToMeEnter();
        boolean result=waitForUrlContains("suitable", 10);
        WebDriverWait wait=new WebDriverWait(driver,1);
        Assert.assertTrue(result);
    }

    @Test(dependsOnMethods = "enterToSite")
    public void myGests(){
        driver.get("https://kismia.com/profile");
        ProfilePage prof=new ProfilePage();
        prof.myVisitorsEnter();
        boolean result=waitForUrlContains("visitors", 10);
        WebDriverWait wait=new WebDriverWait(driver,1);
        Assert.assertTrue(result);
    }

    @Test(dependsOnMethods = "enterToSite")
    public void myMasseg(){
        driver.get("https://kismia.com/profile");
        ProfilePage prof=new ProfilePage();
        prof.massegerEnter();
        boolean result=waitForUrlContains("messages", 10);
        WebDriverWait wait=new WebDriverWait(driver,1);
        Assert.assertTrue(result);
    }

    @Test(dependsOnMethods = "enterToSite")
    public void iLike(){
        driver.get("https://kismia.com/profile");
        ProfilePage prof=new ProfilePage();
        prof.iLikeEnter();
        boolean result=waitForUrlContains("favd", 10);
        WebDriverWait wait=new WebDriverWait(driver,1);
        Assert.assertTrue(result);
    }
    @Test(dependsOnMethods = "enterToSite")
    public void mathes(){
        driver.get("https://kismia.com/profile");
        ProfilePage prof=new ProfilePage();
        prof.matchesEnter();
        boolean result=waitForUrlContains("list", 10);
        WebDriverWait wait=new WebDriverWait(driver,1);
        Assert.assertTrue(result);
    }
    @Test(dependsOnMethods = "enterToSite")
    public void faivorite(){
        driver.get("https://kismia.com/profile");
        ProfilePage prof=new ProfilePage();
        prof.faivoriteEnter();
        boolean result=waitForUrlContains("selected", 10);
        WebDriverWait wait=new WebDriverWait(driver,1);
        Assert.assertTrue(result);
    }

    @Test(dependsOnMethods = "enterToSite")
    public void block(){
        driver.get("https://kismia.com/profile");
        ProfilePage prof=new ProfilePage();
        prof.blockedEnter();
        boolean result=waitForUrlContains("delete", 10);
        WebDriverWait wait=new WebDriverWait(driver,1);
        Assert.assertTrue(result);
    }

}

