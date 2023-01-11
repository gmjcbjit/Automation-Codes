package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Main {
    static WebDriver driver;

    public static void radioButton(){

        WebElement radioElement = driver.findElement(By.xpath("//div[@class='et_pb_blurb_description']//form//input[@value='male']"));

        boolean selectState = radioElement.isSelected();
        System.out.println("radio button is selected");
//      performing click operation only if element is not selected
        if (selectState == false) {
            radioElement.click();
        }
        driver.close();
    }

    public static void checkbox(){
        WebElement checkBoxSelected =
                driver.findElement(By.cssSelector("input[value='Bike']"));

        boolean isSelected = checkBoxSelected.isSelected();
        System.out.println("Checkbox is selected");
//      performing click operation if element is selected
        if (isSelected == false) {
            checkBoxSelected.click();
        }
        driver.close();
    }

    public static void dropdown(){
        Select select = new Select(driver.findElement(By.tagName("select")));
        System.out.println("dropdown is selected");
// Select the option with value "6"
        select.selectByIndex(2);
        driver.close();
    }
    public static void scrollTo(String locator){
        driver = new ChromeDriver();
        String URL = "https://ultimateqa.com/simple-html-elements-for-automation/";
        driver.get(URL);

        if(locator.equalsIgnoreCase("radio") || locator.equalsIgnoreCase("button2")|| locator.equalsIgnoreCase("checkbox")||locator.equalsIgnoreCase("dropdown")){
        WebElement element=null;
        if(locator.equalsIgnoreCase("radio")){
             element = driver.findElement(By.xpath("//span[contains(text(),'Radio buttons')]"));
            System.out.println("Radio Button is Scrolled");
        }
        else if(locator.equalsIgnoreCase("button2")){
             element = driver.findElement(By.xpath("//span[contains(text(), 'Button 2')]"));
            System.out.println("Button 2 is Scrolled");
        }
        else if(locator.equalsIgnoreCase("Checkbox")){
             element = driver.findElement(By.xpath("//span[contains(text(), 'Checkboxes')]"));
            System.out.println("Checkbox is Scrolled");
        }
        else if(locator.equalsIgnoreCase("dropdown")){
             element = driver.findElement(By.xpath("//span[contains(text(), 'Dropdown')]"));
            System.out.println("Dropdown is Scrolled");
        }
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView()", element);
        }
        else{
            System.out.println("This locator is out of Scope");
            driver.close();
        }
    }
//    public static void searchWord(String browser,String loc){
//        if(browser=="firefox" || browser =="chrome" || browser=="edge") {
//
//            if (browser.equalsIgnoreCase("chrome")) {
//                driver = new ChromeDriver();
//
//            } else if (browser.equalsIgnoreCase("firefox")) {
//                driver = new FirefoxDriver();
//
//            } else if (browser.equalsIgnoreCase("edge")) {
//                driver = new EdgeDriver();
//            }
//
//            String URL = "https://ultimateqa.com/simple-html-elements-for-automation/";
//            driver.get(URL);
//            System.out.println("Browser is opened");
////            WebElement search = driver.findElement(By.name("q"));
////            search.sendKeys(Keyword);
////            search.submit();
//            scrollTo(loc);
//            //driver.close();
//
//        }else{
//            System.out.println("This browser is not in scope");
//        }
//
//    }
    public static void main(String[] args) {

      //String browser = "firefox";
        scrollTo("button");
        //radioButton();
        //checkbox();
        //dropdown();

    }
}
