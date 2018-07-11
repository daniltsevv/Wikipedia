package Wikip.setting;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class ChromeSettings {
   public WebDriver driver;

    @Before
    public void  setUp(){
        driver = new ChromeDriver();
        driver.get("en.wikipedia.org/wiki/To_Kill_a_Dragon");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(){
        driver.close();
    }

}
