import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


//public
class Login_Users extends JPanel {

	/**
	 * Create the panel.
	 */
	public Login_Users() {
		setLayout(null);
		
		JButton btnDBA = new JButton("DBA");
		btnDBA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				Login_Screen.Login_no=PanelLogin(1);
			}
		});
		btnDBA.setBounds(181, 88, 89, 23);
		add(btnDBA);
		
		JButton btnManager = new JButton("Manager");
		btnManager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login_Screen.Login_no=PanelLogin(2);
			}
		});
		btnManager.setBounds(181, 139, 89, 23);
		add(btnManager);
		
		JButton btnEmployee = new JButton("Employee");
		btnEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login_Screen.Login_no=PanelLogin(3);			
			}
		});
		btnEmployee.setBounds(181, 192, 89, 23);
		add(btnEmployee);

	}
	
	public  int PanelLogin(int i){	
		Main_Screen.frame.getContentPane().removeAll();		
		JPanel Login = new Login_Screen();
		Main_Screen.frame.getContentPane().add(Login);
		Main_Screen.frame.revalidate();
return i;
}
	

}