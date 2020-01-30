package com.clinique.controller;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.clinique.model.Doctor;
import com.clinique.model.Patient;
import com.clinique.service.CliniqueServiceClass;
import com.clinique.service.CliniqueServiceInterface;
import com.clinique.utility.Utility;

public class CliniqueController {

	public static void main(String[] args) {
		HashMap<String, String> hmap = null;
		CliniqueServiceInterface cliniqueServiceInterface = new CliniqueServiceClass();
		JSONArray doctorArray = null;
		JSONArray patientArray = null;
		JSONArray appointmentArray = null;
		JSONArray updatedDoctorArray = null;
		JSONArray updatedPatientArray = null;
		String filePatient = "/home/admin1/fellowship/Fellowship-Java/CliniqueManagement/src/com/clinique/controller/patient.json";
		String fileDoctor = "/home/admin1/fellowship/Fellowship-Java/CliniqueManagement/src/com/clinique/controller/doctor.json";
		String fileappointment = "/home/admin1/fellowship/Fellowship-Java/CliniqueManagement/src/com/clinique/controller/appointment.json";
		System.out.println(
				"Enter 1 to view list of doctors Enter 2 to view list of patients \nEnter 3 for adding a doctor Enter 4 for adding a patient\nEnter 5 for getting appointments report Enter 6 for getting popular doctor details\nEnter 7 for number of appointments for doctor Enter 8 to exit");
		int choice = Utility.readInteger();
		switch (choice) {
		case 1:
			doctorArray = cliniqueServiceInterface.readJson(fileDoctor);
			System.out.println(doctorArray);
			break;

		case 2:
			patientArray = cliniqueServiceInterface.readJson(filePatient);
			System.out.println(patientArray);
			break;

		case 3:
			doctorArray = cliniqueServiceInterface.readJson(fileDoctor);
			updatedDoctorArray = cliniqueServiceInterface.addDoctor(doctorArray, fileDoctor);
			cliniqueServiceInterface.writeDoctor(updatedDoctorArray, fileDoctor);
			System.out.println(updatedDoctorArray);
			break;

		case 4:
			patientArray = cliniqueServiceInterface.readJson(filePatient);
			updatedDoctorArray = cliniqueServiceInterface.addPatient(patientArray, filePatient);
			cliniqueServiceInterface.writePatient(updatedPatientArray, filePatient);
			System.out.println(updatedDoctorArray);

			break;
		case 5:
			doctorArray = cliniqueServiceInterface.readJson(fileDoctor);
			patientArray = cliniqueServiceInterface.readJson(filePatient);
			HashMap<String, String> match = cliniqueServiceInterface.matchAppointments(patientArray, doctorArray);
			for (Map.Entry<String, String> matching : match.entrySet()) {
				System.out.println(matching.getKey() + "--" + matching.getValue());
			}
			break;
		case 6:
			doctorArray = cliniqueServiceInterface.readJson(fileDoctor);
			patientArray = cliniqueServiceInterface.readJson(filePatient);
			hmap = cliniqueServiceInterface.matchAppointments(patientArray, doctorArray);
			String popularDoctor = cliniqueServiceInterface.popularDoctor(hmap);
			System.out.println(popularDoctor);
			break;
		case 7:

			System.out.println("Enter the doctor name to count the patients matched");
			String doctorName = Utility.readString();

			doctorArray = cliniqueServiceInterface.readJson(fileDoctor);
			patientArray = cliniqueServiceInterface.readJson(filePatient);
			hmap = cliniqueServiceInterface.matchAppointments(patientArray, doctorArray);
			int count = cliniqueServiceInterface.patientToDoctor(hmap, doctorName);
			System.out.println("The number ofpatients mapped to "+doctorName+"is "+count);
			break;
		case 8:
			break;
		}

		// firstTimeWritePatient(filePatient);
		// firstTimeWriteDoctor(fileDoctor);

	}

	public static String popularDoctor(JSONObject obj) {

		return null;
	}

	public static JSONObject writeJson(String filePath) {
		return null;
	}

}
