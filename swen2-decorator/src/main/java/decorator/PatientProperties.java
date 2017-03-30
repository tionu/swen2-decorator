package decorator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

public class PatientProperties implements Properties {

	private Patient patient;
	private DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

	public PatientProperties(Patient patient) {
		this.patient = patient;
	}

	public Map<String, String> getProperties() {
		Map<String, String> properties = new HashMap<>();
		properties.put("Nachname", patient.getNachname());
		properties.put("Vorname", patient.getVorname());
		properties.put("Geburtsdatum", dateFormat.format(patient.getGebDat()));
		return properties;
	}

}
