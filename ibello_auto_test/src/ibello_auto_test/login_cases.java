package ibello_auto_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login_cases {
	
	public static void login_success(WebDriver driver, String destFile) {
		file.appendfile("Sikeres login teszt\r\n\r\n", destFile);
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("teszt.elek");
		file.appendfile("  User név megadása sikeres\r\n", destFile);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("User1234");
		file.appendfile("  Jelszó megadása sikeres\r\n", destFile);
		driver.findElement(By.xpath("/html/body/div/router-view/div/div[2]/div/button")).click();
		file.appendfile("  Gomb megnyomása sikeres\r\n", destFile);
		boolean success_login = driver.findElement(By.xpath("/html/body/div/router-view/div/div[1]")).isDisplayed();
		if (success_login==true)file.appendfile("  Sikeres belépés\r\n\r\n", destFile);
		else 	file.appendfile("  A belépés sikertelen\r\n\r\n", destFile);
	}
	public static void login_faild(WebDriver driver, String destFile) {
		file.appendfile("Sikertelen login teszt\r\n\r\n", destFile);
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("teszt.aron");
		file.appendfile("  User név megadása sikeres\r\n", destFile);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("User1234");
		file.appendfile("  Jelszó megadása sikeres\r\n", destFile);
		driver.findElement(By.xpath("/html/body/div/router-view/div/div[2]/div/button")).click();
		file.appendfile("  Gomb megnyomása sikeres\r\n", destFile);
		boolean success_login = driver.findElement(By.xpath("/html/body/div/router-view/div/div[1]")).isDisplayed();
		if (success_login==true)file.appendfile("  Sikeres belépés\r\n\r\n", destFile);
		else 	file.appendfile("  A belépés sikertelen\r\n\r\n", destFile);
	}
	
	public static void login_user_clear(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"username\"]")).clear();
		}
	public static void login_pass_clear(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
		}
}

