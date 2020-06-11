package com.steps;

import com.login.LoginTest;
import io.cucumber.java.zh_cn.假如;
import io.cucumber.java.zh_cn.并且;
import io.cucumber.java.zh_cn.当;
import io.cucumber.java.zh_cn.那么;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;


public class Step {

    WebDriver driver = null;

    @当("^我打开163网站")
    public void openURL(){
        //System.out.println("I opened 163 website");
        System.setProperty("webdriver.gecko.driver", "/Users/yujie/IdeaProjects/Cucumber/drivers/geckodriver");
        driver = new FirefoxDriver();
        driver.get("https://mail.163.com/");

    }

    @并且("我在email文本框输入\"(.*?)\"$")
    public void sendKeyEmail(String email){
        System.out.println("i typed my email addr:"+email);
    }

    @并且("^我在密码框输入\"(.*?)\"$")
    public void sendKeyPWD(String pwd){
        System.out.println(" i input my password:"+pwd);
    }

    @当("^我点击登录按钮")
    public void clickLogin(){
        System.out.println("i login ");
    }

    @假如("^我用\"(.*?)\"账号,密码\"(.*?)\"登录")
    public void login(String email, String pwd){

        LoginTest.login(driver, email, pwd);
    }

    @那么("^我登录成功")
    public void loginSuccess(){
        System.out.println("i login successfully");
    }
}
