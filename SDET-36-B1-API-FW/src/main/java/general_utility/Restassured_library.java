package general_utility;

import io.restassured.response.Response;

public class Restassured_library {

		
		/**
		 * this method will get the json data through json path from response body
		 * @param resp
		 * @param path
		 * @return
		 */
		
	public String getJsonData(Response response, String path) {
		// TODO Auto-generated method stub
		String jsonData = response.jsonPath().get(path);
		
		return jsonData;
	}
}
