package decorator;

import java.util.Map;

public class AlterDecorator extends PropertyDecorator {

	public AlterDecorator(Properties properties) {
		super(properties);
	}

	@Override
	public Map<String, String> getProperties() {
		Map<String, String> addProperty = properties.getProperties();
		addProperty.put("Alter", "21.03.1994");
		return addProperty;
	}

}
