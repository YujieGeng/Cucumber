#language:zh-CN
功能:163登录功能

  场景:测试正确的账号登录
    当我打开163网站
    并且我在email文本框输入"yujie"
    并且我在密码框输入"123443"
    当我点击登录按钮
    那么我登录成功

  场景大纲: 登录2
   当我打开163网站
   当我在email文本框输入"<username>"
   并且我在密码框输入"<pwd>"
   那么我登录成功

   例子:
    | username | pwd  |
    | test1    | pwd1 |
    | test2    | pwd2 |
    | test3    | pwd3 |
    | test4    | pwd4 |