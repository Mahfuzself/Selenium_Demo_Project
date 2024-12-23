package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class homePage extends  TestBase {
  @FindBy(id="nav_automobile")
  WebElement link_automobile;
  @FindBy(id="nav_truck")
  WebElement link_truck;
  @FindBy(id="nav_camper")
  WebElement link_camper;
  @FindBy(xpath =  "(//a[@name=\"Navigation Motorcycle\"])[1]")
  WebElement link_motorcycle;
  public  homePage(){
	  PageFactory.initElements(driver, this);
  }
  
   public void ClickMotorCycleLink() {
             link_motorcycle.click();
	 
            }
}
