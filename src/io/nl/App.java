import com.fasterxml.jackson.databind.ObjectMapper;
import io.nl.Schedule;

public class App {
  public static void main(String[[] args) throws Exception {

    ObjectMapper map = new ObjectMapper();

    //Create the JSON object
	Schedule schedule = new Schedule("Pre Algebra", "Mr. Kizics", 1500);
	String json_string = map.writeValueAsString(schedule);
	
	
    
    
    
