import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Manage_Manager extends JPanel {

	/**
	 * Create the panel.
	 */
	public Manage_Manager() {
		setLayout(null);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelAddManager();
			}
		});
		btnAdd.setBounds(176, 91, 89, 23);
		add(btnAdd);
		
		JButton btnEdit = new JButton("Edit/Delete");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelRemoveEditManager();
			}
		});
		
		btnEdit.setBounds(176, 139, 89, 23);
		add(btnEdit);
		
			
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PanelDBA();
			}
		});
		btnBack.setBounds(95, 247, 89, 23);
		add(btnBack);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PanelUsers();
			}
		});
		btnHome.setBounds(306, 247, 89, 23);
		add(btnHome);

	}
	
	public void PanelUsers() {
		Main_Screen.frame.getContentPane().removeAll();
		JPanel Users = new Login_Users();
		Main_Screen.frame.getContentPane().add(Users);
		Main_Screen.frame.revalidate();
	}
	
	public void PanelDBA() {
		Main_Screen.frame.getContentPane().removeAll();
		JPanel PanDBA = new DBA();
		Main_Screen.frame.getContentPane().add(PanDBA);
		Main_Screen.frame.revalidate();
	}
	
	public void PanelAddManager() {
		Main_Screen.frame.getContentPane().removeAll();
		JPanel add = new AddEdit_Manager();
		Main_Screen.frame.getContentPane().add(add);
		Main_Screen.frame.revalidate();
	}
	
	public void PanelRemoveEditManager() {
		Main_Screen.frame.getContentPane().removeAll();
		JPanel remove = new RemoveEditManager();
		Main_Screen.frame.getContentPane().add(remove);
		Main_Screen.frame.revalidate();

	}
}
