package pageObjects;

import org.json.JSONObject;
import org.openqa.selenium.support.PageFactory;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import testBase.TestBase;

public class FakeNameGenerator extends TestBase{
	public static	String firstName = "";
	public static	String lastName = "";
	public  FakeNameGenerator() {
		PageFactory.initElements(driver, this);
		
	}


        // Set up WebDriver (Make sure chromedriver is in your PATH)
//        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
//        WebDriver driver = new ChromeDriver();

        // Open the website
//        driver.get("https://rizzpharma.thrivewellrx.com/Register?returnurl=");

        // Get fake name (first name, last name) from RandomUser.me API\
	
		
	
	
	public  static void fetchFakeName() {	
	
        
        
        try {
            // Make a request to RandomUser.me API for a fake user
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder()
                    .url("https://randomuser.me/api/")
                    .build();

            // Execute the request and get the response
            Response response = client.newCall(request).execute();
            String jsonResponse = response.body().string();

            // Parse the JSON response
            JSONObject jsonObject = new JSONObject(jsonResponse);
            JSONObject name = jsonObject.getJSONArray("results").getJSONObject(0).getJSONObject("name");

            // Extract first and last name
            firstName = name.getString("first");
            lastName = name.getString("last");

//            System.out.println("Generated Name: " + firstName + " " + lastName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
	}
}





