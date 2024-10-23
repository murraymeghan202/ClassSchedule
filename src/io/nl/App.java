import com.fasterxml.jackson.databind.ObjectMapper;
import io.nl.Schedule;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class App {
  public static void main(String[[] args) throws Exception {

    ObjectMapper map = new ObjectMapper();

    //Create the JSON object
	Scanner cname = new Scanner(System.in);
	System.out.println("Enter your name: ")
	String name = cname.nextLine();
	System.out.println("Enter Class Name: ")
	String class_name = cname.nextLine();
	System.out.println("Enter Teacher's Name: ")
	String teacher = cname.nextLine();
	System.out.println("Enter class time: ")
	int time = Integer.parseInt(cname.nextLine());
	
	Schedule schedule = new Schedule(class_name, teacher, time;
	String json_string = map.writeValueAsString(schedule);
	
	//Write the Schedule to JSON
	File schedule = new File(System.getProperty("user.dir") + "/schedules/" + name))l
	FileWriter schedule_writer = new FileWriter.write(schedule, json_string));
  }
	
	
    
    
    
