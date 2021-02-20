package com.capgemini.page;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capgemini.base.TestBase;

public class LoginPage extends TestBase{
	@FindBy(xpath="//a[contains(text(),'Shop')]")
	WebElement shop;
	@FindBy(xpath="//a[contains(text(),'Home')]']")
	WebElement home;
	@FindBy(xpath = "//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/img[1]")
	List<WebElement> slider;
	@FindBy(xpath="//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/img[1]")
	List<WebElement> arrival;
	@FindBy(xpath="//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/img[1]")
	WebElement arrivalNeg;
	@FindBy(xpath="//button[contains(text(),'Add to basket')]")
	WebElement basket;
	@FindBy(xpath="//a[contains(text(),'Description')]")
	WebElement description;
	@FindBy(xpath="//a[contains(text(),'Reviews (0)')]")
	WebElement review;
	public LoginPage()
	{
		init();
		PageFactory.initElements(driver, this);
	}
	
	public void clickShop()
	{
		shop.click();
	}
	
	public void clickHome()
	{
		home.click();
	}
	
	public void sliders()
	{
		System.out.println("Number of sliders are:"+slider.size());
	}
	
	public void arrivals()
	{
		System.out.println("Number of arrivals are:"+arrival.size());
	}
	
	public void arrivalNegl()
	{
		arrivalNeg.click();
	}
	
	public void addBasket()
	{
		basket.click();
	}
	
	public void descriptionPro()
	{
		description.click();
	}
	
	public void getDescription()
	{
		Boolean value=description.getText().contains("About Product");
		Assert.assertTrue(value);
	}
	
	public void getReview()
	{
		review.click();
	}
	
	

}