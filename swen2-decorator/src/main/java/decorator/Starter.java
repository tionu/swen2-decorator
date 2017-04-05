package decorator;

import java.util.Date;

public class Starter {

	public static void main(String[] args) {
		Patient patient = new Patient.PatientBuilder().nachname("Morta").vorname("Lui")
				.adresse("Spielweg", "5a", 78462, "Konstanz").gebDat(new Date()).build();
		Properties properties = new AlterDecorator(new PatientProperties(patient));

		PropertyViewer propertyViewer = new PropertyViewer(properties);

		propertyViewer.show();

	}

}
