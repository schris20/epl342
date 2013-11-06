import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class AddEditStore extends JPanel {
	private JTextField txtName;
	private JTextField txtAddress;
	private JTextField N_Empl;

	/**
	 * Create the panel.
	 */
	public AddEditStore() {
		setLayout(null);
		
		txtName = new JTextField();
		txtName.setBounds(251, 53, 86, 20);
		add(txtName);
		txtName.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(78, 56, 46, 14);
		add(lblName);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(78, 101, 46, 14);
		add(lblAddress);
		
		txtAddress = new JTextField();
		txtAddress.setBounds(251, 98, 86, 20);
		add(txtAddress);
		txtAddress.setColumns(10);
		
		JLabel lblManager = new JLabel("Manager");
		lblManager.setBounds(78, 142, 46, 14);
		add(lblManager);
		
		JComboBox cbxManager = new JComboBox();
		cbxManager.setBounds(251, 139, 86, 20);
		add(cbxManager);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelStore();
			}
		});
		btnBack.setBounds(71, 266, 89, 23);
		add(btnBack);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			clear();
			}
		});
		btnSave.setBounds(248, 266, 89, 23);
		add(btnSave);
		
		N_Empl = new JTextField();
		N_Empl.setBounds(251, 186, 86, 20);
		add(N_Empl);
		N_Empl.setColumns(10);
		
		JLabel lblNoEmployees = new JLabel("No. Employees");
		lblNoEmployees.setBounds(78, 189, 82, 14);
		add(lblNoEmployees);

	}
	public void PanelStore() {
		Main_Screen.frame.getContentPane().removeAll();
		JPanel store = new Store();
		Main_Screen.frame.getContentPane().add(store);
		Main_Screen.frame.revalidate();
	}
	public void clear() {
		txtName.setText("");
		txtAddress.setText("");
		N_Empl.setText("");
	}
}
