package decorator;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Starter {
	private static final DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyy");

	public static void main(String[] args) throws ParseException {

		Patient patient = new Patient.PatientBuilder().nachname("Morta").vorname("Lui")
				.adresse("Spielweg", "5a", 78462, "Konstanz").gebDat(dateFormat.parse("21.04.1992")).build();
		Properties properties = new AlterDecorator(new PatientProperties(patient));

		PropertyViewer propertyViewer = new PropertyViewer(properties);

		propertyViewer.show();

	}

}
