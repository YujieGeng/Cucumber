package com.steps;

import io.cucumber.java.zh_cn.并且;
import io.cucumber.java.zh_cn.当;
import io.cucumber.java.zh_cn.那么;


public class Step {

    @当("^我打开163网站")
    public void openURL(){
        System.out.println("I opened 163 website");
    }

    @并且("我在email文本框输入\"(.*?)\"$")
    public void sendKeyEmail(String email){
        System.out.println("i typed my email addr");
    }

    @并且("^我在密码框输入\"(.*?)\"$")
    public void sendKeyPWD(String pwd){
        System.out.println(" i input my password");
    }

    @当("^我点击登录按钮")
    public void clickLogin(){
        System.out.println("i login ");
    }
    @那么("^我登录成功")
    public void loginSuccess(){
        System.out.println("i login successfully");
    }
}
