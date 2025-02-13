package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class CategoryDropdown extends TestBase{
	@FindBy(id="openstartdatecalender")
	WebElement date_openstartdat;
	@FindBy(id="insurancesum")
	WebElement dd_insurancesum;
	@FindBy(id="damageinsurance")
	WebElement dd_damageinsurance;
	@FindBy(xpath = "//input[@name='Optional Products[]']/parent::label")
	List<WebElement> chk_ptionalproduct;
	@FindBy(id="nextselectpriceoption")
	WebElement btn_next;
	public CategoryDropdown() {
		PageFactory.initElements(driver, this);
	}

}
