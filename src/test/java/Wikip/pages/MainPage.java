package Wikip.pages;

import org.apache.http.util.Asserts;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }


    public void clickActor1() {
        WebElement Actor1Buttom = driver.findElement(By.xpath("//[@title='Aleksandr Abdulov']"));
        Actor1Buttom.click();
    }

    public  void findActor1Film() {
        Assert.assertEquals("To Kill a Dragon");
        driver.navigate().back();

    }

    public void clickActor2()
    {
        WebElement Actor2Buttom = driver.findElement(By.xpath("//[@title='Oleg Yankovsky']"));
        Actor2Buttom.click();
    }
    public  void findActor2Film()

    {
        Assert.assertEquals("To Kill a Dragon");
        driver.navigate().back();
    }
    public void clickActor3()
    {
        WebElement Actor3Buttom = driver.findElement(By.xpath("//[@title='Yevgeny Leonov']"));
        Actor3Buttom.click();
    }
        public  void findActor3Film() {
            Assert.assertEquals("To Kill a Dragon");
            driver.navigate().back();
        }
    public void clickActor4()
    {
        WebElement Actor4Buttom = driver.findElement(By.xpath("//[@title='Vyacheslav Tikhonov']"));
        Actor4Buttom.click();
    }
            public  void findActor4Film() {
                Assert.assertEquals("To Kill a Dragon");
                driver.navigate().back();
            }
    public void clickActor5()
    {
        WebElement Actor5Buttom = driver.findElement(By.xpath("//[@title='Aleksandra Zakharova']"));
        Actor5Buttom.click();
    }
    public  void findActor5Film() {
        Assert.assertEquals("To Kill a Dragon");
        driver.navigate().back();
                }
    public void clickActor6()
    {
        WebElement Actor6Buttom = driver.findElement(By.xpath("//[@title='Viktor Rakov']"));
        Actor6Buttom.click();
    }
    public void findActor6Film() {
        Assert.assertEquals("To Kill a Dragon");
        driver.navigate().back();


                    }
                }