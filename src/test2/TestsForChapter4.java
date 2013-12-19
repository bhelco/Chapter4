package test2;

import static org.junit.Assert.assertTrue;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestsForChapter4 {
    WebDriver selenium;
    
    @Before
    public void setUp(){
        selenium = new FirefoxDriver();
    }
    
    @After
    public void tearDown(){
        selenium.quit();
    }
    
    public Chapter2 clickChapter2(){
        clickChapter("2");
        return PageFactory.initElements(selenium, Chapter2.class);
    }
    
    private void clickChapter(String string) {
        // TODO Auto-generated method stub
        
    }

    @Test
    public void shouldLoadTheHomePageAndThenCheckButtonOnChapter2() {
        loadHomePage();
        HomePage hp = new HomePage(selenium);
        Chapter2 ch2 = hp.clickChapter2();
        assertTrue(ch2.isButtonPresent("but1"));
    }
//    @Test
//    public void shouldCheckButtonOnChapter2Page(){
//        loadHomePage();
//        HomePage hp = 
//        clickAndLoadChapter2();
//        Assert.assertEqual(selenium.findElements(By.id("but1").getSize(), 1);       
//    }

    @Test
    public void shouldCheckAnotherButtonOnChapter2Page(){
        loadHomePage();
        HomePage hp = new HomePage(selenium);
        Chapter2 ch2 = hp.clickChapter2();
        assertTrue(ch2.isButtonPresent2("verifybutton"));
//        clickAndLoadChapter2();
        //Assert.assertEqual(selenium.findElements(By.id("verifybutton").getSize(), 1);
        // This won't ever work, because the button doesn't have an ID.
    }

    public void clickAndLoadChapter2() {
        selenium.findElement (By.link, "Chapter 2").click();
    }

    public void loadHomePage() {
        selenium.get("http://book.theautomatedtester.co.uk");
    }

}
