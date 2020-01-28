package com.clinique.controller;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.clinique.model.Doctor;
import com.clinique.model.Patient;
import com.clinique.utility.Utility;

public class CliniqueController {

	public static void main(String[] args) {
		JSONArray doctorArray = null;
		JSONArray patientArray = null;
		String filePatient = "/home/admin1/fellowship/Fellowship-Java/CliniqueManagement/src/com/clinique/controller/patient.json";
		String fileDoctor = "/home/admin1/fellowship/Fellowship-Java/CliniqueManagement/src/com/clinique/controller/doctor.json";
		// firstTimeWritePatient(filePatient);
		// firstTimeWriteDoctor(fileDoctor);
		patientArray = readJson(filePatient);
		doctorArray = readJson(fileDoctor);
		matchAppointments(patientArray, doctorArray);
	}

	public static void firstTimeWritePatient(String filePath) {
		Patient patient = new Patient();

		System.out.println("Enter the number of patient to be added");
		int number = Utility.readInteger();

		JSONArray array = new JSONArray();
		for (int i = 0; i < number; i++) {
			JSONObject jsonObject = new JSONObject();
			Utility.readString();
			System.out.println("Enter the name of the patient");
			String name = Utility.readString();
			System.out.println("Enter the disease of patient");
			String disease = Utility.readString();
			System.out.println("Enter the department of patient");
			String department = Utility.readString();
			patient.setName(name);
			patient.setDisease(disease);
			patient.setDepartment(department);
			jsonObject.put("name", name);
			jsonObject.put("disease", disease);
			jsonObject.put("department", department);
			array.add(jsonObject);
		}

		try {

			FileWriter fw = new FileWriter(filePath);
			fw.write(array.toString());
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void firstTimeWriteDoctor(String fileDoctor) {

		Doctor doctor = new Doctor();
		System.out.println("Enter the number of doctor to be added");
		int number = Utility.readInteger();

		JSONArray array = new JSONArray();
		for (int i = 0; i < number; i++) {
			JSONObject jsonObject = new JSONObject();
			Utility.readString();
			System.out.println("Enter the name of the doctor");
			String name = Utility.readString();
			System.out.println("Enter the id of doctor");
			Long id = Utility.readLong();
			Utility.readString();
			System.out.println("Enter the specialization of doctor");
			String specialization = Utility.readString();
			System.out.println("Enter the availablity of doctor");
			String availability = Utility.readString();
			doctor.setName(name);
			doctor.setId(id);
			doctor.setSpecialization(specialization);
			jsonObject.put("name", name);
			jsonObject.put("id", id);
			jsonObject.put("specialization", specialization);
			jsonObject.put("Availability", availability);
			array.add(jsonObject);
		}

		try {

			FileWriter fw = new FileWriter(fileDoctor);
			fw.write(array.toString());
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static JSONObject matchAppointments(JSONArray patient, JSONArray doctor) {
		JSONObject doctorObj = null;
		JSONObject patientObj = null;
		for (int i = 0; i < patient.size(); i++) {
			for (int j = 0; j < doctor.size(); j++) {
				patientObj = (JSONObject) patient.get(i);
				doctorObj = (JSONObject) doctor.get(i);
				if ((patientObj.get("department")).equals(doctorObj.get("specialization"))) {
					System.out.println(doctorObj.get("name") + ":" + patientObj.get("name"));
					break;
				}
			}
		}

		return null;
	}

	public static String popularDoctor(JSONObject obj) {

		return null;
	}

	public static JSONArray readJson(String filePath) {
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

	public static JSONObject writeJson(String filePath) {
		return null;
	}

	public static void writePatient(JSONArray array, String patientPath) {
		try {

			FileWriter fw = new FileWriter(patientPath);
			fw.write(array.toString());
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void writeDoctor(JSONArray array, String doctorPath) {
		try {

			FileWriter fw = new FileWriter(doctorPath);
			fw.write(array.toString());
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static JSONArray addDoctor(JSONArray array, String doctorPath) {
		Doctor doctor = new Doctor();
		System.out.println("Enter the name of the doctor");
		String name = Utility.readString();
		doctor.setName(name);
		System.out.println("Enter the id of the doctor");
		long id = Utility.readLong();
		doctor.setId(id);
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

	public static JSONArray addPatient(JSONArray array, String patientPath) {
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

	public static boolean checkAvailability(String doctorName, String availableTime, JSONArray doctor) {
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
}
