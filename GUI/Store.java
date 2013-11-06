import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Store extends JPanel {

	/**
	 * Create the panel.
	 */
	public Store() {
		setLayout(null);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelAdd();
			}
		});
		btnAdd.setBounds(150, 61, 89, 23);
		add(btnAdd);
		
		JButton btnEdit = new JButton("Edit/Delete");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelRemoveEditStore();
			}
		});
		btnEdit.setBounds(150, 109, 89, 23);
		add(btnEdit);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelDBA();
			}
		});
		btnBack.setBounds(69, 217, 89, 23);
		add(btnBack);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelUsers();
			}
		});
		btnHome.setBounds(280, 217, 89, 23);
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
	
	public void PanelAdd() {
		Main_Screen.frame.getContentPane().removeAll();
		JPanel add = new AddEditStore();
		Main_Screen.frame.getContentPane().add(add);
		Main_Screen.frame.revalidate();
	}
	public void PanelRemoveEditStore(){
		Main_Screen.frame.getContentPane().removeAll();
		JPanel store = new RemoveEditStore();
		Main_Screen.frame.getContentPane().add(store);
		Main_Screen.frame.revalidate();
		
		
	}
	
}
