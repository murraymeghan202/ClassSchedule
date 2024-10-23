import com.fasterxml.jackson.databind.ObjectMapper;
import 

public class App {
  public static void main(String[[] args) throws Exception {

    ObjectMapper map = new ObjectMapper();

    //Create the JSON object
    JSONObject object = new JSONObject();
    object.put("teacher", args[0]);
    object.put("class_name", args[1]);
    object.put("time", args[2]);

    //Convert the JSON Object to a String
    String json_string = object.toString();
    
    
    
