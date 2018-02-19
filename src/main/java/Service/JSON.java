package Service;
import java.util.Iterator;
import java.util.Map;

import org.json.*;

public class JSON {
	private String fName;
	private String lName;
	private int number;
	
	public static void createJsonObject() {
		Map map = Service.getMap();
		JSONObject obj = new JSONObject(map);
		System.out.println(obj);
		
	}
}
