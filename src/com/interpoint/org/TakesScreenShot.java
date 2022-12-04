package com.interpoint.org;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Hp\\eclipse-workspace\\ZzCrashCourse\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//*[@class=\"_2KpZ6l _2doB4z\"]")).click();
		/*
		 * TakesScreenshot screenshot = (TakesScreenshot) driver; File sourceFile =
		 * screenshot.getScreenshotAs(OutputType.FILE); File Destinationfile = new
		 * File("D://screenshot.png");
		 * org.openqa.selenium.io.FileHandler.copy(sourceFile, Destinationfile);
		 */
		Robot robot = new Robot();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(screenSize);
		BufferedImage createScreenCapture = robot.createScreenCapture(rectangle);
		File destinationFile = new File("D://robot.png");
		ImageIO.write(createScreenCapture, "png", destinationFile);
		
	}
}
