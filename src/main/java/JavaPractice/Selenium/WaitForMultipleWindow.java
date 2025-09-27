package JavaPractice.Selenium;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class WaitForMultipleWindow {
   private WebDriver driver;

    @Test
    public void waitForWindowsOpen(){

WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().window().maximize();

        WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'Free Access to')]"));
        wait.until(ExpectedConditions.visibilityOf(ele));

        int count = 5;
        while (count>0){
            ele.click();
            count--;
        }

        wait.until(driver -> driver.getWindowHandles().size()>=6);

        String parentWindow = driver.getWindowHandle();

        Set <String> windows = driver.getWindowHandles();

        int size = 0;
        for(String window: windows){

            if(!(window).equals(parentWindow)) {
                driver.switchTo().window(window);
                System.out.println("Child window" + driver.getTitle());
                size++;
            }

        }
        System.out.println(size + "child window");
        System.out.println(driver.switchTo().window(parentWindow).getTitle() + "Parent window switch");


    }

}

