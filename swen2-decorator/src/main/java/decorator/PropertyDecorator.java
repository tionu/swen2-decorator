package decorator;

public abstract class PropertyDecorator implements Properties {
	
	protected Properties properties;

	public PropertyDecorator(Properties properties) {
		this.properties = properties;
	}

}
