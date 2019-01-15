package GetRequest;
import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.annotations.*;
import io.restassured.response.Response;
public class GetData {
	
	@Test
	public void testResponseCode() {
		Response res = RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk");
		System.out.println(res.getStatusCode());
		Assert.assertEquals(res.getStatusCode(),200);
	}
	
	@Test
	public void testBody() {
		Response res = RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk");
		System.out.println(res.asString());
	}
}
