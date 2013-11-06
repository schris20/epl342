import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Employee extends JPanel {

	/**
	 * Create the panel.
	 */
	public Employee() {
		setLayout(null);
		
		JButton btnClient = new JButton("Client");
		btnClient.setBounds(47, 115, 89, 23);
		add(btnClient);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelUsers();
			}
		});
		btnBack.setBounds(47, 250, 89, 23);
		add(btnBack);
		
		JButton btnInvoice = new JButton("Invoice");
		btnInvoice.setBounds(47, 171, 89, 23);
		add(btnInvoice);

	}
	
	public void PanelUsers() {
		Main_Screen.frame.getContentPane().removeAll();
		JPanel Users = new Login_Users();
		Main_Screen.frame.getContentPane().add(Users);
		Main_Screen.frame.revalidate();
	}
}
