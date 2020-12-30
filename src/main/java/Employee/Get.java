package Employee;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Get {
	
	@Test
    public void shouldReturnStatusOkay() throws UnirestException {
        HttpResponse<JsonNode> jsonResponse 
          = Unirest.get("http://localhost:3000/employees")
         
          .asJson();
     
        Assert.assertNotNull(jsonResponse.getBody());
        Assert.assertEquals(200, jsonResponse.getStatus());
    
    }


}
