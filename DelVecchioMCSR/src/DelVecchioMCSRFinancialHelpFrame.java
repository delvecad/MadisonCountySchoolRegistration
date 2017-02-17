import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JLabel;
import java.awt.Font;

public class DelVecchioMCSRFinancialHelpFrame extends JFrame {

	private JPanel contentPane;
	private final JLabel lblRelationships = new JLabel("Relationships");
	private final JLabel lblMonthlyIncomeOf = new JLabel("Monthly Income of Household");
	private final JLabel lblMonthlyExpensesOf = new JLabel("Monthly Expenses of Household");
	private final JLabel lblName = new JLabel("Name:");
	private final JLabel lblRelationship = new JLabel("Relationship:");
	private final JLabel lblAge = new JLabel("Age:");
	private final JLabel lblSsn = new JLabel("SSN:");
	private final JLabel lblNewLabel = new JLabel("Enter the full name of the person.");
	private final JLabel lblSelectARelationship = new JLabel("Select a relationship from the dropdown menu\r\n.");
	private final JLabel lblSelectAnAge = new JLabel("Select an age from the dropdown menu.\r\n");
	private final JLabel lblEnterASocial = new JLabel("<HTML>Enter a social security number. It will be automatically <br> formatted.</HTML>");
	private final JLabel lblforEachField = new JLabel("<HTML>For each field, enter the appropriate value. It will be <br> automatically formatted.</HTML>");
	private final JLabel lblFields = new JLabel("Fields:");
	private final JLabel label = new JLabel("Fields:");
	private final JLabel label_1 = new JLabel("<HTML>For each field, enter the appropriate value. It will be <br> automatically formatted.</HTML>");
	private final JLabel lblFinancialTabHelp = new JLabel("Financial Tab Help");

	/**
	 * Create the frame.
	 */
	public DelVecchioMCSRFinancialHelpFrame() {
		jbInit();
	}
	private void jbInit() {
		setTitle("Financial Help");
		setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblRelationships.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRelationships.setBounds(37, 55, 137, 31);
		
		contentPane.add(lblRelationships);
		lblMonthlyIncomeOf.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMonthlyIncomeOf.setBounds(37, 204, 267, 31);
		
		contentPane.add(lblMonthlyIncomeOf);
		lblMonthlyExpensesOf.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMonthlyExpensesOf.setBounds(37, 281, 267, 31);
		
		contentPane.add(lblMonthlyExpensesOf);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblName.setBounds(47, 86, 69, 14);
		
		contentPane.add(lblName);
		lblRelationship.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRelationship.setBounds(47, 111, 104, 14);
		
		contentPane.add(lblRelationship);
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAge.setBounds(47, 137, 46, 14);
		
		contentPane.add(lblAge);
		lblSsn.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSsn.setBounds(47, 162, 46, 14);
		
		contentPane.add(lblSsn);
		lblNewLabel.setBounds(153, 86, 199, 14);
		
		contentPane.add(lblNewLabel);
		lblSelectARelationship.setBounds(153, 111, 239, 14);
		
		contentPane.add(lblSelectARelationship);
		lblSelectAnAge.setBounds(153, 137, 199, 14);
		
		contentPane.add(lblSelectAnAge);
		lblEnterASocial.setBounds(153, 162, 271, 44);
		
		contentPane.add(lblEnterASocial);
		lblforEachField.setBounds(153, 235, 271, 49);
		
		contentPane.add(lblforEachField);
		lblFields.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFields.setBounds(47, 235, 57, 14);
		
		contentPane.add(lblFields);
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBounds(47, 314, 57, 14);
		
		contentPane.add(label);
		label_1.setBounds(153, 306, 271, 44);
		
		contentPane.add(label_1);
		lblFinancialTabHelp.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFinancialTabHelp.setBounds(10, 22, 222, 22);
		
		contentPane.add(lblFinancialTabHelp);
	}

}
