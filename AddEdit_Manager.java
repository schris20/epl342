import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddEdit_Manager extends JPanel {
	private JTextField txtUsername;
	private JTextField textPassword;
	private JTextField txtComfirm;

	/**
	 * Create the panel.
	 */
	public AddEdit_Manager() {
		setLayout(null);

		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(58, 83, 67, 14);
		add(lblUsername);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(58, 131, 46, 14);
		add(lblPassword);

		txtUsername = new JTextField();
		txtUsername.setBounds(201, 80, 86, 20);
		add(txtUsername);
		txtUsername.setColumns(10);

		JLabel lblComfirm = new JLabel("Comfirm");
		lblComfirm.setBounds(58, 181, 46, 14);
		add(lblComfirm);

		textPassword = new JTextField();
		textPassword.setBounds(201, 128, 86, 20);
		add(textPassword);
		textPassword.setColumns(10);

		txtComfirm = new JTextField();
		txtComfirm.setBounds(201, 178, 86, 20);
		add(txtComfirm);
		txtComfirm.setColumns(10);

		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelManage_Manager();
			}
		});
		btnBack.setBounds(41, 243, 89, 23);
		add(btnBack);

		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUsername.getText();
				textPassword.getText();
				txtComfirm.getText();
				clear();

			}
		});
		btnSave.setBounds(220, 243, 89, 23);
		add(btnSave);

	}

	public void clear() {
		txtUsername.setText("");
		textPassword.setText("");
		txtComfirm.setText("");
	}
	public void PanelManage_Manager() {
		Main_Screen.frame.getContentPane().removeAll();
		JPanel Manage = new Manage_Manager();
		Main_Screen.frame.getContentPane().add(Manage);
		Main_Screen.frame.revalidate();
	}
}
