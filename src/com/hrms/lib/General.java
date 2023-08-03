package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import com.hrms.utility.Log;

public class General extends Global{
/*stadrule: To Provide All re-usable fun:/methods related 
  to whole application*/
public void openApplication() {
driver = new FirefoxDriver();
driver.navigate().to(url);
System.out.println("Application opened"); //console
Reporter.log("Application opened"); //htmlreport
Log.info("Application opened "); //logfile
}
public void closeApplication() {
driver.close();
System.out.println("Application closed");
Log.info("Application closed ");
}
public void login() {
driver.findElement(By.name(txt_loginname)).sendKeys(un);
driver.findElement(By.name(txt_password)).sendKeys(pw);
driver.findElement(By.name(btn_login)).click();
System.out.println("Login completed");
Log.info("login completed ");
}
public void logout() {
driver.findElement(By.linkText(link_logout)).click();
System.out.println("Logout completed");
Log.info("Logout completed ");
}
public void enterFrame() {
driver.switchTo().frame(frame_empinfo);
System.out.println("entered into frame");
Log.info("entered into frame ");
}
public void exitFrame() {
driver.switchTo().defaultContent();
System.out.println("exit from frame");
Log.info("exit from frame ");
}
public void addNewEmp() {
driver.findElement(By.xpath(btn_Add)).click();
driver.findElement(By.name(txt_efn)).sendKeys(EFN);
driver.findElement(By.name(txt_eln)).sendKeys(ELN);
driver.findElement(By.id(btn_save)).click();
System.out.println("Added new emp");
Log.info(" Add new emp");
}
}
