package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
        driver.get("https://www.amazon.in");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Headphones");
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.id("nav-flyout-searchAjax")).getText());
        driver.findElement(By.id("nav-search-submit-button")).click();


        Thread.sleep(10000);
        //driver.close();
        driver.quit();

    }
}