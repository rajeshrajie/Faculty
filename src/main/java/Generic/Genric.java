package Generic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Base.Browser;

public class Genric extends Browser {
	
	public boolean SendKeys(WebDriver d, By elementToBeEntered, String text)
	{
		
		if(Enabled(d,elementToBeEntered) && display(d,elementToBeEntered))
		{
			try
			{
				d.findElement(elementToBeEntered).sendKeys(text);
				return true;
			}
			catch(Exception e)
			{
				return false;
			}
		}
		else
		{
			return false;
		}
		
	
	}
 
	public boolean Enabled(WebDriver d, By elementToBeEnable)
	{
		try
		{
			d.findElement(elementToBeEnable).isEnabled();
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean Selected(WebDriver d, By elementToBeEnable)
	{
		try
		{
			d.findElement(elementToBeEnable).isSelected();
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	//Genric isEnabled method
	public boolean display(WebDriver d, By elementToBevisible)
	{
		try
		{
			d.findElement(elementToBevisible).isDisplayed();
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean Click(WebDriver driver, By elementToBeClicked)
	{
		WebElement ele=driver.findElement(elementToBeClicked);
		if(ele.isDisplayed() & ele.isEnabled())
		{
			try
			{
				ele.click();
				return true;
			}
			catch(Exception e)
			{
				e.printStackTrace();
				return false;	
			}
			
		}
		else
		{
			return false;
		}
		
	}
	
	public boolean ElementStatus(WebDriver driver,By path,String e)
	{
		List<WebElement> l=driver.findElements(path);
		boolean found=false;
		for(WebElement x:l)
		{
			if(x.getText().equalsIgnoreCase(e))
			{
				found=true;
				break;
			}
		}
		return found;
	}
	
	public boolean Login(WebDriver d,By username,By password,By submit,String Uname,String Pass)
	{
		try
		{
			SendKeys(d,username,Uname);
			SendKeys(d,password,Pass);
			Click(d,submit);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public void DropdownSelect(WebDriver d,By e,String s)
	{
		Select se = new Select(d.findElement(e));
		se.selectByVisibleText(s);
	}

}
