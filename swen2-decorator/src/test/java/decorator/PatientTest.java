package decorator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PatientTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testBuilderPattern() {
		Patient patient = new Patient.PatientBuilder().nachname("Morta").vorname("Lui")
				.adresse("Spielweg", "5a", 78462, "Konstanz").build();

		assertEquals("Morta", patient.getNachname());
		assertEquals("Lui", patient.getVorname());
		assertEquals("Spielweg", patient.getStrasse());
		assertEquals("5a", patient.getHausnummer());
		assertEquals(78462, patient.getPlz());
		assertEquals("Konstanz", patient.getOrt());
	}

}
