package org.example;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

    public static void searchword(String browser,String Keyword){
        if(browser=="firefox" || browser =="chrome" || browser=="edge") {
            WebDriver driver = null;
            if (browser.equalsIgnoreCase("chrome")) {
                driver = new ChromeDriver();

            } else if (browser.equalsIgnoreCase("firefox")) {
                driver = new FirefoxDriver();

            } else if (browser.equalsIgnoreCase("edge")) {
                driver = new EdgeDriver();
            }

            String URL = "https://www.google.com";
            driver.get(URL);
            System.out.println("Browser is opened");
            WebElement search = driver.findElement(By.name("q"));
            search.sendKeys(Keyword);
            search.submit();
            driver.close();

        }else{
            System.out.println("This browser is not in scope");
        }

    }
    public static void main(String[] args) {

      //String browser = "firefox";
      searchword("chrome", "saad");


    }
}
