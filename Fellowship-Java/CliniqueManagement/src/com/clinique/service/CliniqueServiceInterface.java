package com.clinique.service;

import java.util.HashMap;

import org.json.simple.JSONArray;


public interface CliniqueServiceInterface {

	public HashMap<String, String> matchAppointments(JSONArray patient, JSONArray doctor);

	public JSONArray readJson(String filePath);

	public void writePatient(JSONArray array, String patientPath);

	public void writeDoctor(JSONArray array, String doctorPath);

	public JSONArray addDoctor(JSONArray array, String doctorPath);

	public JSONArray addPatient(JSONArray array, String patientPath);

	public boolean checkAvailability(String doctorName, String availableTime, JSONArray doctor);
	
	public String popularDoctor(HashMap<String,String> map);
	
	public int patientToDoctor(HashMap<String,String> map,String doctorName);

}
