import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class RemoveEditManager extends JPanel {

	/**
	 * Create the panel.
	 */
	public RemoveEditManager() {
		setLayout(null);
		
		JList list = new JList();
		list.setBounds(81, 44, 240, 183);
		add(list);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelManage_Manager();
			}
		});
		btnBack.setBounds(84, 253, 89, 23);
		add(btnBack);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnEdit.setBounds(351, 78, 89, 23);
		add(btnEdit);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnDelete.setBounds(351, 128, 89, 23);
		add(btnDelete);

	}
	
	public void PanelManage_Manager() {
		Main_Screen.frame.getContentPane().removeAll();
		JPanel Manage = new Manage_Manager();
		Main_Screen.frame.getContentPane().add(Manage);
		Main_Screen.frame.revalidate();
	}
}
