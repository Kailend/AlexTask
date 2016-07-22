package kismia.pageOptions;

import kismia.Core.BrowEnter;
import kismia.Core.MetodFacrors;
import kismia.Core.MetodFacrors;
import org.openqa.selenium.By;

/**
 * Created by Kailend on 04.07.2016.
 */
public class ProfilePage extends MetodFacrors{

    By statusField=By.xpath("//textarea[@style=\"height: 44px;\"]");
    By editStatusButton =By.id("editStatus");
    By saveStatusButton=By.id("saveStatus");
    By editButton=By.id("user_info_edit");
    By fitToMeButton=By.xpath("//a[@href=\"/profile/suitable\"]");
    By myVisitorsButton=By.xpath("//a[@href=\"/profile/visitors\"]");
    By myMassegesButton=By.xpath("//a[@href=\"/messages\"]");
    By iLikeButton=By.xpath("//a[@href=\"/profile/favd\"]");
    By meLikedButton=By.xpath("//a[@href=\"/profile/favs\"]");
    By matchesButton=By.xpath("//a[@href=\"/matches/list\"]");
    By myFaivoriteButton=By.xpath("//a[@href=\"/profile/selected\"]");
    By blockedButton=By.xpath("//a[@href=\"/profile/delete\"]");
    By meetingRoomButton=By.xpath("//a[@class=\"button-FR button--meeroom\"]");
    By addPhotoButton=By.xpath("//a[@href=\"javascript:AddPhoto.showDialog();\"]");


    public void addStatus(String str){
        driver.findElement(statusField).clear();
        driver.findElement(statusField).sendKeys(str);
    }
    public void saveStatusButton(){
        driver.findElement(saveStatusButton).click();
    }

    public void enterMeetingRoom(){
        driver.findElement(meetingRoomButton).click();
    }
    public void fitToMeEnter(){
        driver.findElement(fitToMeButton).click();
    }
    public void myVisitorsEnter(){
        driver.findElement(myVisitorsButton).click();
    }
    public void massegerEnter(){
        driver.findElement(myMassegesButton).click();
    }
    public void iLikeEnter(){
        driver.findElement(iLikeButton).click();
    }
    public void meLikedButton(){
        driver.findElement(meLikedButton).click();
    }
    public void matchesEnter(){
        driver.findElement(matchesButton).click();
    }
    public void faivoriteEnter(){
        driver.findElement(myFaivoriteButton).click();
    }
    public void blockedEnter(){
        driver.findElement(blockedButton).click();
    }
    public void addPhoto(){
        driver.findElement(addPhotoButton).click();
    }

}
