package Employee;

import java.util.HashMap;
import java.util.Map;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Delete {
	
	   @Test
	    public void shouldReturnStatusAccepted() throws UnirestException {
     
	        HttpResponse<JsonNode> jsonResponse 
	          = Unirest.delete("http://localhost:3000/employees/33")
	          .asJson();
	     
	        Assert.assertNotNull(jsonResponse.getBody());
	        Assert.assertEquals(200, jsonResponse.getStatus());
	   }

}
