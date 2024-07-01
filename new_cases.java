package ibello_auto_test;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class new_cases {

	public static boolean new_case_form(WebDriver driver, String destFile) {
		boolean newform=false;
		file.appendfile("Új ügy form megnyitása\r\n\r\n", destFile);
		driver.findElement(By.xpath("/html/body/div/router-view/div/div[2]/div/a")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		boolean success_login = driver.findElement(By.xpath("/html/body/div/router-view/div/div[1]/h3")).isDisplayed();
		if (success_login==true) {
			file.appendfile("  Sikeres új ügy form megnyitása\r\n\r\n", destFile); 
			newform = true;
				}
		else 	file.appendfile("  Az új ügy from megnyitása sikertelen\r\n\r\n", destFile);
		return newform;
	}
	
	public static void newcaseCreat(WebDriver driver, boolean newform,String destFile) {
		file.appendfile("Új ügy form kitöltése\r\n\r\n", destFile);
		SimpleDateFormat DateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String today = DateFormat.format(new Date());
		String tomorrow[]= today.split("-");
		int day= Integer.valueOf(tomorrow[2])+1; 
		String today1=null;
		if(day<10) today1="0"+day;
		else today1=String.valueOf(day);
		if(newform==true) {
		driver.findElement(By.xpath("//*[@id=\"validity\"]")).sendKeys(tomorrow[0]+"-"+tomorrow[1]+"-"+today1);
		file.appendfile("  Holnapi nap megadása\r\n", destFile);
		driver.findElement(By.xpath("//*[@id=\"person\"]")).sendKeys("Rendi Lívia");
		file.appendfile("  Személy megadása\r\n", destFile);
		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Szigetecse");
		file.appendfile("  Város megadása\r\n", destFile);
		driver.findElement(By.xpath("//*[@id=\"zipCode\"]")).sendKeys("2321");
		file.appendfile("  Irányítószám megadása\r\n", destFile);
		driver.findElement(By.xpath("//*[@id=\"street\"]")).sendKeys("Fortuna köz");
		file.appendfile("  Közterület megadása\r\n", destFile);
		driver.findElement(By.xpath("//*[@id=\"number\"]")).sendKeys("4");
		file.appendfile("  Házszám megadása\r\n", destFile);
		driver.findElement(By.xpath("/html/body/div/router-view/div/div[2]/div/a[1]")).click();
		file.appendfile("  Sikeres a mentés gomb megnyomása\r\n", destFile);
		}
	}
}
