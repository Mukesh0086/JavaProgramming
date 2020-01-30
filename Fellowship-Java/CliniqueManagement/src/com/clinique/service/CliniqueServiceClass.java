package com.clinique.service;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.clinique.model.Doctor;
import com.clinique.model.Patient;
import com.clinique.utility.Utility;

public class CliniqueServiceClass implements CliniqueServiceInterface{
	HashMap<String,String> match=new HashMap<String, String>();
	@Override
	public HashMap<String,String> matchAppointments(JSONArray patient, JSONArray doctor) {
		
		
		JSONArray root= new JSONArray();
		JSONArray arr=new JSONArray();
		JSONObject doctorObj = new JSONObject();
		JSONObject patientObj = new JSONObject();
		JSONObject app= new JSONObject();
		boolean flag=false;
		int a=0;
		String drn="";
		String ptn;
		
		
		for(int j=0;j<patient.size();j++)
		{
			patientObj=(JSONObject) patient.get(j);
			for(int i=0;i<doctor.size();i++)
			{
				
				doctorObj=(JSONObject) doctor.get(i);
				String doc=(String) doctorObj.get("specialization");
				
				String pat=(String) patientObj.get("department");
				drn=(String) doctorObj.get("name");
				if(doc.equals(pat))
				{
					match.put(patientObj.get("name").toString(),doctorObj.get("name").toString());
				}
			}
		}
		
		
		return match;
	}

	@Override
	public JSONArray readJson(String filePath) {
		JSONParser parser = new JSONParser();
		JSONArray array = null;
		try {
			FileReader fileReader = new FileReader(filePath);
			array = (JSONArray) parser.parse(fileReader);
			fileReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return array;

		
	}

	@Override
	public void writePatient(JSONArray array, String patientPath) {

		try {

			FileWriter fw = new FileWriter(patientPath);
			fw.write(array.toString());
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void writeDoctor(JSONArray array, String doctorPath) {
		try {

			FileWriter fw = new FileWriter(doctorPath);
			fw.write(array.toString());
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public JSONArray addDoctor(JSONArray array, String doctorPath) {
	

		Doctor doctor = new Doctor();
		Utility.readString();
		System.out.println("Enter the name of the doctor");
		String name = Utility.readString();
		doctor.setName(name);
		System.out.println("Enter the id of the doctor");
		long id = Utility.readLong();
		doctor.setId(id);
		Utility.readString();
		System.out.println("Enter the specialization of the doctor");
		String specialization = Utility.readString();
		doctor.setSpecialization(specialization);
		System.out.println("Enter availability of doctor");
		String availability = Utility.readString();
		doctor.setAvailability(availability);

		JSONObject jsonObject = new JSONObject();
		jsonObject.put("name", doctor.getName());
		jsonObject.put("id", doctor.getId());
		jsonObject.put("specialization", doctor.getSpecialization());
		jsonObject.put("availability", doctor.getAvailability());
		array.add(jsonObject);
		writeDoctor(array, doctorPath);

		return array;
	}

	@Override
	public JSONArray addPatient(JSONArray array, String patientPath) {
		Patient patient = new Patient();
		System.out.println("Enter the name of the patient");
		String name = Utility.readString();
		patient.setName(name);
		System.out.println("Enter the disease of the patient");
		String disease = Utility.readString();
		patient.setDisease(disease);
		System.out.println("Enter the department of the doctor");
		String department = Utility.readString();
		patient.setDepartment(department);

		JSONObject jsonObject = new JSONObject();
		jsonObject.put("name", patient.getName());
		jsonObject.put("id", patient.getDisease());
		jsonObject.put("specialization", patient.getDepartment());

		array.add(jsonObject);
		writePatient(array, patientPath);
		return array;
	}

	@Override
	public boolean checkAvailability(String doctorName, String availableTime, JSONArray doctor) {
		boolean flag = false;
		JSONObject obj = new JSONObject();
		for (int i = 0; i < doctor.size(); i++) {
			obj = (JSONObject) doctor.get(i);
			if (obj.get("availability").equals(availableTime)) {
				flag = true;
			}
		}
		return flag;
	}

	@Override
	public String popularDoctor(HashMap<String, String> map) {
		int count;
		int maxCount=0;
		String popularDoctor=null;
		ArrayList<String> doctors=new ArrayList();
		for(Map.Entry<String, String> doctor:map.entrySet())
		{
			doctors.add(doctor.getValue());
			//System.out.println(doctor.getValue());
		}
		
		
		for(int i=0;i<doctors.size();i++)
		{
			  count = 1;    
	               
	            for(int j = i+1; j < doctors.size(); j++){    
	                if(doctors.get(i).equals(doctors.get(j))){    
	                    count++;    
	                }     
	            }    
	            //If maxCount is less than count then store value of count in maxCount     
	            //and corresponding word to variable word    
	            if(count > maxCount){    
	                maxCount = count;    
	                popularDoctor = doctors.get(i);    
	            }    
	        }    
		
		return popularDoctor;
		
		
	}

	@Override
	public int patientToDoctor(HashMap<String, String> map, String doctorName) {
		int count=0;
		ArrayList<String> doctorList=new ArrayList<String>();
		for(Map.Entry<String, String> doctors:map.entrySet())
		{
			if(doctorName.equalsIgnoreCase(doctors.getValue()))
					{
						count=count+1;
					}
		}
		return count;
	}

	

	
	
	

}
