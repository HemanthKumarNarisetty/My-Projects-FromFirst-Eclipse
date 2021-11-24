package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksPage {
	/*
	 * For Creating the customer
	 */
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNew;
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement newCustomer;
	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
	private WebElement customerNameField;
	@FindBy(xpath="(//textarea[@class='textarea'])[9]")
	private WebElement description;
	@FindBy(xpath="(//div[@class='selectedItem'])[15]")
	private WebElement customerList;
	@FindBy(xpath="((//div[@class='itemRow cpItemRow '])[1])|(div[text()='Big Bang Company'])")
	private WebElement selectCustomer;
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement create;
	@FindBy(xpath="//div[@class='itemsContainer']/../div[2]/div[2]/div[3]/div[1]")
	private WebElement createdCustomer;
	/*
	 * For Editing the created customer 
	 */
	@FindBy(xpath="//div[@class='itemsContainer']/../div[2]/div[2]/div[4]")
	private WebElement editIcon;
	@FindBy(xpath="(//div[@class='actionButton'])[7]")
	private WebElement actions;
	@FindBy(xpath="(//div[text()='Delete'])[2]")
	private WebElement delete;
	@FindBy(xpath="//span[text()='Delete permanently']")
	private WebElement deletePermanently;
	/*
	 * searching for the Created customer 
	 */
	@FindBy(xpath="(//input[@type='text'])[5]")
	private WebElement searchBar;
	/*
	 * For navigating to the CreateNewCustomer popup page
	 */
	public TasksPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void addNewButton()
	{
		addNew.click();
	}
	
	public void newCustomer() 
	{
		newCustomer.click();
	}
	/*
	 * Create New Customer page
	 */
	
	public void customerName(String str)
	{
		customerNameField.click();
		customerNameField.sendKeys(str);
	}
	public WebElement customername()
	{
		return customerNameField;
	}

	public void description(String str)
	{
		description.sendKeys(str);
	}
	
	public void clickCustomer()
	{
		customerList.click();
	}
	
	public void selectCustomer()
	{
		selectCustomer.click();
	}

	public void createCustomer()
	{
		create.click();
	}
	
	/*
	 * Searching for the created customer
	 */
	public void searchCreatedCustomer(String str)
	{
		searchBar.sendKeys(str);
	}
	public WebElement customerInList()
	{
		return createdCustomer;
	}
	public String createdCustomer()
	{
		
		String str=createdCustomer.getText();
		return str;
	}
	public void clickingcreatedCustomer()
	{
		createdCustomer.click();
	}
	public void deleting_of_the_Customer() throws InterruptedException
	{
		editIcon.click();
		Thread.sleep(2000);
		actions.click();
		delete.click();
		deletePermanently.click();
	}
	
	
}
