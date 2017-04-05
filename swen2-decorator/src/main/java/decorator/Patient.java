package decorator;

import java.util.Date;

public class Patient {

	private int id;
	private String nachname;
	private String vorname;
	private Date gebDat;
	private String telefonnummer;
	private String strasse;
	private String hausnummer;
	private int plz;
	private String ort;

	private Patient(PatientBuilder patientBuilder) {
		this.id = patientBuilder.id;
		this.nachname = patientBuilder.nachname;
		this.vorname = patientBuilder.vorname;
		this.gebDat = patientBuilder.gebDat;
		this.telefonnummer = patientBuilder.telefonnummer;
		this.strasse = patientBuilder.strasse;
		this.hausnummer = patientBuilder.hausnummer;
		this.plz = patientBuilder.plz;
		this.ort = patientBuilder.ort;
	}

	public static class PatientBuilder {
		private int id;
		private String nachname;
		private String vorname;
		private Date gebDat;
		private String telefonnummer;
		private String strasse;
		private String hausnummer;
		private int plz;
		private String ort;

		public PatientBuilder id(int id) {
			this.id = id;
			return (this);
		}

		public PatientBuilder nachname(String nachname) {
			this.nachname = nachname;
			return (this);
		}

		public PatientBuilder vorname(String vorname) {
			this.vorname = vorname;
			return (this);
		}

		public PatientBuilder gebDat(Date gebDat) {
			this.gebDat = gebDat;
			return (this);
		}

		public PatientBuilder telefonnummer(String telefonnummer) {
			this.telefonnummer = telefonnummer;
			return (this);
		}

		public PatientBuilder strasse(String strasse) {
			this.strasse = strasse;
			return (this);
		}

		public PatientBuilder hausnummer(String hausnummer) {
			this.hausnummer = hausnummer;
			return (this);
		}

		public PatientBuilder ort(String ort) {
			this.ort = ort;
			return (this);
		}

		public PatientBuilder adresse(String strasse, String hausnummer, int plz, String ort) {
			this.strasse = strasse;
			this.hausnummer = hausnummer;
			this.plz = plz;
			this.ort = ort;
			return (this);
		}

		public Patient build() {
			return (new Patient(this));
		}

	}

	public int getId() {
		return id;
	}

	public String getNachname() {
		return nachname;
	}

	public String getVorname() {
		return vorname;
	}

	public Date getGebDat() {
		return gebDat;
	}

	public String getTelefonnummer() {
		return telefonnummer;
	}

	public String getStrasse() {
		return strasse;
	}

	public String getHausnummer() {
		return hausnummer;
	}

	public int getPlz() {
		return plz;
	}

	public String getOrt() {
		return ort;
	}

}
