package oopsRunner;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Test {

	public static JSONArray readJsonFile(String filePath) {

		// JSON parser object to parse read file

		JSONParser jsonParser = new JSONParser();
		JSONArray inventory = null;
		try {
			FileReader reader = new FileReader(filePath);
			// Read JSON file

			inventory = (JSONArray) jsonParser.parse(reader);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return inventory;
	}

	public static void writeJsonFile() {

		// First Employee
		JSONObject employeeDetails = new JSONObject();
		employeeDetails.put("firstName", "Lokesh");
		employeeDetails.put("lastName", "Gupta");
		employeeDetails.put("website", "howtodoinjava.com");

		JSONObject employeeObject = new JSONObject();
		employeeObject.put("employee", employeeDetails);

		// Second Employee
		JSONObject employeeDetails2 = new JSONObject();
		employeeDetails2.put("firstName", "Brian");
		employeeDetails2.put("lastName", "Schultz");
		employeeDetails2.put("website", "example.com");

		JSONObject employeeObject2 = new JSONObject();
		employeeObject2.put("employee", employeeDetails2);

		// Add employees to list
		JSONArray employeeList = new JSONArray();
		employeeList.add(employeeObject);
		employeeList.add(employeeObject2);

		// Write JSON file
		try (FileWriter file = new FileWriter("employees.json")) {

			file.write(employeeList.toJSONString());
			file.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		String filePath = "/home/admin1/fellowship/Fellowship-Java/inventory.json";
		JSONArray readArray = readJsonFile(filePath);
		System.out.println(readArray);

	}

}
