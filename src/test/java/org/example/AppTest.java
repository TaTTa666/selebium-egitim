package org.example;


import net.bytebuddy.asm.Advice;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;


public class AppTest {
    WebDriver driver;
    WebDriverWait wait;
@Before
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        options.addArguments("--disable-notifications");
        options.addArguments("disable-popup-blocking");

        driver= new ChromeDriver(options);


    }


    public WebElement findElement(By by){
        return getWait().until(ExpectedConditions.presenceOfElementLocated(by));


    }

    private WebDriverWait getWait() {
        return wait;
    }

    @Test
    public void actionTest() throws InterruptedException {
        Actions actions = new Actions(driver);

        driver.navigate().to("https://www.gittigidiyor.com"); //https://www.gittigidiyor.com

        JavascriptExecutor executor = (JavascriptExecutor) driver;

        TimeUnit.SECONDS.sleep(1);

        actions.moveToElement(driver.findElement(By.cssSelector(".gekhq4-5.grTfZj"))).click().build().perform();

        TimeUnit.SECONDS.sleep(1);

        actions.moveToElement(driver.findElement(By.cssSelector(".qjixn8-0.sc-1bydi5r-0.lghPw"))).click().build().perform();

        TimeUnit.SECONDS.sleep(1);

        actions.moveToElement(driver.findElement(By.id("L-UserNameField"))).click().sendKeys("ozgurguneybukrek3@gmail.com").build().perform();

        TimeUnit.SECONDS.sleep(1);

        actions.moveToElement(driver.findElement(By.id("L-PasswordField"))).click().sendKeys("16477904abc").build().perform();

        //TimeUnit.SECONDS.sleep(15);

        actions.moveToElement(driver.findElement(By.id("gg-login-enter"))).click().build().perform();

        TimeUnit.SECONDS.sleep(1);

        actions.moveToElement(driver.findElement(By.cssSelector(".sc-4995aq-0.sc-14oyvky-0.gHqOYK"))).click().sendKeys("ayakkabı").build().perform();

        TimeUnit.SECONDS.sleep(1);

        actions.moveToElement(driver.findElement(By.cssSelector(".qjixn8-0.sc-1bydi5r-0.gaMakD"))).click().build().perform();

        TimeUnit.SECONDS.sleep(1);

        actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

        TimeUnit.SECONDS.sleep(1);

        By elementLocator = new By.ByCssSelector(".sc-1n49x8z-14.fIkZfb");

        List<Integer> randomList = new ArrayList<>();
        for (int i = 0; i < 4; i ++){
            int rand = (int) (Math.random() * 20);
            if(!randomList.contains(rand)){
                randomList.add(rand);

                WebElement tempElement = driver.findElements(elementLocator).get(rand);
                try {
                    driver.findElements(elementLocator).get(rand).click();
                }catch (Exception e){
                    executor.executeScript("arguments[0].click();", tempElement);
                }
            }else{
                i--;
            }
        }
        driver.navigate().back();

        TimeUnit.SECONDS.sleep(5);

        driver.findElement(By.cssSelector("input.sc-4995aq-0.sc-14oyvky-0.gHqOYK")).sendKeys("çanta");

        TimeUnit.SECONDS.sleep(5);

        actions.moveToElement(driver.findElement(By.cssSelector(".qjixn8-0.sc-1bydi5r-0.gaMakD"))).click().build().perform();

        TimeUnit.SECONDS.sleep(5);


        }
        
        @After
public void tearDown(){
        driver.close();
        driver.quit();




}

    private WebDriver getDriver() {
        return driver;
    }


}