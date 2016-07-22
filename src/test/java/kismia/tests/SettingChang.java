package kismia.tests;

import kismia.Core.BrowEnter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import kismia.pageOptions.MainPage;
import kismia.pageOptions.SettingsPage;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

import javax.print.attribute.standard.MediaSize;

/**
 * Created by Kailend on 02.07.2016.
 */
public class SettingChang extends BrowEnter{

    String mail="gvs_1986@mail.ru";
    String password ="3de6mo7n";


    @Title("Enter to site")
    @Features("Enter")
    @Stories("Vilid enter")
    @Test(priority = 1)
    public void enterToSite(){
        driver.get("https://kismia.com/");
        MainPage mainPage = new MainPage();
        mainPage.emailGet(mail);
        mainPage.passwordGet(password);
        mainPage.clikGet();
        SettingsPage setPage = new SettingsPage();
        setPage.settingButClic();
    }


    @Title("Change name")
    @Features("Change name user")
    @Stories("Vilid change name user")
    @Test(dependsOnMethods = "enterToSite")
    public void changName() {
        SettingsPage setPage = new SettingsPage();
        String name ="Kai";
        setPage.changName(name);
        setPage.saveButt();
        boolean result=false;
        if (driver.getPageSource().indexOf(name)>0){
            result=true;
        }
        dateSee(name);
        WebDriverWait wait=new WebDriverWait(driver,1);
        Assert.assertTrue(result);

    }

    @Title("Change date")
    @Features("Change date user")
    @Stories("Vilid change date")
    @Test(dependsOnMethods = "enterToSite")
    public void changDate(){

        SettingsPage setPage = new SettingsPage();
        String date="1985-12-05";
        setPage.changDate(date);
        setPage.saveButt();
        boolean result=false;
       if (driver.getPageSource().indexOf(date)>0){
           result=true;
       }
        dateSee(date);
        WebDriverWait wait=new WebDriverWait(driver,5);
        Assert.assertTrue(result);
    }

    @Title("Fail chang")
    @Features("Change date user")
    @Stories("Not valid change")
    @Test(dependsOnMethods = "changDate")
    public void failChangDate(){

        SettingsPage setPage = new SettingsPage();
        String date="2020-12-05";
        setPage.changDate(date);
        setPage.saveButt();
        boolean result=false;
        if (driver.getPageSource().indexOf(date)>0){
            result=true;
        }
        dateSee(date);
        WebDriverWait wait=new WebDriverWait(driver,5);
        Assert.assertTrue(result);
    }



    @Title("Change password")
    @Features("Change password")
    @Stories("Valid change ")
    @Test (dependsOnMethods = "changeNomber")
    public void changPassword(){

        driver.get("https://kismia.com/profile/settings?");

        SettingsPage setPage = new SettingsPage();
        String pass="3de6mo7";
        setPage.changPassword(pass);
        setPage.saveButt();
       dateSee(pass);
        driver.close();
        driver=new ChromeDriver();
        driver.get("https://kismia.com/");
        MainPage mainPage = new MainPage();
        mainPage.emailGet(mail);
        mainPage.passwordGet(pass);
        mainPage.clikGet();
        boolean result = waitForUrlContains("u18330363", 10);
        Assert.assertTrue(result);
        driver.get("https://kismia.com/profile/settings?");
        setPage.changPassword(password);
        setPage.saveButt();
    }

    @Title("Change gender male")
    @Features("Change gender")
    @Stories("Change gender male")
    @Test(dependsOnMethods ="enterToSite" )
    public void changUserGenderMale(){
        SettingsPage setPage = new SettingsPage();
        setPage.changGenderMale();
        setPage.saveButt();
        boolean result=setPage.chekGenderUser();
        WebDriverWait wait=new WebDriverWait(driver,5);
        Assert.assertFalse(result);

    }

    @Title("Change gender famale")
    @Features("Change gender")
    @Stories("Change gender Famale")
    @Test(dependsOnMethods ="enterToSite" )
    public void changUserGenderFamale(){
        SettingsPage setPage = new SettingsPage();
        setPage.changGenderFamale();
        setPage.saveButt();
        boolean result=setPage.chekGenderUser();
        WebDriverWait wait=new WebDriverWait(driver,5);
        Assert.assertTrue(result);
    }

    @Title("Change search gender male")
    @Features("Change search gender")
    @Stories("Change search gender male")
    @Test(dependsOnMethods ="enterToSite" )
    public void changSearcGenderMail(){
        SettingsPage setPage = new SettingsPage();
        setPage.changSearchMail();
        setPage.saveButt();
        boolean result=setPage.chekGenderSearch();
        WebDriverWait wait=new WebDriverWait(driver,5);
        Assert.assertFalse(result);
    }

    @Title("Change search gender famale")
    @Features("Change search gender")
    @Stories("Change search gender Famale")
    @Test(dependsOnMethods ="enterToSite" )
    public void changSearcGenderFamail(){
        SettingsPage setPage = new SettingsPage();
        setPage.changSearchFamail();
        setPage.saveButt();
        boolean result=setPage.chekGenderSearch();
        WebDriverWait wait=new WebDriverWait(driver,5);
        Assert.assertTrue(result);
    }

    @Title("Change age from")
    @Features("Change age  from")
    @Stories("Valid chang age")
    @Test(dependsOnMethods ="enterToSite")
    public void changeAgeFrom(){
        SettingsPage setPage=new SettingsPage();

        int age=21;
        setPage.changAgeFrom(age);
        setPage.saveButt();
        boolean result =setPage.chekAgeFrom(Integer.toString(age));
        dateSee(age);
        WebDriverWait wait=new WebDriverWait(driver,5);
        Assert.assertTrue(result);
    }
    @Title("Change age from")
    @Features("Change age from")
    @Stories("Not valid chang age")
    @Test(dependsOnMethods ="changeAgeFrom")
    public void failChangeAgeFrom(){
        SettingsPage setPage=new SettingsPage();

        int age=16;
        setPage.changAgeFrom(age);
        setPage.saveButt();
        boolean result =setPage.chekAgeFrom(Integer.toString(age));
        dateSee(age);
        WebDriverWait wait=new WebDriverWait(driver,5);
        Assert.assertTrue(result);
    }



    @Title("Change age to")
    @Features("Change age to")
    @Stories("Valid change age")
    @Test(dependsOnMethods ="enterToSite")
    public void changeAgeTo(){
        SettingsPage setPage=new SettingsPage();
        int age=25;
        setPage.changAgeTo(age);
        setPage.saveButt();
        boolean result =setPage.chekAgeTo(Integer.toString(age));
        dateSee(age);
        WebDriverWait wait=new WebDriverWait(driver,5);
        Assert.assertTrue(result);
    }

    @Title("Change nomber")
    @Features("Change nomber user")
    @Stories("Valid chang")
    @Test(dependsOnMethods ="enterToSite")
    public void changeNomber(){
        SettingsPage setPage=new SettingsPage();
        String nomber="79033333113";
        setPage.changPhoneNumber(nomber);
        setPage.saveButt();


        boolean result=false;
        if (driver.getPageSource().indexOf(nomber)>0){
            result=true;
        }
        dateSee(nomber);
        WebDriverWait wait=new WebDriverWait(driver,5);
        Assert.assertTrue(result);
    }
    @Step("{0}")
    public void dateSee(String str){
    }

    @Step("{0}")
    public void dateSee(int str){
    }

//    @Step("{0]")
//    public void tryWork(String str){
//        SettingsPage setPage=new SettingsPage();
//        setPage.changPhoneNumber(str);
//        setPage.saveButt();
//    }

}
