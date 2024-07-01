package ibello_auto_test;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class main {

	public static void main(String[] args) throws InterruptedException{
   	 
	    WebDriver driver = new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
	    SimpleDateFormat DateFormat = new SimpleDateFormat("dd-MM-yyyy__hh_mm");
	    String destFile ="Tesztfuttatás_"+DateFormat.format(new Date()) + ".txt";
	    file.CreatFile(destFile);
	    
        driver.get("https://ibello.hu/tasks/cases/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        boolean success_load = driver.findElement(By.xpath("/html/body/nav-bar/nav/div/div[1]/a")).isDisplayed();
		if (success_load==true) {
        
        login_cases.login_faild(driver, destFile);
        login_cases.login_user_clear(driver);
        login_cases.login_pass_clear(driver);
        login_cases.login_success(driver,destFile);
        
        boolean newform=new_cases.new_case_form(driver, destFile);
        new_cases.newcaseCreat(driver, newform, destFile);
		}
        Thread.sleep(5000);
        driver.close();
	}
}
