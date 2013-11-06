import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.TitledBorder;


public class Manager extends JPanel {

	/**
	 * Create the panel.
	 */
	public Manager() {
		
		JButton btnReports = new JButton("Reports");
		btnReports.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnReports.setBounds(292, 149, 89, 23);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(42, 255, 89, 23);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelUsers();
			}
		});
		
		JButton btnProducts = new JButton("Products");
		btnProducts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnProducts.setBounds(54, 149, 125, 23);
		setLayout(null);
		add(btnReports);
		add(btnBack);
		add(btnProducts);
		
		JPanel Panel = new JPanel();
		Panel.setToolTipText("");
		Panel.setBounds(23, 38, 197, 195);
		add(Panel);
		Panel.setBorder(new TitledBorder(null, "Manage ",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		Panel.setLayout(null);
		
		JButton btnOffer = new JButton("Offer");
		btnOffer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnOffer.setBounds(10, 21, 89, 23);
		Panel.add(btnOffer);
		
		JButton btnEmployees = new JButton("Employees");
		btnEmployees.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEmployees.setBounds(104, 21, 83, 23);
		Panel.add(btnEmployees);
		
		JButton btnCategory = new JButton("Category");
		btnCategory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCategory.setBounds(104, 66, 83, 23);
		Panel.add(btnCategory);
		
		JButton btnSupliers = new JButton("Supliers");
		btnSupliers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSupliers.setBounds(10, 66, 89, 23);
		Panel.add(btnSupliers);
		
		JButton btnInvoice = new JButton("Invoice");
		btnInvoice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnInvoice.setBounds(292, 93, 89, 23);
		add(btnInvoice);

	}
	
	public void PanelUsers() {
		Main_Screen.frame.getContentPane().removeAll();
		JPanel Users = new Login_Users();
		Main_Screen.frame.getContentPane().add(Users);
		Main_Screen.frame.revalidate();
	}
}
