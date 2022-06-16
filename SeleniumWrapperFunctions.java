package genric;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SeleniumWrapperFunctions {
	
	private Pojo objPojo;
	
	public SeleniumWrapperFunctions (Pojo pojo) {
		this.objPojo = pojo;
	}
	
          //set Text
	public boolean setText(By locator) {
		try {
			objPojo.getDriver().findElement(locator).click();
			return true;
		} catch (Exception exception) {
			System.out.println("I got Error  : "+exception.getMessage());
			exception.printStackTrace();
			return false;
		}
	}

         //click
          public boolean seClicktButton(By locator,String inputValue) {
	try {
		objPojo.getDriver().findElement(locator).sendKeys(inputValue);
		return true;
	} catch (Exception exception) {
		System.out.println("I got Error  : "+exception.getMessage());
		exception.printStackTrace();
		return false;
	}
          }	
          

	//Check Box
          public boolean setCheckBox(By locator) {
        		try {
     WebElement checkBox=  objPojo.getDriver().findElement(locator);
		System.out.println(checkBox.isSelected());
		
		if(checkBox.isSelected())
			System.out.println("Selected");
		else
			System.out.println("is not Selected");
        return true;
        
         } catch (Exception exception) {
        			System.out.println("I got Error  : "+exception.getMessage());
        			exception.printStackTrace();
        			return false;
        		}
				
          }

    //MouseOver :
      public boolean MouseOver(By locator) {
	    try {
  WebElement element=  objPojo.getDriver().findElement(locator);
  Actions objActions = new Actions(objPojo.getDriver());
  objActions.moveToElement(element).perform();
  return true;

} catch (Exception exception) {
		System.out.println("I got Error  : "+exception.getMessage());
		exception.printStackTrace();
		return false;
	}
  }
  
}
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		