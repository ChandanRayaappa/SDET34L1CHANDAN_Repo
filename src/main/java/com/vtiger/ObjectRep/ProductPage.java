package com.vtiger.ObjectRep;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This POM Class used for ProductPage
 * @author CHANDAN KUMARa
 *
 */
public class ProductPage {
	@FindBy(xpath = "//img[@alt='Create Product...']")
	private WebElement createProductBtn;
	
	public ProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void productPageAction() {
		createProductBtn.click();
	}

}
