package core;
import java.util.logging.*;
import org.openqa.selenium.*;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnit_1 {
       public static void main(String[] args) {
              String url = "http://facebook.com";
              
              WebDriver driver = new HtmlUnitDriver();
              
              ((HtmlUnitDriver) driver).setJavascriptEnabled(true);
              
              Logger l = Logger.getLogger("");
              l.setLevel(Level.OFF);                    // Suppress Warnings
              
              driver.get(url);
              
              System.out.println((String) ((JavascriptExecutor) driver).executeScript("return navigator.userAgent;"));              
              System.out.println(driver.getCurrentUrl());
              driver.quit();
   }
}
