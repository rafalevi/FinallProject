import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;

public class ProjectTest {


    @Test
    void enterurl() throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver","res\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(Helper.HBURL);
        File file1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File file2 = new File(Helper.FOLDER + " ha" + Helper.JPG);
        FileUtils.copyFile(file1, file2);

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get(Helper.INTURL);
        String hometab = driver.getWindowHandle();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Helper.ALERTPATH))).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Helper.CLICKCSS))).click();
        driver.switchTo().alert().accept();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Helper.CONFCSS))).click();
        wait.until(ExpectedConditions.alertIsPresent()).accept();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Helper.PROMPTCSS))).click();
        driver.switchTo().alert().sendKeys(Helper.ANSWRTXT);
        driver.switchTo().alert().accept();

        File file3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File file4 = new File(Helper.FOLDER + " py" + Helper.JPG);
        FileUtils.copyFile(file3, file4);

        driver.navigate().back();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Helper.CHECKCSS))).click();
        driver.findElement(By.cssSelector(Helper.CHECK1CSS)).click();

        driver.switchTo().newWindow(WindowType.TAB);
        driver.manage().window().fullscreen();
        driver.get(Helper.WIKIURL);
        Select langdrop = new Select(driver.findElement(By.id(Helper.SEARCHDROP)));
        langdrop.selectByValue("en");
        driver.findElement(By.id(Helper.SEARCHID)).sendKeys(Helper.SEARVALU);
        driver.findElement(By.xpath(Helper.SERCHBUTN)).click();

        Assert.assertEquals(driver.getCurrentUrl(), Helper.WCATURL);
        driver.manage().window().fullscreen();
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0,1000)");
        File file5 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File file6 = new File(Helper.FOLDER + " bir" + Helper.JPG);
        FileUtils.copyFile(file5, file6);

        driver.manage().window().fullscreen();
        scroll.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        File file7 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File file8 = new File(Helper.FOLDER + " tdy" + Helper.JPG);
        FileUtils.copyFile(file7, file8);

        WebElement Development = driver.findElement(By.cssSelector(Helper.COPYCSS));
        scroll.executeScript("arguments[0].scrollIntoView();", Development);
        File file9 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File file10 = new File(Helper.FOLDER + " WIKI2" + Helper.JPG);
        FileUtils.copyFile(file9, file10);

        String copytext = driver.findElement(By.cssSelector(Helper.COPYCSS)).getText();
        File file11 = new File(Helper.FOLDER + "WIKI1" + Helper.TXT);
        FileWriter myWriter = new FileWriter(file11);
        myWriter.write(copytext);
        myWriter.close();

        System.out.println(driver.findElement(By.cssSelector(Helper.COPYCSS)).getText());
        driver.quit();

    }

}
