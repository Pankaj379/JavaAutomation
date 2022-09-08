package com.telus.devops;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class RegisterTheUserWithEndToEndFlow {
	public WebDriver driver;

// updated by pankaj
	// Assign the values
	String url = "https://nxtgenaiacademy.com/";
	String firstNameValue = "PANKAJ";
	String lastNameValue = "PRINCE";
	String addressValue = "Shahpur Kandi Jugial";
	String streetAddressValue = "Near Gurudwara PTK Road";
	String cityValue = "PATHANKOT";
	String stateValue = "PUNJAB";
	String postalValue = "145029";
	String countryValue = "India";
	String emailValue = "prince379@gmail.com";
	String dateOfDemoValue = "29/07/2022";
	String listHhValue = "07";
	String listMmValue = "20";
	String mobNumberValue = "8556058854";
	String entQueryValue = "Total Fee of the course";
	String regExpectedValue = "Registration Form is Successfully Submitted.";




	@Test(priority=1)
	public void launchTheApplication() {

		// Set system property for the chrome browser
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");

		// Create instance for chrome driver
		driver = new ChromeDriver();

		// launch the url 
		driver.get(url);
		System.out.println("Application is launched successfully");

		// maximize the application
		driver.manage().window().maximize();
		System.out.println("Application maximized successfully");

	}


	@Test(priority=2)
	public void navigateToRegistrationForm() {


		// Handling Mouse Hover
		//Create an Instance in Action Class by passing  webdriver Instance
		Actions action = new Actions(driver);

		// Performing the Mouse Hover Action on the qaAutomation
		WebElement qaAutomation = driver.findElement(By.linkText("QA AUTOMATION"));
		// Verify the QA AUTOMATION is displayed or not
		if(qaAutomation.isDisplayed()) {
			System.out.println("Qa automation is displayed");
		}else {
			System.out.println("Qa automation is not displayed");
		}

		// Verify the QA AUTOMATION is enabled or not
		if(qaAutomation.isEnabled()) {
			action.moveToElement(qaAutomation).perform();
			System.out.println("Qa automation is selected");
		}else {
			System.out.println("Qa automation is not selected");
		}


		// Perform the mouse hover action on the practiceAutomation
		WebElement pracAutomation = driver.findElement(By.linkText("Practice Automation"));
		// Verify the Practice Automation is displayed or not
		if (pracAutomation.isDisplayed()) {
			System.out.println("Practice automation is displayed");
		}else {
			System.out.println("Practice automation is not displayed");
		}

		// Verify the Practice Automation is enabled or not
		if(pracAutomation.isEnabled()) {
			action.moveToElement(pracAutomation).perform();
			System.out.println("Practice automation is selected");
		}else {
			System.out.println("Practice automation is not selected");
		}



		// Click on Registration Form
		WebElement registrationForm = driver.findElement(By.partialLinkText("Registration Form"));
		// Verify the Registration Form is displayed or not
		if (registrationForm.isDisplayed()) {
			System.out.println("Registration form is displayed");
		}else {
			System.out.println("Registration form is not displayed");
		}

		// Verify the Registration Form is enabled or not
		if (registrationForm.isEnabled()) {
			registrationForm.click();
			System.out.println("Registration form is selected");
		}else {
			System.out.println("Registration form is not selected");
		}

	}


	@Test(priority=3)
	public void registerTheUser() {



		// Verify the register for demo title
		WebElement verTitle = driver.findElement(By.xpath("//*[text()='Register For Demo']"));

		// Verify the registration title is displayed
		if(verTitle.isDisplayed()) {
			System.out.println("Registration title is displayed");
		}else {
			System.out.println("Registration title is not displayed");
		}

		// Validating the registration title
		String actRegTitle = verTitle.getText();
		String expRegTitle = "Register For Demo";
		if(actRegTitle.equals(expRegTitle)) {
			System.out.println("Registration title is = " + actRegTitle);
		}else {
			System.out.println("Actual and expected registration title are not same");
			System.out.println("Actual registration title is = " + actRegTitle);
			System.out.println("Expected registration title is = " + expRegTitle);
		}




		// Handling TextBox - isSelected()

		// Declare the webelement object for first name
		WebElement firstName = driver.findElement(By.xpath("//input[@id='vfb-5']"));
		// Verify the first name is displayed or not
		if(firstName.isDisplayed()) {
			System.out.println("First name is displayed");
			firstName.sendKeys(firstNameValue);
			System.out.println("First name is " + firstNameValue);
		}
		else {
			System.out.println("First name is not displayed");
		}


		// Declare the webElement object for last name
		WebElement lastName = driver.findElement(By.xpath("//input[@id='vfb-7']"));
		// Verify the last name is displayed or not
		if(lastName.isDisplayed()) {
			System.out.println("Last name is displayed");
			lastName.sendKeys(lastNameValue);
			System.out.println("Last name is " + lastNameValue);
		}
		else {
			System.out.println("Last name is not displayed");
		}

		// Handling radioButton - isSelected()

		// Declaring the WebElement object - for the 2nd option 
		WebElement femaleRadioBtn = driver.findElement(By.id("vfb-8-2"));
		// Verify the Female Radio Button is selected
		if(femaleRadioBtn.isSelected()) {
			System.out.println("Female radio button is selected");
		}
		else {
			System.out.println("Female radio button is not selected");
			femaleRadioBtn.click();
			System.out.println("Female radio button is clicked");
		}

		// Selected or not
		if(femaleRadioBtn.isSelected()) {
			System.out.println("Female radio button is selected");
		}
		else {
			System.out.println("Female radio button is not selected");
		}


		// Declare the webElement object for Address
		WebElement Address = driver.findElement(By.xpath("//input[@id='vfb-13-address']"));
		// Verify the Address is displayed or not
		if(Address.isDisplayed()) {
			System.out.println("Address is displayed");
			Address.sendKeys(addressValue);
			System.out.println("Address is " + addressValue);
		}
		else {
			System.out.println("Address is not displayed");
		}


		// Declare the webElement object for Street Address
		WebElement streetAddress = driver.findElement(By.xpath("//input[@id='vfb-13-address-2']"));
		// Verify the Street Address is displayed or not
		if(streetAddress.isDisplayed()) {
			System.out.println("Street Address is displayed");
			streetAddress.sendKeys(streetAddressValue);
			System.out.println("Street Address is " + streetAddressValue);
		}
		else {
			System.out.println("Street Address is not displayed");
		}


		// Declare the webElement object for City
		WebElement city = driver.findElement(By.xpath("//input[@id='vfb-13-city']"));
		// Verify the City is displayed or not
		if(city.isDisplayed()) {
			System.out.println("Street Address is displayed");
			city.sendKeys(cityValue);
			System.out.println("City is " + cityValue);
		}
		else {
			System.out.println("City is not displayed");
		}


		// Declare the webElement object for State
		WebElement state = driver.findElement(By.xpath("//input[@id='vfb-13-state']"));
		// Verify the State is displayed or not
		if(state.isDisplayed()) {
			System.out.println("State is displayed");
			state.sendKeys(stateValue);
			System.out.println("State is " + stateValue);
		}
		else {
			System.out.println("State is not displayed");
		}



		// Declare the webElement object for Postal
		WebElement postal = driver.findElement(By.xpath("//input[@id='vfb-13-zip']"));
		// Verify the postal is displayed or not
		if(postal.isDisplayed()) {
			System.out.println("Postal is displayed");
			postal.sendKeys(postalValue);
			System.out.println("Postal is " + postalValue);
		}
		else {
			System.out.println("Postal is not displayed");
		}



		// Handling the Country DropDown - isDisplayed()
		WebElement countryDropDown = driver.findElement(By.xpath("//select[@id='vfb-13-country']"));
		// Verify the country DropDown is Displayed()
		if(countryDropDown.isDisplayed()) {
			System.out.println("Country dropdown is displayed");
		}else {
			System.out.println("Country dropdown is not displayed");
		}

		// Verify the Country DropDown - isEnabled()
		if(countryDropDown.isEnabled()) {
			System.out.println("Country dropdown is enabled");
		}else {
			System.out.println("Country dropdown is not enabled");
		}

		// Select the Country From DropDown
		Select cDropDown = new Select(countryDropDown);
		if(countryDropDown.isEnabled()) {
			// Select using Value
			cDropDown.selectByValue(countryValue);
			System.out.println(countryValue + " is selected");	
		}else {
			System.out.println("Country dropdown is not enabled");
		}

		// Declare the webElement object for Email
		WebElement email = driver.findElement(By.xpath("//input[@id='vfb-14']"));
		// Verify the Email is displayed or not
		if(email.isDisplayed()) {
			System.out.println("Email is displayed");
			email.sendKeys(emailValue);
			System.out.println("Email is " + emailValue);
		}
		else {
			System.out.println("Email is not displayed");
		}


		// Declare the webElement object for Date Of Demo
		WebElement dateOfDemo = driver.findElement(By.xpath("//input[@id='vfb-18']"));
		// Verify the Date Of Demo is displayed or not
		if(dateOfDemo.isDisplayed()) {
			System.out.println("Date of demo is displayed");
			dateOfDemo.sendKeys(dateOfDemoValue);
			System.out.println("Date of demo is " + dateOfDemoValue);
		}
		else {
			System.out.println("Date of demo is not displayed");
		}


		// Handling the DropDown for Convenient Time in Hours
		WebElement timeDropDownHh = driver.findElement(By.xpath("//select[@id='vfb-16-hour']"));
		// Verify the Time DropDown is displayed
		if(timeDropDownHh.isDisplayed()) {
			System.out.println("Time in hour dropdown is displayed");
		}else {
			System.out.println("Time in hour dropdown is not displayed");
		}
		// Verify the Convenient Time in Hours DropDown - isEnabled()
		if(timeDropDownHh.isEnabled()) {
			System.out.println("Convenient time in hours dropdown is enabled");
		}else {
			System.out.println("Convenient time in hours dropdown is not enabled");
		}
		// Select the Convenient From DropDown
		Select conDropDownHh = new Select(timeDropDownHh);
		if(timeDropDownHh.isEnabled()) {
			// Select using Index Number
			conDropDownHh.selectByValue(listHhValue);
			System.out.println(listHhValue + " = From the list is selected");	
		}else {
			System.out.println("Time dropdown is not enabled");
		}

		// Handling the DropDown for Convenient Time in Minutes
		WebElement timeDropDownMm = driver.findElement(By.xpath("//select[@id='vfb-16-min']"));
		// Verify the Time DropDown is displayed
		if(timeDropDownMm.isDisplayed()) {
			System.out.println("Time in minutes dropdown is displayed");
		}else {
			System.out.println("Time in minutes dropdown is not displayed");
		}
		// Verify the Convenient Time in Minutes DropDown - isEnabled()
		if(timeDropDownMm.isEnabled()) {
			System.out.println("Convenient time in minutes dropdown is enabled");
		}else {
			System.out.println("Convenient time in minutes dropdown is not enabled");
		}
		// Select the Convenient Time From DropDown
		Select conDropDownMm = new Select(timeDropDownMm);
		if(timeDropDownMm.isEnabled()) {
			// Select using Index Number
			conDropDownMm.selectByValue(listMmValue);
			System.out.println(listMmValue + " = From the list is selected");	
		}else {
			System.out.println("Time dropdown is not enabled");
		}

		// Declare the webElement object for Mobile Number
		WebElement mobileNumber = driver.findElement(By.xpath("//input[@id='vfb-19']"));
		// Verify the Mobile Number is displayed or not
		if(mobileNumber.isDisplayed()) {
			System.out.println("Mobile number is displayed");
			mobileNumber.sendKeys(mobNumberValue);
			System.out.println("Mobile number is " + mobNumberValue);
		}
		else {
			System.out.println("Mobile number is not displayed");
		}

		// Handling the checkbox - isSelected()

		// Verify the testNGCheckbox is selected
		WebElement testNGCheckbox = driver.findElement(By.xpath("//input[@id='vfb-20-2']"));
		if(testNGCheckbox.isSelected()) {
			System.out.println("testNG checkbox is selected");
		}
		else {
			System.out.println("TestNG checkbox is not selected");
			testNGCheckbox.click();
			System.out.println("TestNG checkbox is clicked");
		}

		// Selected or not
		if(testNGCheckbox.isSelected()) {
			System.out.println("TestNG checkbox is selected");
		}
		else {
			System.out.println("TestNG checkbox is not selected");
		}

		// Verify the UFTCheckbox is selected
		WebElement UFTCheckbox = driver.findElement(By.xpath("//input[@id='vfb-20-1']"));
		if(UFTCheckbox.isSelected()) {
			System.out.println("UFT checkbox is selected");
		}
		else {
			System.out.println("UFT checkbox is not selected");
			UFTCheckbox.click();
			System.out.println("UFT checkbox is clicked");
		}

		// Selected or not
		if(UFTCheckbox.isSelected()) {
			System.out.println("UFT checkbox is selected");
		}
		else {
			System.out.println("UFT checkbox is not selected");
		}



		// Handling the Image - isDisplayed()

		// Robot Image
		WebElement robotImage = driver.findElement(By.xpath("//img[@alt='Automation']"));
		if(robotImage.isDisplayed()) {
			System.out.println("Robot image is displayed");
			// verify the robot image text
			System.out.println(robotImage.getAttribute("alt"));
			String robotActTest = robotImage.getAttribute("alt");
			String robotExpTest = "Automation";
			if(robotActTest.equals(robotExpTest)) {
				System.out.println("The robot image text is = " + robotActTest);
			}else {
				System.out.println("The actual and expected image values are not same");
			}


			// Handling the Query - isDisplayed()

			// Declare the webElement object for Enter Your Query
			WebElement entQuery = driver.findElement(By.xpath("//textarea[@id='vfb-23']"));
			// Verify the Entered query is displayed or not
			if(entQuery.isDisplayed()) {
				System.out.println("Entered query is displayed");
				entQuery.sendKeys(entQueryValue);
				System.out.println("Entered query is = " + entQueryValue);
			}
			else {
				System.out.println("Entered query is not displayed");
			}		

			// Handling the Verifcation - Please enter two digits as displayed in Example
			WebElement verNumber = driver.findElement(By.xpath("//*[contains(text(),'Example:')]"));
			// Verify Please enter two digits as displayed in Example
			if(verNumber.isDisplayed()) {
				System.out.println("Please enter two digits as displayed in example is displayed");
				String exampleValue = verNumber.getText();
				System.out.println(exampleValue);
			}else {
				System.out.println("Please enter two digits as displayed in example is not displayed");
			}

			// Handling the 2-digit Number
			WebElement exampleNumValue = driver.findElement(By.xpath("//input[@id='vfb-3']"));
			if (exampleNumValue.isDisplayed()) {
				String exampleValue = verNumber.getText();
				String artValue[] = exampleValue.split(":");
				String verificationNumber = artValue[1].trim();
				exampleNumValue.sendKeys(verificationNumber);
				System.out.println("Verification number is = "+ verificationNumber);
			}else {
				System.out.println("Verification number is not displayed");
			}



			// Handling the Button - isEnabled()

			WebElement submitBtn = driver.findElement(By.xpath("//input[@id='vfb-4']"));

			// verify the Submit Button is enabled
			if(submitBtn.isEnabled()) {
				System.out.println("Submit button is enabled");
				submitBtn.click();
				System.out.println("Submit button is clicked");

			} else {
				System.out.println("Submit button is not enabled");

			}

		}



	}


	@Test(priority=4)
	public void validateTheSuccessfulMessage() {


		// Handling the Registration Form is Successfully Submitted

		WebElement regSubmit = driver.findElement(By.xpath("//*[contains(text(),'Registration Form is Successfully Submitted')]"));

		// Verify the Registration Form is Displayed()

		if(regSubmit.isDisplayed()) {
			System.out.println("Registration form success message is displayed");
			String successMsg = regSubmit.getText();
			System.out.println(successMsg);
		}else {
			System.out.println("Registration form is not successfully submitted");
		}

		// Verify the Registration success message
		String successMsg = regSubmit.getText();
		String transValue[] = successMsg.split(":");
		System.out.println("Transaction ID is = " + transValue[1]);

		if(successMsg.contains(regExpectedValue)) {
			System.out.println("Expected result is same as actual result");

		}
		else {
			System.out.println("Expected and actual result are not same");
		}



	}


	@Test(priority=5)
	public void closeTheApplication() {


		// Close the application
		driver.close();
		System.out.println("Application closed successfully");



	}

}
