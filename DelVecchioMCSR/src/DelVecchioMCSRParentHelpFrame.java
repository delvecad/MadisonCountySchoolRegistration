import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class DelVecchioMCSRParentHelpFrame extends JFrame {

	private JPanel contentPane;
	private final JLabel lblParentTabHelp = new JLabel("Parent Tab Help");
	private final JLabel lblParentInfo = new JLabel("Parent Info");
	private final JLabel lblName = new JLabel("Name:");
	private final JLabel lblPhone = new JLabel("Phone:");
	private final JLabel lblAddress = new JLabel("Address:");
	private final JLabel lblAdditional = new JLabel("Additional:");
	private final JLabel lblEnterTheParents = new JLabel("Enter the parent's name. Middle initial will be formatted.");
	private final JLabel lblEnterTheParents_1 = new JLabel("Enter the parent's phone numbers. They will be formatted.");
	private final JLabel lblEnterTheParents_2 = new JLabel("Enter the parent's address if different from student's.");
	private final JLabel lblEnterTheParents_3 = new JLabel("Enter the parent's work info and email address.");
	private final JLabel lblSiblingInfo = new JLabel("Sibling Info");
	private final JLabel lblName_1 = new JLabel("Name:");
	private final JLabel lblDateOfBirth = new JLabel("Date of Birth:");
	private final JLabel lblGrade = new JLabel("Grade:");
	private final JLabel lblSchool = new JLabel("School:");
	private final JLabel lblEnterEachSiblings = new JLabel("Enter each sibling's name.");
	private final JLabel lblSelectEachSiblings = new JLabel("Select each sibling's date of birth.");
	private final JLabel lblSelectEachSiblings_1 = new JLabel("Select each sibling's grade.");
	private final JLabel lblEnterEachSiblings_1 = new JLabel("Enter each sibling's school.");


	/**
	 * Create the frame.
	 */
	public DelVecchioMCSRParentHelpFrame() {
		jbInit();
	}
	private void jbInit() {
		setTitle("Parent Help");
		setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 509, 398);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblParentTabHelp.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblParentTabHelp.setBounds(10, 11, 222, 22);
		
		contentPane.add(lblParentTabHelp);
		lblParentInfo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblParentInfo.setBounds(22, 56, 222, 22);
		
		contentPane.add(lblParentInfo);
		lblName.setToolTipText("Name Info");
		lblName.setForeground(Color.BLACK);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblName.setBounds(22, 90, 91, 14);
		
		contentPane.add(lblName);
		lblPhone.setToolTipText("Phone Info");
		lblPhone.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPhone.setBounds(22, 115, 103, 14);
		
		contentPane.add(lblPhone);
		lblAddress.setToolTipText("Address Info");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAddress.setBounds(22, 140, 91, 14);
		
		contentPane.add(lblAddress);
		lblAdditional.setToolTipText("Additional Info");
		lblAdditional.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAdditional.setBounds(22, 165, 118, 14);
		
		contentPane.add(lblAdditional);
		lblEnterTheParents.setBounds(147, 89, 309, 14);
		
		contentPane.add(lblEnterTheParents);
		lblEnterTheParents_1.setBounds(147, 115, 312, 14);
		
		contentPane.add(lblEnterTheParents_1);
		lblEnterTheParents_2.setBounds(147, 140, 312, 14);
		
		contentPane.add(lblEnterTheParents_2);
		lblEnterTheParents_3.setBounds(147, 165, 312, 14);
		
		contentPane.add(lblEnterTheParents_3);
		lblSiblingInfo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSiblingInfo.setBounds(22, 198, 222, 22);
		
		contentPane.add(lblSiblingInfo);
		lblName_1.setToolTipText("Name Info");
		lblName_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblName_1.setBounds(22, 235, 64, 14);
		
		contentPane.add(lblName_1);
		lblDateOfBirth.setToolTipText("Birth Date Info");
		lblDateOfBirth.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDateOfBirth.setBounds(22, 260, 84, 14);
		
		contentPane.add(lblDateOfBirth);
		lblGrade.setToolTipText("Grade Info");
		lblGrade.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblGrade.setBounds(22, 285, 64, 14);
		
		contentPane.add(lblGrade);
		lblSchool.setToolTipText("School Info");
		lblSchool.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSchool.setBounds(22, 310, 64, 14);
		
		contentPane.add(lblSchool);
		lblEnterEachSiblings.setBounds(147, 235, 309, 14);
		
		contentPane.add(lblEnterEachSiblings);
		lblSelectEachSiblings.setBounds(147, 260, 309, 14);
		
		contentPane.add(lblSelectEachSiblings);
		lblSelectEachSiblings_1.setBounds(147, 285, 309, 14);
		
		contentPane.add(lblSelectEachSiblings_1);
		lblEnterEachSiblings_1.setBounds(147, 310, 309, 14);
		
		contentPane.add(lblEnterEachSiblings_1);
	}

}
