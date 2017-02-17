


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class DelVecchioMCSRStudentHelpFrame extends JFrame {

	private JPanel contentPane;
	private final JLabel lblStudentTabHelp = new JLabel("Student Tab Help");
	private final JLabel lblFirstName = new JLabel("First Name:");
	private final JLabel lblMiddleName = new JLabel("Middle Name:");
	private final JLabel lblLastName = new JLabel("Last Name:");
	private final JLabel lblPreferredName = new JLabel("Preferred Name:");
	private final JLabel lblSsn = new JLabel("SSN:");
	private final JLabel lblGender = new JLabel("Gender:");
	private final JLabel lblRace = new JLabel("Race:");
	private final JLabel lblDateOfBirth = new JLabel("Date of Birth:");
	private final JLabel lblGrade = new JLabel("Grade:");
	private final JLabel lblEnterTheStudents = new JLabel("Enter the student's first name.");
	private final JLabel lblEnterTheStudents_1 = new JLabel("Enter the student's middle name.");
	private final JLabel lblEnterTheStudents_2 = new JLabel("Enter the student's last name.");
	private final JLabel lblEnterTheStudents_3 = new JLabel("Enter the student's nickname.");
	private final JLabel lblEnterTheStudents_4 = new JLabel("Enter the student's social security number.");
	private final JLabel lblSelectTheStudents = new JLabel("Select the student's gender. Explain if it is one not listed.");
	private final JLabel lblSelectTheStudents_1 = new JLabel("Select the student's race. Explain if it is one not listed.");
	private final JLabel lblSelectTheStudents_2 = new JLabel("Select the student's birth month, day, and year.");
	private final JLabel lblSelectTheStudents_3 = new JLabel("Select the student's grade.");
	private final JLabel lblBasicInfo = new JLabel("Basic Info");
	private final JLabel lblHousingInfo = new JLabel("Housing Info");
	private final JLabel lblSubdivision = new JLabel("Subdivision:");
	private final JLabel lblLease = new JLabel("Lease:");
	private final JLabel lblAddress = new JLabel("Address:");
	private final JLabel lblHomePhone = new JLabel("Home Phone:");
	private final JLabel lblEnterTheSubdivision = new JLabel("Enter the subdivision you live in.");
	private final JLabel lblIndicateWhetherYou = new JLabel("Indicate whether you own or lease, and lease details if necessary.");
	private final JLabel lblFillInAppropriate = new JLabel("Fill in appropriate address details in proper fields.");
	private final JLabel lblEnterTheStudents_5 = new JLabel("Enter the student's home phone number.");
	private final JLabel lblEmergencyInfo = new JLabel("Emergency Info");
	private final JLabel lblNewLabel = new JLabel("<HTML>Enter at least one emergency contact. <br> Indicate whether you would like your student to appear in the directory. </HTML> ");
	private final JLabel lblGeneral = new JLabel("General:");



	/**
	 * Create the frame.
	 */
	public DelVecchioMCSRStudentHelpFrame() {
		jbInit();
	}
	private void jbInit() {
		setTitle("Student Help");
		setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 513, 622);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblStudentTabHelp.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblStudentTabHelp.setBounds(10, 11, 222, 22);
		
		contentPane.add(lblStudentTabHelp);
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFirstName.setToolTipText("Student's First Name");
		lblFirstName.setForeground(Color.BLACK);
		lblFirstName.setBounds(22, 90, 91, 14);
		
		contentPane.add(lblFirstName);
		lblMiddleName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMiddleName.setToolTipText("Student's Middle Name");
		lblMiddleName.setBounds(22, 115, 103, 14);
		
		contentPane.add(lblMiddleName);
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblLastName.setToolTipText("Student's Last Name");
		lblLastName.setBounds(22, 140, 91, 14);
		
		contentPane.add(lblLastName);
		lblPreferredName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPreferredName.setToolTipText("Student's Preferred Name");
		lblPreferredName.setBounds(22, 165, 118, 14);
		
		contentPane.add(lblPreferredName);
		lblSsn.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSsn.setToolTipText("Student's SSN");
		lblSsn.setBounds(22, 190, 46, 14);
		
		contentPane.add(lblSsn);
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblGender.setToolTipText("Student's Gender");
		lblGender.setBounds(22, 215, 46, 14);
		
		contentPane.add(lblGender);
		lblRace.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRace.setToolTipText("Student's Race");
		lblRace.setBounds(22, 240, 46, 14);
		
		contentPane.add(lblRace);
		lblDateOfBirth.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDateOfBirth.setToolTipText("Student's Date of Birth");
		lblDateOfBirth.setBounds(22, 265, 103, 14);
		
		contentPane.add(lblDateOfBirth);
		lblGrade.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblGrade.setToolTipText("Student's Grade");
		lblGrade.setBounds(22, 290, 65, 14);
		
		contentPane.add(lblGrade);
		lblEnterTheStudents.setBounds(139, 90, 271, 14);
		
		contentPane.add(lblEnterTheStudents);
		lblEnterTheStudents_1.setBounds(139, 115, 271, 14);
		
		contentPane.add(lblEnterTheStudents_1);
		lblEnterTheStudents_2.setBounds(139, 140, 271, 14);
		
		contentPane.add(lblEnterTheStudents_2);
		lblEnterTheStudents_3.setBounds(139, 165, 271, 14);
		
		contentPane.add(lblEnterTheStudents_3);
		lblEnterTheStudents_4.setBounds(139, 190, 271, 14);
		
		contentPane.add(lblEnterTheStudents_4);
		lblSelectTheStudents.setBounds(139, 215, 337, 14);
		
		contentPane.add(lblSelectTheStudents);
		lblSelectTheStudents_1.setBounds(139, 240, 337, 14);
		
		contentPane.add(lblSelectTheStudents_1);
		lblSelectTheStudents_2.setBounds(139, 265, 337, 14);
		
		contentPane.add(lblSelectTheStudents_2);
		lblSelectTheStudents_3.setBounds(139, 290, 287, 14);
		
		contentPane.add(lblSelectTheStudents_3);
		lblBasicInfo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBasicInfo.setBounds(22, 56, 222, 22);
		
		contentPane.add(lblBasicInfo);
		lblHousingInfo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblHousingInfo.setBounds(22, 328, 222, 22);
		
		contentPane.add(lblHousingInfo);
		lblSubdivision.setToolTipText("Subdivision");
		lblSubdivision.setForeground(Color.BLACK);
		lblSubdivision.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSubdivision.setBounds(22, 361, 103, 14);
		
		contentPane.add(lblSubdivision);
		lblLease.setToolTipText("Lease");
		lblLease.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblLease.setBounds(22, 386, 103, 14);
		
		contentPane.add(lblLease);
		lblAddress.setToolTipText("Student's Preferred Name");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAddress.setBounds(22, 411, 118, 14);
		
		contentPane.add(lblAddress);
		lblHomePhone.setToolTipText("Home Phone");
		lblHomePhone.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblHomePhone.setBounds(22, 436, 91, 14);
		
		contentPane.add(lblHomePhone);
		lblEnterTheSubdivision.setBounds(139, 361, 271, 14);
		
		contentPane.add(lblEnterTheSubdivision);
		lblIndicateWhetherYou.setBounds(139, 386, 348, 14);
		
		contentPane.add(lblIndicateWhetherYou);
		lblFillInAppropriate.setBounds(139, 411, 348, 14);
		
		contentPane.add(lblFillInAppropriate);
		lblEnterTheStudents_5.setBounds(139, 436, 348, 14);
		
		contentPane.add(lblEnterTheStudents_5);
		lblEmergencyInfo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEmergencyInfo.setBounds(22, 471, 222, 22);
		
		contentPane.add(lblEmergencyInfo);
		lblNewLabel.setBounds(140, 500, 320, 51);
		
		contentPane.add(lblNewLabel);
		lblGeneral.setToolTipText("Lease");
		lblGeneral.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblGeneral.setBounds(22, 504, 103, 14);
		
		contentPane.add(lblGeneral);
	}
}
