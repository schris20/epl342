import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JComboBox;


public class Reports extends JPanel {

	/**
	 * Create the panel.
	 */
	public Reports() {
		setLayout(null);
		
		JComboBox cbxReports = new JComboBox();
		cbxReports.setBounds(56, 55, 157, 20);
		add(cbxReports);
		

	}
}
