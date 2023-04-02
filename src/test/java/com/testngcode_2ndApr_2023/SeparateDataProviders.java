package com.testngcode_2ndApr_2023;

import org.testng.annotations.DataProvider;

public class SeparateDataProviders {
	
	@DataProvider(name = "dataForTN")

	public static Object[][] getNinjaData() {

		Object[][] data = { { "seleniumpanda@gmail.com", "Selenium@123" },
				                      { "seleniumpanda1@gmail.com", "Selenium@123" }, 
				                      { "seleniumpanda2@gmail.com", "Selenium@123" },
				                      { "seleniumpanda845@gmail.com", "Selenium@123" } };
       return data;
	}

	@DataProvider(name = "dataForRediff")
	
	public static Object[][] getRediffData(){
	Object[][] data = {{"seleniumpanda@rediffmail.com", "Selenium@123"},
                                 { "seleniumpanda1@rediffmail.com", "Selenium@123"},
                                 { "seleniumpanda2@rediffmail.com", "Selenium@123"},
                                 {  "seleniumpanda845@rediffmail.com", "Selenium@123" }};

	return data;
}

}



