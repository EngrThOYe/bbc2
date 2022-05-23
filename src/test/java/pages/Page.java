package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

import java.util.List;
import java.util.Objects;

public class Page {

    private WebDriver driver = Driver.getDriver();


    public void getUrl(final String url) {
        driver.navigate().to(url);
    }

    public void clickSignIn() {
        driver.findElement(By.xpath("//*[@id=\"header-content\"]/div[2]/nav/div[1]/div/div[2]/ul[1]/li[1]/a/span[2]")).click();
    }

    public void assertSignInPage() {
        String expectedtitle = "BBC – Sign in";
        String actualtitle = driver.getTitle();
        Assert.assertEquals(actualtitle, expectedtitle);
    }

    public void enterEmail_username(String Email_username) {
        driver.findElement(By.xpath("//*[@id=\"user-identifier-input\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"user-identifier-input\"]")).sendKeys(Email_username);
    }

    public void enterPassword(String Password) {
        driver.findElement(By.xpath("//*[@id=\"password-input\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"password-input\"]")).sendKeys(Password);
    }

    public void clickSignInButton() {
        driver.findElement(By.xpath("//*[@id=\"submit-button\"]")).click();
    }

    public void clickWeatherLinkTab() {
        driver.findElement(By.xpath("//*[@id=\"header-content\"]/div[2]/nav/div[1]/div/div[2]/ul[2]/li[4]/a/span")).click();
    }

    public void assertWeatherHomePage() {
        String expectedtitle = "BBC Weather - Home";
        String actualtitle = driver.getTitle();
        Assert.assertEquals(actualtitle, expectedtitle);
    }

    public void enterLocation(String Location) {
        driver.findElement(By.xpath("//*[@id=\"ls-c-search__input-label\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ls-c-search__input-label\"]")).sendKeys(Location);

    }

    public void clickSearchButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"wr-location-search-container\"]/div/div[1]/form/div/input")).click();
        Thread.sleep(2000);
    }


    public void assertResultList() throws InterruptedException {
        int ResultList;
        ResultList = driver.findElements(By.className("gel-long-primer")).size();
        Assert.assertTrue(ResultList > 0);
        Thread.sleep(2000);

    }

    public void clickResultOne() {
        driver.findElements(By.className("gel-long-primer")).get(1).click();
    }

    public void assertSearchedLocationWeatherPage(String Location) {
        String expectedtitle = new String(Location) + " - BBC Weather";
        String actualtitle = driver.getTitle();
        Assert.assertEquals(actualtitle, expectedtitle);
    }

    public void updateMyLocation() {
        try {
            driver.findElement(By.xpath("//span[text()='Add']")).click();
        } catch (NoSuchElementException e) {
            System.out.println("Location Added already");
        }
    }

    public void assertLocationIsAdded() throws InterruptedException {
        Thread.sleep(2000);
        int LocationStatus;
        LocationStatus = driver.findElements(By.xpath("//span[text()='Added']")).size();
        Assert.assertTrue(LocationStatus > 0);

    }
}