package Employee;

import java.util.HashMap;
import java.util.Map;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Post {
	
	   @Test
	    public void shouldReturnStatusAccepted() throws UnirestException {
	        Map<String, String> headers = new HashMap<>();
	        headers.put("accept", "application/json");
	        
	     
	        Map<String, Object> fields = new HashMap<>();
	        fields.put("first_name", "Sam");
	        fields.put("last_name", "Jones");
	        fields.put("email", "Jones@jj.lk");
	     
	        HttpResponse<JsonNode> jsonResponse 
	          = Unirest.post("http://localhost:3000/employees")
	          .headers(headers).fields(fields)
	          .asJson();
	     
	        Assert.assertNotNull(jsonResponse.getBody());
	        Assert.assertEquals(201, jsonResponse.getStatus());
	   }

}
