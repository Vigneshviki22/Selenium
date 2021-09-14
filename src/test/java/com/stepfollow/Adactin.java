package com.stepfollow;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;



public class Adactin {
	WebDriver driver;
	@Given("user is on Adactin Hotel")
	public void user_is_on_adactin_hotel() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
	}
	
	@When("user should enter the {string} and {string} and click login")
	public void user_should_enter_the_and(String username, String password) {
driver.findElement(By.id("username")).sendKeys(username);
driver.findElement(By.id("password")).sendKeys(password);
driver.findElement(By.id("login")).click();
	}

	@When("select adactin booking room {string}, {string} , {string} , {string} , {string}, {string} , {string}, {string}")
	public void verify_searchhotels_and_and_and_and_and_and_and_and(String location, String hotels , String roomtype, String roomnos, String  datepick_in, String datepick_out, String adult_room, String child_room) {
		driver.findElement(By.id("location")).sendKeys(location);
		driver.findElement(By.id("hotels")).sendKeys(hotels);
		driver.findElement(By.id("room_type")).sendKeys(roomtype);
		driver.findElement(By.id("room_nos")).sendKeys(roomnos);
		driver.findElement(By.id("datepick_in")).sendKeys(datepick_in);
		driver.findElement(By.id("datepick_out")).sendKeys(datepick_out);
		driver.findElement(By.id("adult_room")).sendKeys(adult_room);
		driver.findElement(By.id("child_room")).sendKeys(child_room);
		
	}
	
	@When("user should click Search")
	public void user_should_click_Search() {
		driver.findElement(By.id("Submit")).click();
	}
	
	@When("Select hotel and click continue")
	public void select_hotel_and_click_continue() {
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();

	}
	
	@When("User should enter {string} ,{string},{string},{string},{string}")
	public void user_should_enter(String firstName, String lastName, String address, String ccNo,String cvv) {
		driver.findElement(By.id("first_name")).sendKeys(firstName);
		driver.findElement(By.id("last_name")).sendKeys(lastName);
		driver.findElement(By.id("address")).sendKeys(address);
		driver.findElement(By.id("cc_num")).sendKeys(ccNo);
		driver.findElement(By.id("cc_cvv")).sendKeys(cvv);
	}

	@When("user should select {string} , {string},{string}")
	public void user_should_select(String cardType, String expMonth, String expYrs) {
		
		WebElement dDnCardType = driver.findElement(By.id("cc_type"));
		Select select2=new Select(dDnCardType);
		select2.selectByVisibleText(cardType);	
		
		WebElement dDnCardExpiryMonth = driver.findElement(By.id("cc_exp_month"));
		Select select=new Select(dDnCardExpiryMonth);
		select.selectByVisibleText(expMonth);
		
		WebElement dDnCreditCardExpiryYears = driver.findElement(By.id("cc_exp_year"));
		Select select1=new Select(dDnCreditCardExpiryYears);
		select1.selectByVisibleText(expYrs);	
	}
	
	@When("user should click booknow")
	public void user_should_click_booknow() {
		driver.findElement(By.id("book_now")).click();
	}

	@Then("user should verify success msg")
	public void user_should_verify_success_msg() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.id("order_no"));
		String attribute = element.getAttribute("value");
		System.out.println(" Order ID :"+attribute);
		driver.quit();
	}


}