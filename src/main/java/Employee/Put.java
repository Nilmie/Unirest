package Employee;

import java.util.HashMap;
import java.util.Map;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Put {
	
	   @Test
	    public void shouldReturnStatusAccepted() throws UnirestException {
	        Map<String, String> headers = new HashMap<>();
	        headers.put("accept", "application/json");
	        
	     
	        Map<String, Object> fields = new HashMap<>();
	        fields.put("first_name", "SamPi");
	        fields.put("last_name", "JonesPo");
	        fields.put("email", "JonesPi@jj.lk");
	     
	        HttpResponse<JsonNode> jsonResponse 
	          = Unirest.put("http://localhost:3000/employees/34")
	          .headers(headers).fields(fields)
	          .asJson();
	     
	        Assert.assertNotNull(jsonResponse.getBody());
	        Assert.assertEquals(200, jsonResponse.getStatus());
	   }

}
