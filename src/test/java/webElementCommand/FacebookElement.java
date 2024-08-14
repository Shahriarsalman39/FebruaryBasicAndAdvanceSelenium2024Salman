package webElementCommand;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class FacebookElement implements SearchContext{

	/*1. What is the super class of selenium
	 * ans: SearchContext
	 * 
	 * 2. how many methods in SearchContext?
	 * ans: two
	 * 
	 * 3. what is findElement method for?
	 * ans: find single element
	 * 
	 * 4. what is findElement method return type?
	 * ans: WebElement
	 * 
	 * 5. what is findElements method for?
	 * ans: find more than one elements
	 * 
	 * 6. what is findElements method return type?
	 * ans: List<WebElement>
	 */
	
	@Override
	public List<WebElement> findElements(By by) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebElement findElement(By by) {
		// TODO Auto-generated method stub
		return null;
	}

}
