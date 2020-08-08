package api_hybrid_framwork.generic;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class Json_extract 
{
	public static JSONArray Nest_json(String path,String key) throws FileNotFoundException, IOException, 
	ParseException
	{
		JSONParser js = new JSONParser();
		Object a1 = js.parse(new FileReader(path));
		JSONObject j1 = (JSONObject) a1;
		JSONArray j2 = (JSONArray) j1.get(key);
		return j2;
	}
	
	public static JSONObject single_json(String path)
	{
		JSONParser js = new JSONParser();
		try {
			Object a1 = js.parse(new FileReader(path));
			JSONObject j1 = (JSONObject) a1;
			return j1;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
