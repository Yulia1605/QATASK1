import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.hamcrest.CoreMatchers.containsString;
import java.util.concurrent.TimeUnit;

public class Script1 {


    @Test
    public void adminPanelOpen() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\IdeaProjects\\QATESTLAB\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        driver.findElement(By.id("email")).sendKeys("webinar.test@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("Xcg7299bnSmMuRLp9ITw");
        driver.findElement(By.xpath("//*[@id='login_form']/div[3]/button")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id='employee_infos']/a/span/img")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id='header_logout']")).click();

    }

    @Test
    public void adminPanelCheck() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\IdeaProjects\\QATESTLAB\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        driver.findElement(By.id("email")).sendKeys("webinar.test@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("Xcg7299bnSmMuRLp9ITw");
        driver.findElement(By.xpath("//*[@id='login_form']/div[3]/button")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       String s1= driver.findElement(By.id("tab-AdminDashboard")).getText();
        driver.findElement(By.id("tab-AdminDashboard")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      Assert.assertThat(driver.findElement(By.xpath("//*[@id='content']/div[1]/div/ul/li/a")).getText(),containsString(s1));
        System.out.println("Page name is correct  "+s1);

    }
    }
