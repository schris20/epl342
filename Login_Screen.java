import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Login_Screen extends JPanel  {
	private JTextField txtUsername;
	private JTextField txtPass;
	protected static int Login_no=0;
	/**
	 * Create the panel.
	 */
	public Login_Screen() {
		setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setText("Username");
		txtUsername.setBounds(181, 98, 86, 20);
		add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPass = new JTextField();
		txtPass.setText("Password");
		txtPass.setBounds(181, 138, 86, 20);
		add(txtPass);
		txtPass.setColumns(10);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			PanelUsers();
			}
		});
		btnBack.setBounds(116, 203, 89, 23);
		add(btnBack);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main_Screen.frame.getContentPane().removeAll();
				if(Login_no==1){
					DBA_Login();
				}
				else if(Login_no==2){
					Manager_Login();
				}
				else if(Login_no==3){
					Employee_Login();
				}
			}
		});
		btnLogin.setBounds(249, 203, 89, 23);
		add(btnLogin);

	}
	public void PanelUsers(){
		Main_Screen.frame.getContentPane().removeAll();
		JPanel Users = new Login_Users();
		Main_Screen.frame.getContentPane().add(Users);
		Main_Screen.frame.revalidate();
	}
	public void DBA_Login(){
		JPanel DBA_Log = new DBA();
		Main_Screen.frame.getContentPane().add(DBA_Log);
		Main_Screen.frame.revalidate();
	}
	public void Employee_Login(){
		JPanel Employee_Log = new Employee();
		Main_Screen.frame.getContentPane().add(Employee_Log);
		Main_Screen.frame.revalidate();
	}
	public void Manager_Login(){
		JPanel Manager_Log = new Manager();
		Main_Screen.frame.getContentPane().add(Manager_Log);
		Main_Screen.frame.revalidate();
	}
}
