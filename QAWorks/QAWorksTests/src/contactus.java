import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.qaworks.Browser;
import com.qaworks.Page;

public class contactus {

	@Before
	public void Setup()
	{
		Page.homepage().Goto();
		assertTrue(Page.homepage().IsAt());
		Page.homepage().navigateToContactPage();
		assertTrue(Page.contact().IsAt());
	}
	
	@Test
	public void validatesuccessfulsubmissionofquery()
	{
		Page.contact().enterContactForm("J Bloggs","j.Bloggs@qaworks.com","please contact me I want to find out more");
		assertEquals(Browser.Title(),"QAWorks");
	}
	
	@After
	public void Cleanup()
	{
		Browser.close();
	}
	
	
	
}
