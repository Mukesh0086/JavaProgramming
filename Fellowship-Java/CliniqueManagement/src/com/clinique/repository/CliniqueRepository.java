package com.clinique.repository;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.clinique.model.Doctor;
import com.clinique.model.Patient;
import com.clinique.utility.Utility;

public class CliniqueRepository {

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

}
