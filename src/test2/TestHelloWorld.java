package test2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


//This was a test to verify that my WebDriver install was working correctly.


public class TestHelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World! 2");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://google.com");
        driver.quit();
        System.out.println("Done");
    }
}
