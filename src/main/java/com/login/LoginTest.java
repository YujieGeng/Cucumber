package com.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @description
 * @author:yujie
 * @Created on 2020/6/11
 */
public class LoginTest {
    public static void  login(WebDriver driver,String email,String pwd){
        driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys(pwd);
        driver.findElement(By.id("dologin")).click();
    }
}
