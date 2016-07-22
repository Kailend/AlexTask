package kismia.pageOptions;

import kismia.Core.MetodFacrors;
import org.openqa.selenium.By;

/**
 * Created by Kailend on 21.05.2016.
 */
public class FooterPage extends MetodFacrors{
     By projektField = By.xpath("html/body/div[2]/footer/div[1]/nav/ul/li[1]/a");
     By maintanField = By.xpath("html/body/div[2]/footer/div[1]/nav/ul/li[2]/a");
     By sovetField = By.xpath("html/body/div[2]/footer/div[1]/nav/ul/li[3]/a");
     By goodStoriesField=By.xpath("html/body/div[2]/footer/div[1]/nav/ul/li[4]/a");
     By kontakField=By.xpath("html/body/div[2]/footer/div[1]/nav/ul/li[5]/a");
     By rulesField=By.xpath("html/body/div[2]/footer/div[1]/nav/ul/li[6]/a");
     By policeField=By.xpath("//a[@href=\"/info/privacy\"]");
     By partField=By.xpath("//a[@href=\"/info/partners\"]");

    By englishField=By.xpath("html/body/div[2]/footer/div[2]/div/ul/li[2]/a");
    By portugalLangField=By.xpath("//ul[@class=\"languages\"]/li[3]");
    By espanolLangField=By.xpath("//ul[@class=\"languages\"]/li[4]");
    By franceLangField=By.xpath("//ul[@class=\"languages\"]/li[5]");



    public void clikprojektField(){
        driver.findElement(projektField).click();
    }
    public void clikmaintanField(){
        driver.findElement(maintanField).click();
    }
    public void cliksovetField() {
        driver.findElement(sovetField).click();
    }
    public void clikgoodStoriesField() {
        driver.findElement(goodStoriesField).click();
    }
    public void clikkontakField() {
        driver.findElement(kontakField).click();
    }
    public void clikrulesField() {
        driver.findElement(rulesField).click();
    }
    public void clikpoliceField() {
        driver.findElement(policeField).click();
    }
    public void clikpartField() {
        driver.findElement(partField).click();
    }
    public void clikenglishField() {
        driver.findElement(englishField).click();
    }
    public void clickPortugalLang() {
        driver.findElement(portugalLangField).click();
    }
    public void clickEspanolLang() {
        driver.findElement(espanolLangField).click();
    }
    public void clickFranceLang() {
        driver.findElement(franceLangField).click();
    }
}
