package decorator;

import java.util.Date;

public class Patient {

	private int id;
	private String nachname;
	private String vorname;
	private Date gebDat;

	public Patient(int id, String nachname, String vorname, Date gebDat) {
		this.id = id;
		this.nachname = nachname;
		this.vorname = vorname;
		this.gebDat = gebDat;
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

}
