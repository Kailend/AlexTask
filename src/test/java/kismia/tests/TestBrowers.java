package kismia.tests;

import kismia.Core.BrowEnter;
import kismia.Core.MetodFacrors;
import kismia.pageOptions.FooterPage;
import kismia.pageOptions.MainPage;


/**
 * Created by Kailend on 21.05.2016.
 */
public class TestBrowers extends BrowEnter{


    @org.testng.annotations.Test
    public void getTest(){
        driver.get("https://kismia.com/");
        String mail="gvs_1986@mail.ru";
        String password ="3de6mo7n";

        MainPage mainPage;
                mainPage =new MainPage();
        mainPage.emailGet(mail);
        mainPage.passwordGet(password);
        mainPage.clikGet();

//        FooterPage foterPage;
//        foterPage=new FooterPage();
//        foterPage.clikgoodStoriesField();

//        passwordGet(password);
//        clikGet();

    }


}
