package com.capgemini.stepdef;


//import java.sql.Driver;
//import com.capgemini.base.*;

//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;

import com.capgemini.page.LoginPage;

import io.cucumber.java.en.*;

public class LoginStepDef {
	LoginPage login;
	
	@Given("user is on main page")
public void user_is_on_main_page() {
    
		login=new LoginPage();
}

@When("user clicks on shop icon")
public void user_clicks_on_shop_icon() {
       
	login.clickShop();
	
}
@When("user clicks on home btn")
public void user_clicks_on_home_btn() {
    login.clickHome();
}
@Then("user has three sliders")
public void user_has_three_sliders() {
    login.sliders();
}
@Then("user has three arrivals")
public void user_has_three_arrivals()
{
	login.arrivals();
}
@Then("page is navigating so user can add book")
public void page_is_navigating_so_user_can_add_book()
{
	login.arrivalNegl();
}
@Then("click on description")
public void click_on_description()
{
	login.descriptionPro();;
}
@Then("there should be a description about book")
public void there_should_be_a_description_about_book()
{
	login.getDescription();
}
@Then("click on review")
public void click_on_review()
{
	login.getReview();
}
@Then("review of book is present")
public void review_of_book_is_present()
{
	login.getReview();
}

}
