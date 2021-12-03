package scneraio;

import baseTest.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Scnerio extends Base {


    private WebDriverWait getWait() {
        return wait;
    }
    public WebElement findElement(By by){
        return getWait().until(ExpectedConditions.presenceOfElementLocated(by));
    }


        @Test
    public void actionTest() throws InterruptedException {
        Actions actions = new Actions(driver);
        driver.navigate().to("https://www.gittigidiyor.com");
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
        //actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        TimeUnit.SECONDS.sleep(1);
        // actions.moveToElement(driver.findElement(By.cssSelector(".ndodpt-1.bgCibU.sc-1n49x8z-13.ceCTui"))).build().perform();
        //TimeUnit.SECONDS.sleep(1);
        //actions.moveToElement(driver.findElement(By.name("like"))).click().build().perform();
        //TimeUnit.SECONDS.sleep(1);
        //actions.moveToElement(driver.findElement(By.cssSelector(".sc-1o6eogh-0.i3yadh-0.gmgqoT.sc-1n49x8z-9.jVhkOY"))).build().perform();
        //TimeUnit.SECONDS.sleep(1);
        //actions.moveToElement(driver.findElement(By.cssSelector(".ndodpt-1.bgCibU.sc-1n49x8z-13.ceCTui"))).click().build().perform();
        //TimeUnit.SECONDS.sleep(1);






    }
    private WebDriver getDriver() {
        return driver;
    }
}
