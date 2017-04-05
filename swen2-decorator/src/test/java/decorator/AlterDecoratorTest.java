package decorator;

import static org.junit.Assert.assertEquals;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class AlterDecoratorTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testDecoratorPattern() {

		DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

		Patient patient = new Patient.PatientBuilder().nachname("Morta").vorname("Lui")
				.adresse("Spielweg", "5a", 78462, "Konstanz").gebDat(new Date()).build();
		Properties properties = new AlterDecorator(new PatientProperties(patient));
		Map<String, String> propMap = properties.getProperties();

		assertEquals("Morta", propMap.get("Nachname"));
		assertEquals("Lui", propMap.get("Vorname"));
		assertEquals(dateFormat.format(new Date()), propMap.get("Geburtsdatum"));
		assertEquals("21.03.1994", propMap.get("Alter"));

	}

}
