package kismia.pageOptions;

import kismia.Core.MetodFacrors;
import org.openqa.selenium.By;

/**
 * Created by Kailend on 02.07.2016.
 */
public class SettingsPage extends MetodFacrors{

    By settingButton=By.xpath(".//*[@id='nav']//a[@href=\"/profile/settings\"]");
    By nameField =By.id("settingsName");
    By dateField =By.id("settingsBDate");
    By passwordField =By.id("settingsPassword");
    By confirmPasswordField =By.id("settingsPassword2");
    By genderField=By.id("settingsGender");
    By genderMaile=By.xpath(".//*[@id='settingsGender']/option[@value=\"m\"]");
    By genderFamaile=By.xpath(".//*[@id='settingsGender']/option[@value=\"f\"]");
    By genderFieldSearch=By.id("settingsSearchGender");
    By genderSearchMaile=By.xpath(".//*[@id='settingsSearchGender']/option[@value=\"m\"]");
    By genderSearchFamaile=By.xpath(".//*[@id='settingsSearchGender']/option[@value=\"f\"]");
    By ageFieldFrom=By.id("settingsSearchAgeFrom");
    By ageFieldTo=By.id("settingsSearchAgeTo");
    By phoneField=By.id("change-phone");
    By changCountryField=By.xpath(".//*[@id='content']//div[@class=\"selected-flag\"]");
    By saveButton=By.xpath(".//button[@class=\"btn btn_medium\"]");
    By changCountryButton=By.xpath(".//button[@class=\"btn btn_medium change_city\"]");
    By ageSelectedFrom=By.xpath(".//*[@id='settingsSearchAgeFrom']//option[@selected=\"\"]");
    By ageSelectedTo=By.xpath(".//*[@id='settingsSearchAgeTo']//option[@selected=\"\"]");
    By genderSearchConfirm=By.xpath(".//*[@id='settingsSearchGender']//option[@selected=\"\"]");
    By genderUserConfirm=By.xpath(".//*[@id='settingsGender']//option[@selected=\"\"]");

    public boolean chekGenderUser(){
        boolean result=isElement(genderUserConfirm);
        return result;
    }

    public boolean chekGenderSearch(){
        boolean result=isElement(genderSearchConfirm);
        return result;
    }

    public boolean chekAgeTo(String age){
        if (age.equals(driver.findElement(ageSelectedTo).getText())){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean chekAgeFrom(String age){
            if (age.equals(driver.findElement(ageSelectedFrom).getText())){
                return true;
            }
            else {
                return false;
            }
    }

    public void settingButClic(){
        driver.findElement(settingButton).click();
    }
    public void saveButt(){
        driver.findElement(saveButton).click();
    }

    public void setCountry(int ind) {
        driver.findElement(changCountryField).click();
     driver.findElement(By.xpath(".//*[@id='content']//li[@data-dial-code="+ind+"]")).click();
    }
    public void changPhoneNumber(String tel){
        driver.findElement(phoneField).clear();
        driver.findElement(phoneField).sendKeys(tel);
    }

    public void changName(String name){
        driver.findElement(nameField).clear();
        driver.findElement(nameField).sendKeys(name);
    }

    public void changDate(String date){
        driver.findElement(dateField).clear();
        driver.findElement(dateField).sendKeys(date);
    }

    public void changPassword(String pass){
        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(pass);
        driver.findElement(confirmPasswordField).clear();
        driver.findElement(confirmPasswordField).sendKeys(pass);
    }

    public void changGenderMale(){
        driver.findElement(genderField).click();
        driver.findElement(genderMaile).click();
    }

    public void changGenderFamale(){
        driver.findElement(genderField).click();
        driver.findElement(genderFamaile).click();
    }

    public void changSearchMail(){
        driver.findElement(genderFieldSearch).click();
        driver.findElement(genderSearchMaile).click();
    }

    public void changSearchFamail(){
        driver.findElement(genderFieldSearch).click();
        driver.findElement(genderSearchFamaile).click();
    }

    public void changAgeFrom(int age){
        driver.findElement(ageFieldFrom).click();
        driver.findElement(By.xpath(".//*[@id='settingsSearchAgeFrom']//option[text()='"+age+"']")).click();
    }

    public void changAgeTo(int age){
        driver.findElement(ageFieldTo).click();
        driver.findElement(By.xpath(".//*[@id='settingsSearchAgeTo']//option[text()='"+age+"']")).click();
    }



}
