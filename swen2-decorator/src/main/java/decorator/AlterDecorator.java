package decorator;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class AlterDecorator extends PropertyDecorator {

	private static final DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyy");

	public AlterDecorator(Properties properties) {
		super(properties);
	}

	@Override
	public Map<String, String> getProperties() {
		Date birthday = null;
		try {
			birthday = dateFormat.parse(properties.getProperties().get("Geburtsdatum"));
		} catch (ParseException ignored) {
		}
		if (birthday == null) {
			throw new IllegalArgumentException("\"Geburtsdatum\" not present in properties.");
		}

		Map<String, String> addProperty = properties.getProperties();
		addProperty.put("Alter", String.valueOf(getDiffYears(birthday)));
		return addProperty;
	}
	
	private int getDiffYears(Date date){
	    DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
	    int past = Integer.parseInt(formatter.format(date));
	    int now = Integer.parseInt(formatter.format(new Date()));
	    return (now-past)/10000;
	}

}
