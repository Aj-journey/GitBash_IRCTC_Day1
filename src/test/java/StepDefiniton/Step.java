package StepDefiniton;

import java.io.IOException;

import BaseLayer.BaseClass;
import PageLayer.BookingPageClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Step extends BaseClass{

	static BookingPageClass bp;
@Given("user should be on ticketBooking page in {string} browser")
public void user_should_be_on_ticket_booking_page_in_browser(String browser) throws IOException 
{
	BaseClass.initialization(browser);
	
}
@When("user should enter valid {string} as from")
public void user_should_enter_valid_as_from(String From) throws InterruptedException 
{
	 bp = new BookingPageClass();
	 
	 bp.enterFrom(From);
}
@When("user should enter valid {string} as to")
public void user_should_enter_valid_as_to(String To) throws InterruptedException 
{
	
	bp.enterTo(To);
	
}

@When("user should enter valid {string} as month and {string} as Year")
public void user_should_enter_valid_as_month_and_as_year(String Month, String Year) throws InterruptedException 
{
	Thread.sleep(4000);
	bp.enterMonthAndYear(Month, Year);
	Thread.sleep(4000);
}
@When("user shoould enter valid {string} as Date")
public void user_shoould_enter_valid_as_date(String Date) throws InterruptedException 
{
	
   Thread.sleep(3000);
	bp.enterDate(Date);
}
}
