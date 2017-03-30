package decorator;

import java.awt.ScrollPane;
import java.util.Map.Entry;

import javax.swing.JFrame;
import javax.swing.JTable;

public class PropertyViewer {
	
	private static final int KEY_COLUMN_INDEX = 0;
	private static final int VALUE_COLUMN_INDEX = 1;

	private Properties properties;
	
	public PropertyViewer(Properties properties) {
		this.properties = properties;
	}
	
	public void show() {
		JFrame frame = new JFrame("Properties");
		ScrollPane panel = new ScrollPane();
		JTable propertyTable = new JTable(properties.getProperties().size(), 2);
		int rowIndex = 0;
		for(Entry<String, String> entry : properties.getProperties().entrySet()) {
			propertyTable.getModel().setValueAt(entry.getKey(), rowIndex, KEY_COLUMN_INDEX);
			propertyTable.getModel().setValueAt(entry.getValue(), rowIndex, VALUE_COLUMN_INDEX);
			rowIndex++;
		}
		panel.add(propertyTable);
		frame.add(panel);
		frame.setSize(200, 400);
		frame.setVisible(true);
	}

}
