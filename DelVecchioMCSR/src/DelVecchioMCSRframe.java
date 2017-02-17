import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.beans.PropertyChangeListener;
import java.text.NumberFormat;
import java.beans.PropertyChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JCheckBox;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.border.LineBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ButtonGroup;

public class DelVecchioMCSRframe extends JFrame {
	
	//autofill parent address if same as student's
	
	//content pane
	private JPanel contentPane;
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private final JPanel studentPanel = new JPanel();
	private final JPanel parentPanel = new JPanel();
	
	//formatters
	NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();
	double defaultMoney = 0.0;
	
	//menu
	private final JMenuBar menuBar = new JMenuBar();
	private final JMenu mnFile = new JMenu("File");
	private final JMenuItem mntmStartNewForm = new JMenuItem("Start New Form");
	private final JMenuItem mntmExit = new JMenuItem("Exit");
	private final JMenu mnHelp = new JMenu("Help");
	private final JMenuItem mntmStudentIHelp = new JMenuItem("Student Help");
	
	//student panel
	private final JLabel lblChildFirstName = new JLabel("First Name*");
	private final JLabel lblChildMiddleName = new JLabel("Middle Name");
	private final JLabel lblChildLastName = new JLabel("Last Name*");
	private final JLabel lblChildPreferredName = new JLabel("Preferred Name");
	private final JLabel lblChildSsn = new JLabel("SSN*");
	private final JLabel lblChildRace = new JLabel("Race*");
	private final JComboBox raceComboBox = new JComboBox();
	private final JTextField otherRaceTF = new JTextField();
	private final JTextField childFirstNameTF = new JTextField();
	private final JTextField childMiddleNameTF = new JTextField();
	private final JTextField childLastNameTF = new JTextField();
	private final JTextField childPreferredNameTF = new JTextField();
	private final JLabel lblChildGender = new JLabel("Gender*");
	private final JComboBox genderComboBox = new JComboBox();
	private final JTextField otherGenderTF = new JTextField();
	private final JLabel lblChildDateOfBirth = new JLabel("Date of Birth*");
	private final JComboBox monthComboBox = new JComboBox();
	private final JComboBox dayComboBox = new JComboBox();
	private final JComboBox yearComboBox = new JComboBox();
	private final JLabel lblStudentInstructions = new JLabel("Please fill in the necessary information about your child.");
	private final JLabel lblStudentHeading = new JLabel("Student Information");
	private final JLabel lblSubdivision = new JLabel("Subdivision*");
	private final JTextField subdivisionTF = new JTextField();
	private final JLabel lblHousingHeading = new JLabel("Housing Information\r\n");
	private final JComboBox ownershipComboBox = new JComboBox();
	private final JLabel lblLeaseExpirationDate = new JLabel("Lease Expires*");
	private final JComboBox leaseMonthComboBox = new JComboBox();
	private final JComboBox LeaseDayComboBox = new JComboBox();
	private final JComboBox LeaseYearComboBox = new JComboBox();
	private final JLabel lblChildGrade = new JLabel("Grade*");
	private final JComboBox gradeComboBox = new JComboBox();
	private final JLabel lblStreetAddress = new JLabel("Street Address*");
	private final JTextField childStreetTF = new JTextField();
	private final JLabel lblCity = new JLabel("City*");
	private final JTextField childCityTF = new JTextField();
	private final JLabel lblZip = new JLabel("Zip*");
	private final JLabel lblHomePhone = new JLabel("Home Phone*");
	private final JFormattedTextField childHomePhoneFTF = new JFormattedTextField();
	private final JLabel lblTextAreaInstructions = new JLabel("<HTML>Please tell us about your child's personality, learning styles, <br> social skills, and academic strengths </HTML>");
	private final JTextArea childTextArea = new JTextArea();
	
	//parent panel
	//mother section
	private final JLabel lblParentHeading = new JLabel("Parent Information");
	private final JLabel lblMotherHeading = new JLabel("Mother/Guardian 1");
	private final JLabel lblMotherFirstName = new JLabel("First Name*");
	private final JLabel lblMiddleInitial = new JLabel("Middle Initial*");
	private final JTextField motherFirstNameTF = new JTextField();
	private final JLabel lblMotherLastName = new JLabel("Last Name*");
	private final JTextField MotherLastNameTF = new JTextField();
	private final JLabel lblMotherHomePhone = new JLabel("Home Phone*");
	private final JLabel lblMotherWorkPhone = new JLabel("Work Phone");
	private final JLabel lblMotherCell = new JLabel("Cell Phone");
	private final JLabel lblNewLabel = new JLabel("Address (if different from child's)");
	private final JTextField motherAddressTF = new JTextField();
	private final JLabel lblMotherEmployment = new JLabel("Place of Employment");
	private final JTextField motherEmploymentTF = new JTextField();
	private final JLabel lblMotherOccupation = new JLabel("Occupation");
	private final JTextField motherOccupationTF = new JTextField();
	private final JLabel lblMotherEmail = new JLabel("Email*");
	private final JTextField MotherEmailTF = new JTextField();
	private final JFormattedTextField childssnFTF = new JFormattedTextField();
	private final JFormattedTextField childZipFTF = new JFormattedTextField();
	private final JFormattedTextField motherMiddleInitialFTF = new JFormattedTextField();
	private final JFormattedTextField motherHomePhoneFTF = new JFormattedTextField();
	private final JFormattedTextField motherWorkPhoneFTF = new JFormattedTextField();
	private final JFormattedTextField motherCellPhoneFTF = new JFormattedTextField();
	
	//father section
	private final JLabel lblFatherHeading = new JLabel("Father/Guardian 2");
	private final JLabel lblFatherFirstName = new JLabel("First Name");
	private final JTextField fatherFirstNameTF = new JTextField();
	private final JLabel lblFatherMiddleInitial = new JLabel("Middle Initial");
	private final JLabel lblFatherLastName = new JLabel("Last Name");
	private final JTextField fatherLastNameTF = new JTextField();
	private final JLabel lblFatherHomePhone = new JLabel("Home Phone");
	private final JLabel lblFatherWorkPhone = new JLabel("Work Phone");
	private final JLabel lblFatherCellPhone = new JLabel("Cell Phone");
	private final JLabel lblFatherAddress = new JLabel("Address (if different from child's)");
	private final JTextField fatherAddressTF = new JTextField();
	private final JLabel lblFatherEmployment = new JLabel("Place of Employment");
	private final JTextField fatherEmploymentTF = new JTextField();
	private final JLabel lblFatherOccupation = new JLabel("Occupation");
	private final JTextField fatherOccupationTF = new JTextField();
	private final JLabel lblFatherEmail = new JLabel("Email");
	private final JTextField fatherEmailTF = new JTextField();
	private final JFormattedTextField fatherMiddleInitialFTF = new JFormattedTextField();
	private final JFormattedTextField fatherHomePhoneFTF = new JFormattedTextField();
	private final JFormattedTextField fatherWorkPhoneFTF = new JFormattedTextField();
	private final JFormattedTextField fatherCellPhoneFTF = new JFormattedTextField();
	
	//child's realation section
	private final JPanel financialPanel = new JPanel();
	private final JLabel lblChildRelation = new JLabel("Child's Relation");
	private final JLabel lblChildLivesWith = new JLabel("Child Lives With*");
	private final JCheckBox chckbxMother = new JCheckBox("Mother");
	private final JCheckBox chckbxFather = new JCheckBox("Father");
	private final JCheckBox chckbxOther = new JCheckBox("Other");
	private final JTextField checkOtherTF = new JTextField();
	
	//Formatted Text Field Formatters
	MaskFormatter numMaskSSN = createFormatter("###-##-####");
	MaskFormatter numMaskPhone = createFormatter("(###) ###-####");
	MaskFormatter charMaskState = createFormatter("UU");
	MaskFormatter numMaskZip = createFormatter("#####");
	MaskFormatter charMaskMiddleInitial = createFormatter("U");
	
	//Financial panel
	private final JLabel lblRelation1 = new JLabel("Relation 1");
	private final JLabel lblRel1Name = new JLabel("Name");
	private final JLabel lblRel1Relationship = new JLabel("Relationship");
	private final JLabel lblRel1Age = new JLabel("Age");
	private final JLabel lblRel1Ssn = new JLabel("SSN");
	private final JTextField rel1NameTF = new JTextField();
	private final JTextField rel1Ssn = new JTextField();
	private final JTextField rel2Ssn = new JTextField();
	private final JLabel lblRel2Ssn = new JLabel("SSN");
	private final JLabel lblRel2Age = new JLabel("Age");
	private final JLabel lblRel2Relationship = new JLabel("Relationship");
	private final JTextField rel2NameTF = new JTextField();
	private final JLabel lblRel2Name = new JLabel("Name");
	private final JLabel lblRelation2 = new JLabel("Relation 2");
	private final JTextField rel3Ssn = new JTextField();
	private final JLabel lblRel3Ssn = new JLabel("SSN");
	private final JLabel lblRel3Age = new JLabel("Age");
	private final JLabel lblRel3Relationship = new JLabel("Relationship");
	private final JTextField rel3NameTF = new JTextField();
	private final JLabel lblRel3Name = new JLabel("Name");
	private final JLabel lblRelation3 = new JLabel("Relation 3");
	private final JTextField rel4Ssn = new JTextField();
	private final JLabel lblRel4Ssn = new JLabel("SSN");
	private final JLabel lblRel4Age = new JLabel("Age");
	private final JLabel lblRel4Relationship = new JLabel("Relationship");
	private final JTextField rel4NameTF = new JTextField();
	private final JLabel lblRel4Name = new JLabel("Name");
	private final JLabel lblRelation4 = new JLabel("Relation 4");
	private final JComboBox rel1RelationshipComboBox = new JComboBox();
	private final JComboBox rel2RelationshipComboBox = new JComboBox();
	private final JComboBox rel3RelationshipComboBox = new JComboBox();
	private final JComboBox rel4RelationshipComboBox = new JComboBox();
	private final JLabel lblFinancialHeading = new JLabel("Financial Information (Only if Requesting Free/Reduced Lunch)");
	private final JLabel lblRelationships = new JLabel("Relationships");
	private final JLabel lblNewLabel_1 = new JLabel("List anyone in your household, other than your spouse");
	private final JLabel lblIncome = new JLabel("Monthly Income of Houselhold");
	private final JLabel lblExpenses = new JLabel("Monthly Expenses of Household");
	private final JLabel lblSalary = new JLabel("Salary");
	private final JLabel lblSocialSecurity = new JLabel("Social Security");
	private final JLabel lblUtilityAssistance = new JLabel("Utility Assistance");
	private final JLabel lblUnemployment = new JLabel("Unemployment");
	private final JLabel lblDisability = new JLabel("Disability");
	private final JLabel lblFoodStamps = new JLabel("Food Stamps");
	private final JLabel lblTanf = new JLabel("TANF/AFDC");
	private final JLabel lblChildSupport = new JLabel("Child Support");
	private final JLabel lblIncomeOther = new JLabel("Other");
	private final JLabel lblRent = new JLabel("Rent");
	private final JLabel lblLightBill = new JLabel("Light Bill");
	private final JLabel lblPhoneBill = new JLabel("Phone Bill");
	private final JLabel lblCableTv = new JLabel("Cable TV");
	private final JLabel lblCarPayment = new JLabel("Car Payment");
	private final JLabel lblDoctor = new JLabel("Doctor/Med");
	private final JLabel lblGas = new JLabel("Gas/Water");
	private final JLabel lblFurn = new JLabel("Furn/Appliances");
	private final JLabel lblExpensesOther = new JLabel("Other");
	private final JLabel lblIncomeTotal = new JLabel("Total:");
	private final JLabel lblExpensesTotal = new JLabel("Total:");
	private final JLabel lblNetIncome = new JLabel("Net Income:");
	private final JLabel lblSiblings = new JLabel("Siblings");
	private final JLabel lblSibling = new JLabel("Sibling 1");
	private final JLabel label_1 = new JLabel("Sibling 1");
	private final JLabel label_2 = new JLabel("Sibling 1");
	private final JLabel lblSib1Name = new JLabel("Name");
	private final JLabel lblSib1DoB = new JLabel("Date of Birth");
	private final JLabel lblSib1Grade = new JLabel("Grade");
	private final JLabel lblSib1School = new JLabel("School");
	private final JTextField sib1NameTF = new JTextField();
	private final JTextField sib1SchoolTF = new JTextField();
	private final JComboBox sib1MonthComboBox = new JComboBox();
	private final JComboBox sib1DayComboBox = new JComboBox();
	private final JComboBox sib1YearComboBox = new JComboBox();
	private final JComboBox sib1GradeComboBox = new JComboBox();
	private final JTextField sib2SchoolTF = new JTextField();
	private final JLabel lblSib2School = new JLabel("School");
	private final JLabel lblSib2Grade = new JLabel("Grade");
	private final JComboBox sib2GradeComboBox = new JComboBox();
	private final JLabel lblSib2DoB = new JLabel("Date of Birth");
	private final JComboBox sib2MonthComboBox = new JComboBox();
	private final JComboBox sib2DayComboBox = new JComboBox();
	private final JComboBox sib2YearComboBox = new JComboBox();
	private final JTextField sib2NameTF = new JTextField();
	private final JLabel lblSib2Name = new JLabel("Name");
	private final JTextField sib3SchoolTF = new JTextField();
	private final JLabel lblSib3School = new JLabel("School");
	private final JLabel lblSib3Grade = new JLabel("Grade");
	private final JComboBox sib3GradeComboBox = new JComboBox();
	private final JLabel lblSib3DoB = new JLabel("Date of Birth");
	private final JComboBox sib3MonthComboBox = new JComboBox();
	private final JComboBox sib3DayComboBox = new JComboBox();
	private final JComboBox sib3YearComboBox = new JComboBox();
	private final JTextField sib3NameTF = new JTextField();
	private final JLabel lblSib3Name = new JLabel("Name");
	
	
	private final JFormattedTextField salaryFTF = new JFormattedTextField(moneyFormat);
	private final JFormattedTextField socialSecurityFTF = new JFormattedTextField(moneyFormat);
	private final JFormattedTextField utilityFTF = new JFormattedTextField(moneyFormat);
	private final JFormattedTextField unemploymentFTF = new JFormattedTextField(moneyFormat);
	private final JFormattedTextField disabilityFTF = new JFormattedTextField(moneyFormat);
	private final JFormattedTextField foodStampsFTF = new JFormattedTextField(moneyFormat);
	private final JFormattedTextField tanfFTF = new JFormattedTextField(moneyFormat);
	private final JFormattedTextField childSupportFTF = new JFormattedTextField(moneyFormat);
	private final JFormattedTextField otherIncomeFTF = new JFormattedTextField(moneyFormat);
	private final JFormattedTextField rentFTF = new JFormattedTextField(moneyFormat);
	private final JFormattedTextField lightBillFTF = new JFormattedTextField(moneyFormat);
	private final JFormattedTextField phoneBillFTF = new JFormattedTextField(moneyFormat);
	private final JFormattedTextField cableBillFTF = new JFormattedTextField(moneyFormat);
	private final JFormattedTextField carPaymentFTF = new JFormattedTextField(moneyFormat);
	private final JFormattedTextField doctorFTF = new JFormattedTextField(moneyFormat);
	private final JFormattedTextField gasFTF = new JFormattedTextField(moneyFormat);
	private final JFormattedTextField furnFTF = new JFormattedTextField(moneyFormat);
	private final JFormattedTextField expensesOtherFTF = new JFormattedTextField(moneyFormat);
	private final JComboBox rel1AgeComboBox = new JComboBox();
	private final JComboBox rel2AgeComboBox = new JComboBox();
	private final JComboBox rel3AgeComboBox = new JComboBox();
	private final JComboBox rel4AgeComboBox = new JComboBox();
	private final JLabel incomeOutput = new JLabel("");
	private final JLabel expensesOutput = new JLabel("");
	private final JLabel netIncomeOutput = new JLabel("");
	private final JLabel lblSpecialServices = new JLabel("Special Services");
	private final JCheckBox chckbxGifted = new JCheckBox("Gifted");
	private final JCheckBox chckbxSpediep = new JCheckBox("Sped-IEP");
	private final JCheckBox chckbxSpeech = new JCheckBox("Speech-IEP");
	private final JCheckBox chckbxELL = new JCheckBox("ELL");
	private final JLabel lblLifeThreateningAllergy = new JLabel("Life Threatening Allergy");
	private final JTextField allergyTF = new JTextField();
	private final JLabel lblEmergencyContact = new JLabel("Emergency Contacts");
	private final JFormattedTextField emergencyPhone1FTF = new JFormattedTextField();
	private final JLabel lblEmergencyPhone1 = new JLabel("Phone Number*");
	private final JLabel lblEmergencyName1 = new JLabel("Name*");
	private final JLabel lblEmergencyRelationship = new JLabel("Relationship*");
	private final JTextField emergencyNameTF = new JTextField();
	private final JComboBox emergencyRelationshipTF = new JComboBox();
	private final JLabel lblEmergencyName2 = new JLabel("Name*");
	private final JTextField emergencyName2TF = new JTextField();
	private final JLabel lblEmergencyRelationship2 = new JLabel("Relationship*");
	private final JComboBox emergencyRelationComboBox = new JComboBox();
	private final JLabel lblEmergencyPhone2 = new JLabel("Phone Number*");
	private final JFormattedTextField emergencyPhone2FTF = new JFormattedTextField();
	private final JLabel lblMSE = new JLabel("<HTML>Allow child's name, address & phone number <br> to appear in the MSE directory?*</HTML>\r\n");
	private final JRadioButton radioYes = new JRadioButton("Yes");
	private final JRadioButton radioNo = new JRadioButton("No");
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final JMenuItem mntmParentHelp = new JMenuItem("Parent Help");
	private final JMenuItem mntmFinancialHelp = new JMenuItem("Financial Help");
	private final JLabel label = new JLabel("Subdivision*");
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DelVecchioMCSRframe frame = new DelVecchioMCSRframe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public MaskFormatter createFormatter(String s) {
	     MaskFormatter formatter = null;
	     try {
	          formatter = new MaskFormatter(s);
	         } 
	     catch (java.text.ParseException exc) {
		          System.err.println("formatter is bad: " + exc.getMessage());
		          System.exit(-1);
		      }
	      return formatter;
	}//createFormatter

	/**
	 * Create the frame.
	 */
	public DelVecchioMCSRframe() {
		allergyTF.setBounds(595, 170, 147, 20);
		allergyTF.setColumns(10);
		sib1NameTF.setToolTipText("Enter Name");
		sib1NameTF.setBounds(518, 201, 141, 20);
		sib1NameTF.setColumns(10);
		rel1NameTF.setToolTipText("Name");
		rel1NameTF.setBounds(123, 122, 109, 20);
		rel1NameTF.setColumns(10);
		checkOtherTF.setToolTipText("Other");
		checkOtherTF.setVisible(false);
		checkOtherTF.setBounds(588, 121, 86, 20);
		checkOtherTF.setColumns(10);
		MotherEmailTF.setToolTipText("Enter Email");
		MotherEmailTF.setBounds(166, 301, 141, 20);
		MotherEmailTF.setColumns(10);
		motherOccupationTF.setToolTipText("Enter Occupation");
		motherOccupationTF.setBounds(166, 276, 141, 20);
		motherOccupationTF.setColumns(10);
		motherEmploymentTF.setToolTipText("Enter Where You Work");
		motherEmploymentTF.setBounds(166, 251, 141, 20);
		motherEmploymentTF.setColumns(10);
		motherAddressTF.setToolTipText("Enter Address\\");
		motherAddressTF.setBounds(229, 226, 141, 20);
		motherAddressTF.setColumns(10);
		motherFirstNameTF.setToolTipText("Enter First Name");
		motherFirstNameTF.setBounds(166, 74, 141, 20);
		motherFirstNameTF.setColumns(10);
		childHomePhoneFTF.setToolTipText("Your Home Phone");
		childHomePhoneFTF.setBounds(131, 636, 176, 20);
		childHomePhoneFTF.setColumns(10);
		childCityTF.setToolTipText("Your City");
		childCityTF.setBounds(131, 589, 176, 20);
		childCityTF.setColumns(10);
		childStreetTF.setToolTipText("Your Street Address");
		childStreetTF.setBounds(131, 561, 176, 20);
		childStreetTF.setColumns(10);
		subdivisionTF.setToolTipText("Enter Your Subdivision");
		subdivisionTF.setBounds(131, 508, 176, 20);
		subdivisionTF.setColumns(10);
		otherGenderTF.setToolTipText("Enter Gender");
		otherGenderTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				do_otherGenderTF_focusLost(arg0);
			}
		});
		otherGenderTF.setBounds(250, 195, 132, 20);
		otherGenderTF.setColumns(10);
		childPreferredNameTF.setToolTipText("Student's Preferred Name");
		childPreferredNameTF.setBounds(131, 145, 171, 20);
		childPreferredNameTF.setColumns(10);
		childLastNameTF.setToolTipText("Student's Last Name");
		
		childLastNameTF.setBounds(131, 120, 171, 20);
		childLastNameTF.setColumns(10);
		childMiddleNameTF.setToolTipText("Student's Middle Name");
		childMiddleNameTF.setBounds(131, 95, 171, 20);
		childMiddleNameTF.setColumns(10);
		childFirstNameTF.setToolTipText("Student's First Name");
		
		childFirstNameTF.setForeground(Color.BLACK);
		childFirstNameTF.setCaretColor(Color.BLACK);
		childFirstNameTF.setBounds(131, 70, 171, 20);
		childFirstNameTF.setColumns(10);
		otherRaceTF.setToolTipText("Enter Race");
		otherRaceTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				do_otherRaceTF_focusLost(arg0);
			}
		});
		otherRaceTF.setBounds(250, 220, 132, 20);
		otherRaceTF.setColumns(10);
		jbInit();
	}
	private void jbInit() {
		setTitle("DelVecchio Madison County Schools Registration Form");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 805, 755);
		
		setJMenuBar(menuBar);
		
		menuBar.add(mnFile);
		mntmStartNewForm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_mntmStartNewForm_actionPerformed(arg0);
			}
		});
		
		mnFile.add(mntmStartNewForm);
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_mntmExit_actionPerformed(arg0);
			}
		});
		
		mnFile.add(mntmExit);
		
		menuBar.add(mnHelp);
		mntmStudentIHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_mntmStudentIHelp_actionPerformed(arg0);
			}
		});
		
		mnHelp.add(mntmStudentIHelp);
		mntmParentHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_mntmParentHelp_actionPerformed(arg0);
			}
		});
		
		mnHelp.add(mntmParentHelp);
		mntmFinancialHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_mntmFinancialHelp_actionPerformed(arg0);
			}
		});
		
		mnHelp.add(mntmFinancialHelp);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		tabbedPane.setBounds(0, 0, 789, 695);
		
		contentPane.add(tabbedPane);
		
		//must go before content pane added
		//sets placeholder character
		numMaskSSN.setPlaceholderCharacter(' ');
		
		numMaskPhone.setPlaceholderCharacter(' ');
		
		
		numMaskZip.setPlaceholderCharacter(' ');
		
		charMaskMiddleInitial.setPlaceholderCharacter(' ');
		numMaskPhone.install(motherHomePhoneFTF);
		numMaskPhone.install(motherCellPhoneFTF);
		numMaskPhone.install(motherWorkPhoneFTF);
		numMaskPhone.install(fatherHomePhoneFTF);
		numMaskPhone.install(fatherCellPhoneFTF);
		numMaskPhone.install(fatherWorkPhoneFTF);
		numMaskPhone.install(emergencyPhone1FTF);
		numMaskPhone.install(emergencyPhone2FTF);
		charMaskMiddleInitial.install(motherMiddleInitialFTF);
		charMaskMiddleInitial.install(fatherMiddleInitialFTF);
		checkOtherTF.setVisible(false);
		
		tabbedPane.addTab("Student", null, studentPanel, null);
		studentPanel.setLayout(null);
		lblChildFirstName.setToolTipText("Student's First Name");
		lblChildFirstName.setForeground(Color.BLACK);
		lblChildFirstName.setBounds(30, 73, 91, 14);
		
		studentPanel.add(lblChildFirstName);
		lblChildMiddleName.setToolTipText("Student's Middle Name");
		lblChildMiddleName.setBounds(30, 98, 103, 14);
		
		studentPanel.add(lblChildMiddleName);
		lblChildLastName.setToolTipText("Student's Last Name");
		lblChildLastName.setBounds(30, 123, 91, 14);
		
		studentPanel.add(lblChildLastName);
		lblChildPreferredName.setToolTipText("Student's Preferred Name");
		lblChildPreferredName.setBounds(30, 148, 118, 14);
		
		studentPanel.add(lblChildPreferredName);
		lblChildSsn.setToolTipText("Student's SSN");
		lblChildSsn.setBounds(30, 173, 46, 14);
		
		studentPanel.add(lblChildSsn);
		lblChildRace.setToolTipText("Student's Race");
		lblChildRace.setBounds(30, 223, 46, 14);
		
		studentPanel.add(lblChildRace);
		raceComboBox.setToolTipText("Student's Race");
		
		raceComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_RaceComboBox_actionPerformed(arg0);
			}
		});
		salaryFTF.setToolTipText("Salary");
		
		//Sets default values in financial tab
		salaryFTF.setValue(defaultMoney);
		socialSecurityFTF.setToolTipText("Social Security");
		socialSecurityFTF.setValue(defaultMoney);
		utilityFTF.setToolTipText("Utility Assistance");
		utilityFTF.setValue(defaultMoney);
		unemploymentFTF.setToolTipText("Unemployment");
		unemploymentFTF.setValue(defaultMoney);
		disabilityFTF.setToolTipText("Disability");
		disabilityFTF.setValue(defaultMoney);
		foodStampsFTF.setToolTipText("Food Stamps");
		foodStampsFTF.setValue(defaultMoney);
		tanfFTF.setToolTipText("TANF/AFDC");
		tanfFTF.setValue(defaultMoney);
		childSupportFTF.setToolTipText("Child Support");
		childSupportFTF.setValue(defaultMoney);
		otherIncomeFTF.setToolTipText("Other");
		otherIncomeFTF.setValue(defaultMoney);
		rentFTF.setForeground(Color.RED);
		rentFTF.setValue(defaultMoney);
		lightBillFTF.setForeground(Color.RED);
		lightBillFTF.setValue(defaultMoney);
		phoneBillFTF.setForeground(Color.RED);
		phoneBillFTF.setValue(defaultMoney);
		cableBillFTF.setForeground(Color.RED);
		cableBillFTF.setValue(defaultMoney);
		carPaymentFTF.setForeground(Color.RED);
		carPaymentFTF.setValue(defaultMoney);
		doctorFTF.setForeground(Color.RED);
		doctorFTF.setValue(defaultMoney);
		gasFTF.setForeground(Color.RED);
		gasFTF.setValue(defaultMoney);
		furnFTF.setForeground(Color.RED);
		furnFTF.setValue(defaultMoney);
		expensesOtherFTF.setForeground(Color.RED);
		expensesOtherFTF.setValue(defaultMoney);
		
		
		rentFTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				do_rentFTF_propertyChange(arg0);
			}
		});
		rentFTF.setValue(defaultMoney);
		lightBillFTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				do_lightBillFTF_propertyChange(arg0);
			}
		});
		lightBillFTF.setValue(defaultMoney);
		phoneBillFTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				do_phoneBillFTF_propertyChange(arg0);
			}
		});
		phoneBillFTF.setValue(defaultMoney);
		cableBillFTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				do_cableBillFTF_propertyChange(arg0);
			}
		});
		cableBillFTF.setValue(defaultMoney);
		carPaymentFTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				do_carPaymentFTF_propertyChange(arg0);
			}
		});
		carPaymentFTF.setValue(defaultMoney);
		doctorFTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				do_doctorFTF_propertyChange(arg0);
			}
		});
		doctorFTF.setValue(defaultMoney);
		gasFTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				do_gasFTF_propertyChange(arg0);
			}
		});
		gasFTF.setValue(defaultMoney);
		furnFTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				do_furnFTF_propertyChange(arg0);
			}
		});
		furnFTF.setValue(defaultMoney);
		expensesOtherFTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				do_expensesOtherFTF_propertyChange(arg0);
			}
		});
		expensesOtherFTF.setValue(defaultMoney);
		
		//installs placeholder onto field
		//need separate mask installed on each text field 
		numMaskSSN.install(childssnFTF);
		numMaskPhone.install(childHomePhoneFTF);
		numMaskZip.install(childZipFTF);
		
		raceComboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Black", "White", "Asian", "Hispanic", "Native American", "Other"}));
		raceComboBox.setBounds(131, 220, 109, 20);
		
		studentPanel.add(raceComboBox);
		
		studentPanel.add(otherRaceTF);
		
		studentPanel.add(childFirstNameTF);
		
		studentPanel.add(childMiddleNameTF);
		
		studentPanel.add(childLastNameTF);
		
		studentPanel.add(childPreferredNameTF);
		lblChildGender.setToolTipText("Student's Gender");
		lblChildGender.setBounds(30, 198, 46, 14);
		
		studentPanel.add(lblChildGender);
		genderComboBox.setToolTipText("Student's Gender");
		genderComboBox.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				do_genderComboBox_focusLost(arg0);
			}
		});
		genderComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_comboBox_actionPerformed(arg0);
			}
		});
		genderComboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Male", "Female", "Other"}));
		genderComboBox.setBounds(131, 195, 109, 20);
		
		studentPanel.add(genderComboBox);
		
		studentPanel.add(otherGenderTF);
		lblChildDateOfBirth.setToolTipText("Student's Date of Birth");
		lblChildDateOfBirth.setBounds(30, 248, 103, 14);
		
		studentPanel.add(lblChildDateOfBirth);
		monthComboBox.setToolTipText("Student's Birth Month");
		monthComboBox.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				do_monthComboBox_focusLost(arg0);
			}
		});
		monthComboBox.setModel(new DefaultComboBoxModel(new String[] {"Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		monthComboBox.setBounds(131, 245, 109, 20);
		
		studentPanel.add(monthComboBox);
		dayComboBox.setToolTipText("Student's Birth Day");
		dayComboBox.setModel(new DefaultComboBoxModel(new String[] {"Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		dayComboBox.setBounds(250, 245, 57, 20);
		
		studentPanel.add(dayComboBox);
		yearComboBox.setToolTipText("Student's Birth Year");
		yearComboBox.setModel(new DefaultComboBoxModel(new String[] {"Year", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016"}));
		yearComboBox.setBounds(317, 245, 65, 20);
		
		studentPanel.add(yearComboBox);
		lblStudentInstructions.setBounds(30, 44, 352, 14);
		
		studentPanel.add(lblStudentInstructions);
		lblStudentHeading.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblStudentHeading.setBounds(10, 11, 222, 22);
		
		studentPanel.add(lblStudentHeading);
		lblSubdivision.setToolTipText("Your Subdivision");
		lblSubdivision.setBounds(30, 511, 81, 14);
		
		studentPanel.add(lblSubdivision);
		
		studentPanel.add(subdivisionTF);
		lblHousingHeading.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblHousingHeading.setBounds(10, 478, 222, 22);
		
		studentPanel.add(lblHousingHeading);
		ownershipComboBox.setToolTipText("Select Lease or Own");
		ownershipComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_owndershipComboBox_actionPerformed(arg0);
			}
		});
		ownershipComboBox.setModel(new DefaultComboBoxModel(new String[] {"Status", "Lease", "Own"}));
		ownershipComboBox.setBounds(317, 508, 65, 20);
		
		studentPanel.add(ownershipComboBox);
		lblLeaseExpirationDate.setToolTipText("Lease Expiration Date");
		lblLeaseExpirationDate.setBounds(30, 536, 103, 14);
		
		studentPanel.add(lblLeaseExpirationDate);
		leaseMonthComboBox.setToolTipText("Lease Month");
		leaseMonthComboBox.setModel(new DefaultComboBoxModel(new String[] {"Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		leaseMonthComboBox.setBounds(131, 533, 109, 20);
		
		studentPanel.add(leaseMonthComboBox);
		LeaseDayComboBox.setToolTipText("Lease Day");
		LeaseDayComboBox.setModel(new DefaultComboBoxModel(new String[] {"Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		LeaseDayComboBox.setBounds(250, 533, 57, 20);
		
		studentPanel.add(LeaseDayComboBox);
		LeaseYearComboBox.setToolTipText("Lease Year");
		LeaseYearComboBox.setModel(new DefaultComboBoxModel(new String[] {"Year", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030"}));
		LeaseYearComboBox.setBounds(317, 533, 65, 20);
		
		studentPanel.add(LeaseYearComboBox);
		lblChildGrade.setToolTipText("Student's Grade");
		lblChildGrade.setBounds(30, 273, 65, 14);
		
		studentPanel.add(lblChildGrade);
		gradeComboBox.setToolTipText("Student's Grade");
		gradeComboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Kindergarten", "1", "2", "3", "4", "5", "6"}));
		gradeComboBox.setBounds(131, 270, 109, 20);
		
		studentPanel.add(gradeComboBox);
		lblStreetAddress.setToolTipText("Your Street Address");
		lblStreetAddress.setBounds(30, 564, 94, 14);
		
		studentPanel.add(lblStreetAddress);
		
		studentPanel.add(childStreetTF);
		lblCity.setToolTipText("Your City");
		lblCity.setBounds(30, 592, 81, 14);
		
		studentPanel.add(lblCity);
		
		studentPanel.add(childCityTF);
		lblZip.setToolTipText("Your Zip Code");
		lblZip.setBounds(30, 614, 81, 14);
		
		studentPanel.add(lblZip);
		lblHomePhone.setToolTipText("Your Home Phone");
		lblHomePhone.setBounds(30, 639, 103, 14);
		
		studentPanel.add(lblHomePhone);
		
		studentPanel.add(childHomePhoneFTF);
		childssnFTF.setToolTipText("Student's SSN");
		
		childssnFTF.setBounds(131, 170, 109, 17);
		
		studentPanel.add(childssnFTF);
		childZipFTF.setToolTipText("Your Zip Code");
		childZipFTF.setBounds(131, 612, 109, 22);
		
		studentPanel.add(childZipFTF);
		childTextArea.setToolTipText("Enter Details About Your Child");
		childTextArea.setLineWrap(true);
		childTextArea.setBounds(30, 340, 352, 127);
		
		studentPanel.add(childTextArea);
		lblTextAreaInstructions.setBounds(30, 298, 352, 42);
		
		studentPanel.add(lblTextAreaInstructions);
		lblSpecialServices.setBounds(438, 44, 161, 14);
		
		studentPanel.add(lblSpecialServices);
		chckbxGifted.setBounds(448, 64, 97, 23);
		
		studentPanel.add(chckbxGifted);
		chckbxSpediep.setBounds(448, 89, 97, 23);
		
		studentPanel.add(chckbxSpediep);
		chckbxSpeech.setBounds(448, 115, 97, 23);
		
		studentPanel.add(chckbxSpeech);
		chckbxELL.setBounds(448, 139, 97, 23);
		
		studentPanel.add(chckbxELL);
		lblLifeThreateningAllergy.setBounds(438, 173, 147, 14);
		
		studentPanel.add(lblLifeThreateningAllergy);
		
		studentPanel.add(allergyTF);
		lblEmergencyContact.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEmergencyContact.setBounds(416, 216, 222, 22);
		
		studentPanel.add(lblEmergencyContact);
		emergencyPhone1FTF.setToolTipText("Your Home Phone");
		emergencyPhone1FTF.setColumns(10);
		emergencyPhone1FTF.setBounds(595, 296, 147, 20);
		
		studentPanel.add(emergencyPhone1FTF);
		lblEmergencyPhone1.setToolTipText("Phone Number");
		lblEmergencyPhone1.setBounds(448, 299, 103, 14);
		
		studentPanel.add(lblEmergencyPhone1);
		lblEmergencyName1.setToolTipText("Name");
		lblEmergencyName1.setBounds(448, 248, 46, 14);
		
		studentPanel.add(lblEmergencyName1);
		lblEmergencyRelationship.setToolTipText("Relationship");
		lblEmergencyRelationship.setBounds(448, 273, 109, 14);
		
		studentPanel.add(lblEmergencyRelationship);
		emergencyNameTF.setToolTipText("Student's First Name");
		emergencyNameTF.setForeground(Color.BLACK);
		emergencyNameTF.setColumns(10);
		emergencyNameTF.setCaretColor(Color.BLACK);
		emergencyNameTF.setBounds(595, 245, 147, 20);
		
		studentPanel.add(emergencyNameTF);
		emergencyRelationshipTF.setToolTipText("Relationship");
		emergencyRelationshipTF.setModel(new DefaultComboBoxModel(new String[] {"Select", "Child", "Grandchild", "Sibling", "Grandparent", "Extended Family"}));
		emergencyRelationshipTF.setBounds(595, 270, 109, 20);
		
		studentPanel.add(emergencyRelationshipTF);
		lblEmergencyName2.setToolTipText("Name");
		lblEmergencyName2.setBounds(448, 343, 46, 14);
		
		studentPanel.add(lblEmergencyName2);
		emergencyName2TF.setToolTipText("Student's First Name");
		emergencyName2TF.setForeground(Color.BLACK);
		emergencyName2TF.setColumns(10);
		emergencyName2TF.setCaretColor(Color.BLACK);
		emergencyName2TF.setBounds(595, 340, 147, 20);
		
		studentPanel.add(emergencyName2TF);
		lblEmergencyRelationship2.setToolTipText("Relationship");
		lblEmergencyRelationship2.setBounds(448, 368, 109, 14);
		
		studentPanel.add(lblEmergencyRelationship2);
		emergencyRelationComboBox.setToolTipText("Relationship");
		emergencyRelationComboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Child", "Grandchild", "Sibling", "Grandparent", "Extended Family"}));
		emergencyRelationComboBox.setBounds(595, 365, 109, 20);
		
		studentPanel.add(emergencyRelationComboBox);
		lblEmergencyPhone2.setToolTipText("Phone Number");
		lblEmergencyPhone2.setBounds(448, 394, 103, 14);
		
		studentPanel.add(lblEmergencyPhone2);
		emergencyPhone2FTF.setToolTipText("Your Home Phone");
		emergencyPhone2FTF.setColumns(10);
		emergencyPhone2FTF.setBounds(595, 391, 147, 20);
		
		studentPanel.add(emergencyPhone2FTF);
		lblMSE.setBounds(448, 432, 294, 35);
		
		studentPanel.add(lblMSE);
		buttonGroup.add(radioYes);
		radioYes.setBounds(468, 474, 109, 23);
		
		studentPanel.add(radioYes);
		buttonGroup.add(radioNo);
		radioNo.setBounds(468, 500, 109, 23);
		
		studentPanel.add(radioNo);
		label.setToolTipText("Your Subdivision");
		label.setBounds(30, 511, 81, 14);
		
		studentPanel.add(label);
		studentPanel.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{otherGenderTF, otherRaceTF, dayComboBox, yearComboBox, gradeComboBox, childTextArea, subdivisionTF, ownershipComboBox, leaseMonthComboBox, LeaseDayComboBox, LeaseYearComboBox, childStreetTF, childCityTF, childZipFTF, childHomePhoneFTF, chckbxGifted, chckbxSpediep, chckbxSpeech, chckbxELL, allergyTF, emergencyNameTF, emergencyRelationshipTF, emergencyPhone1FTF, emergencyName2TF, emergencyRelationComboBox, emergencyPhone2FTF, radioYes, radioNo, childFirstNameTF, childMiddleNameTF, childLastNameTF, childPreferredNameTF, childssnFTF, genderComboBox, raceComboBox, monthComboBox}));
		otherRaceTF.setVisible(false);
		otherGenderTF.setVisible(false);
		lblLeaseExpirationDate.setVisible(false);
		leaseMonthComboBox.setVisible(false);
		LeaseDayComboBox.setVisible(false);
		LeaseYearComboBox.setVisible(false);
		
		
		tabbedPane.addTab("Parent", null, parentPanel, null);
		parentPanel.setLayout(null);
		lblParentHeading.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblParentHeading.setBounds(10, 11, 222, 22);
		
		parentPanel.add(lblParentHeading);
		lblMotherHeading.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMotherHeading.setBounds(20, 44, 141, 22);
		
		parentPanel.add(lblMotherHeading);
		lblMotherFirstName.setToolTipText("Enter First Name");
		lblMotherFirstName.setBounds(30, 77, 72, 14);
		
		parentPanel.add(lblMotherFirstName);
		lblMiddleInitial.setToolTipText("Enter Middle Initial");
		lblMiddleInitial.setBounds(30, 104, 87, 14);
		
		parentPanel.add(lblMiddleInitial);
		
		parentPanel.add(motherFirstNameTF);
		lblMotherLastName.setToolTipText("Enter Last Name");
		lblMotherLastName.setBounds(30, 129, 85, 14);
		
		parentPanel.add(lblMotherLastName);
		MotherLastNameTF.setToolTipText("Enter Last Name");
		MotherLastNameTF.setColumns(10);
		MotherLastNameTF.setBounds(166, 126, 141, 20);
		
		parentPanel.add(MotherLastNameTF);
		lblMotherHomePhone.setToolTipText("Enter Home Phone");
		lblMotherHomePhone.setBounds(30, 154, 87, 14);
		
		parentPanel.add(lblMotherHomePhone);
		lblMotherWorkPhone.setToolTipText("Enter Work Phone");
		lblMotherWorkPhone.setBounds(30, 179, 87, 14);
		
		parentPanel.add(lblMotherWorkPhone);
		lblMotherCell.setToolTipText("Enter Cell Phone");
		lblMotherCell.setBounds(30, 204, 87, 14);
		
		parentPanel.add(lblMotherCell);
		lblNewLabel.setToolTipText("Enter Address");
		lblNewLabel.setBounds(30, 229, 190, 14);
		
		parentPanel.add(lblNewLabel);
		
		parentPanel.add(motherAddressTF);
		lblMotherEmployment.setToolTipText("Enter Where You Work");
		lblMotherEmployment.setBounds(30, 254, 141, 14);
		
		parentPanel.add(lblMotherEmployment);
		
		parentPanel.add(motherEmploymentTF);
		lblMotherOccupation.setToolTipText("Enter Occupation");
		lblMotherOccupation.setBounds(30, 279, 100, 14);
		
		parentPanel.add(lblMotherOccupation);
		
		parentPanel.add(motherOccupationTF);
		lblMotherEmail.setToolTipText("Enter Email");
		lblMotherEmail.setBounds(30, 304, 72, 14);
		
		parentPanel.add(lblMotherEmail);
		
		parentPanel.add(MotherEmailTF);
		lblFatherHeading.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFatherHeading.setBounds(20, 329, 200, 22);
		
		parentPanel.add(lblFatherHeading);
		lblFatherFirstName.setToolTipText("Enter First Name");
		lblFatherFirstName.setBounds(30, 362, 72, 14);
		
		parentPanel.add(lblFatherFirstName);
		fatherFirstNameTF.setToolTipText("Enter First Name");
		fatherFirstNameTF.setColumns(10);
		fatherFirstNameTF.setBounds(166, 359, 141, 20);
		
		parentPanel.add(fatherFirstNameTF);
		lblFatherMiddleInitial.setToolTipText("Enter Middle Initial");
		lblFatherMiddleInitial.setBounds(30, 389, 87, 14);
		
		parentPanel.add(lblFatherMiddleInitial);
		lblFatherLastName.setToolTipText("Enter Last Name");
		lblFatherLastName.setBounds(30, 414, 85, 14);
		
		parentPanel.add(lblFatherLastName);
		fatherLastNameTF.setToolTipText("Enter Last Name");
		fatherLastNameTF.setColumns(10);
		fatherLastNameTF.setBounds(166, 411, 141, 20);
		
		parentPanel.add(fatherLastNameTF);
		lblFatherHomePhone.setToolTipText("Enter Home Phone");
		lblFatherHomePhone.setBounds(30, 439, 87, 14);
		
		parentPanel.add(lblFatherHomePhone);
		lblFatherWorkPhone.setToolTipText("Enter Work Phone");
		lblFatherWorkPhone.setBounds(30, 464, 87, 14);
		
		parentPanel.add(lblFatherWorkPhone);
		lblFatherCellPhone.setToolTipText("Enter Cell Phone");
		lblFatherCellPhone.setBounds(30, 489, 87, 14);
		
		parentPanel.add(lblFatherCellPhone);
		lblFatherAddress.setToolTipText("Enter Address");
		lblFatherAddress.setBounds(30, 514, 190, 14);
		
		parentPanel.add(lblFatherAddress);
		fatherAddressTF.setToolTipText("Enter Address");
		fatherAddressTF.setColumns(10);
		fatherAddressTF.setBounds(229, 511, 141, 20);
		
		parentPanel.add(fatherAddressTF);
		lblFatherEmployment.setToolTipText("Enter Where You Work");
		lblFatherEmployment.setBounds(30, 539, 141, 14);
		
		parentPanel.add(lblFatherEmployment);
		fatherEmploymentTF.setToolTipText("Enter Where You Work");
		fatherEmploymentTF.setColumns(10);
		fatherEmploymentTF.setBounds(166, 536, 141, 20);
		
		parentPanel.add(fatherEmploymentTF);
		lblFatherOccupation.setToolTipText("Enter Occupation");
		lblFatherOccupation.setBounds(30, 564, 100, 14);
		
		parentPanel.add(lblFatherOccupation);
		fatherOccupationTF.setToolTipText("Enter Occupation");
		fatherOccupationTF.setColumns(10);
		fatherOccupationTF.setBounds(166, 561, 141, 20);
		
		parentPanel.add(fatherOccupationTF);
		lblFatherEmail.setToolTipText("Enter Email");
		lblFatherEmail.setBounds(30, 589, 72, 14);
		
		parentPanel.add(lblFatherEmail);
		fatherEmailTF.setToolTipText("Enter Email");
		fatherEmailTF.setColumns(10);
		fatherEmailTF.setBounds(166, 586, 141, 20);
		
		parentPanel.add(fatherEmailTF);
		motherMiddleInitialFTF.setToolTipText("Enter Middle Initial");
		motherMiddleInitialFTF.setBounds(165, 101, 25, 17);
		
		parentPanel.add(motherMiddleInitialFTF);
		motherHomePhoneFTF.setToolTipText("Enter Home Phone");
		motherHomePhoneFTF.setBounds(165, 151, 142, 17);
		
		parentPanel.add(motherHomePhoneFTF);
		motherWorkPhoneFTF.setToolTipText("Enter Work Phone");
		motherWorkPhoneFTF.setBounds(165, 176, 142, 17);
		
		parentPanel.add(motherWorkPhoneFTF);
		motherCellPhoneFTF.setToolTipText("Enter Cell Phone");
		motherCellPhoneFTF.setBounds(165, 201, 142, 17);
		
		parentPanel.add(motherCellPhoneFTF);
		fatherMiddleInitialFTF.setToolTipText("Enter Middle Initial");
		fatherMiddleInitialFTF.setBounds(166, 386, 25, 17);
		
		parentPanel.add(fatherMiddleInitialFTF);
		fatherHomePhoneFTF.setToolTipText("Enter Home Phone");
		fatherHomePhoneFTF.setBounds(165, 436, 142, 17);
		
		parentPanel.add(fatherHomePhoneFTF);
		fatherWorkPhoneFTF.setToolTipText("Enter Work Phone");
		fatherWorkPhoneFTF.setBounds(166, 461, 141, 17);
		
		parentPanel.add(fatherWorkPhoneFTF);
		fatherCellPhoneFTF.setToolTipText("Enter Cell Phone");
		fatherCellPhoneFTF.setBounds(165, 486, 142, 17);
		
		parentPanel.add(fatherCellPhoneFTF);
		lblChildRelation.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblChildRelation.setBounds(413, 44, 141, 22);
		
		parentPanel.add(lblChildRelation);
		lblChildLivesWith.setToolTipText("Select Who Child Lives With");
		lblChildLivesWith.setBounds(413, 77, 104, 14);
		
		parentPanel.add(lblChildLivesWith);
		chckbxMother.setToolTipText("Mother");
		chckbxMother.setBounds(518, 73, 97, 23);
		
		parentPanel.add(chckbxMother);
		chckbxFather.setToolTipText("Father");
		chckbxFather.setBounds(518, 95, 97, 23);
		
		parentPanel.add(chckbxFather);
		chckbxOther.setToolTipText("Other");
		chckbxOther.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_chckbxOther_actionPerformed(arg0);
			}
		});
		
		chckbxOther.setBounds(518, 120, 64, 23);
		
		parentPanel.add(chckbxOther);
		
		parentPanel.add(checkOtherTF);
		lblSiblings.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSiblings.setBounds(413, 148, 141, 22);
		
		parentPanel.add(lblSiblings);
		lblSibling.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSibling.setBounds(423, 179, 141, 22);
		
		parentPanel.add(lblSibling);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_1.setBounds(423, 304, 141, 22);
		
		parentPanel.add(label_1);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_2.setBounds(423, 434, 141, 22);
		
		parentPanel.add(label_2);
		lblSib1Name.setToolTipText("Enter Name");
		lblSib1Name.setBounds(433, 204, 64, 14);
		
		parentPanel.add(lblSib1Name);
		lblSib1DoB.setToolTipText("Enter DoB");
		lblSib1DoB.setBounds(433, 229, 84, 14);
		
		parentPanel.add(lblSib1DoB);
		lblSib1Grade.setToolTipText("Enter Grade");
		lblSib1Grade.setBounds(433, 254, 64, 14);
		
		parentPanel.add(lblSib1Grade);
		lblSib1School.setToolTipText("Enter School");
		lblSib1School.setBounds(433, 279, 64, 14);
		
		parentPanel.add(lblSib1School);
		
		parentPanel.add(sib1NameTF);
		sib1SchoolTF.setToolTipText("Enter School");
		sib1SchoolTF.setColumns(10);
		sib1SchoolTF.setBounds(518, 276, 141, 20);
		
		parentPanel.add(sib1SchoolTF);
		sib1MonthComboBox.setToolTipText("Enter DoB");
		sib1MonthComboBox.setModel(new DefaultComboBoxModel(new String[] {"Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		sib1MonthComboBox.setBounds(518, 226, 109, 20);
		
		parentPanel.add(sib1MonthComboBox);
		sib1DayComboBox.setToolTipText("Enter DoB");
		sib1DayComboBox.setModel(new DefaultComboBoxModel(new String[] {"Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		sib1DayComboBox.setBounds(637, 226, 57, 20);
		
		parentPanel.add(sib1DayComboBox);
		sib1YearComboBox.setToolTipText("Enter DoB");
		sib1YearComboBox.setModel(new DefaultComboBoxModel(new String[] {"Year", "1990", "1991", "1992", "1993", "1994", "1996", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016"}));
		sib1YearComboBox.setBounds(704, 226, 65, 20);
		
		parentPanel.add(sib1YearComboBox);
		sib1GradeComboBox.setToolTipText("Enter Grade");
		sib1GradeComboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Kindergarten", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		sib1GradeComboBox.setBounds(518, 251, 109, 20);
		
		parentPanel.add(sib1GradeComboBox);
		sib2SchoolTF.setToolTipText("Enter School");
		sib2SchoolTF.setColumns(10);
		sib2SchoolTF.setBounds(518, 408, 141, 20);
		
		parentPanel.add(sib2SchoolTF);
		lblSib2School.setToolTipText("Enter School");
		lblSib2School.setBounds(433, 411, 64, 14);
		
		parentPanel.add(lblSib2School);
		lblSib2Grade.setToolTipText("Enter Grade");
		lblSib2Grade.setBounds(433, 386, 64, 14);
		
		parentPanel.add(lblSib2Grade);
		sib2GradeComboBox.setToolTipText("Enter Grade");
		sib2GradeComboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Kindergarten", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		sib2GradeComboBox.setBounds(518, 383, 109, 20);
		
		parentPanel.add(sib2GradeComboBox);
		lblSib2DoB.setToolTipText("Enter DoB");
		lblSib2DoB.setBounds(433, 361, 84, 14);
		
		parentPanel.add(lblSib2DoB);
		sib2MonthComboBox.setToolTipText("Enter DoB");
		sib2MonthComboBox.setModel(new DefaultComboBoxModel(new String[] {"Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		sib2MonthComboBox.setBounds(518, 358, 109, 20);
		
		parentPanel.add(sib2MonthComboBox);
		sib2DayComboBox.setToolTipText("Enter DoB");
		sib2DayComboBox.setModel(new DefaultComboBoxModel(new String[] {"Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		sib2DayComboBox.setBounds(637, 358, 57, 20);
		
		parentPanel.add(sib2DayComboBox);
		sib2YearComboBox.setToolTipText("Enter DoB");
		sib2YearComboBox.setModel(new DefaultComboBoxModel(new String[] {"Year", "1990", "1991", "1992", "1993", "1994", "1996", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016"}));
		sib2YearComboBox.setBounds(704, 358, 65, 20);
		
		parentPanel.add(sib2YearComboBox);
		sib2NameTF.setToolTipText("Enter Name");
		sib2NameTF.setColumns(10);
		sib2NameTF.setBounds(518, 333, 141, 20);
		
		parentPanel.add(sib2NameTF);
		lblSib2Name.setToolTipText("Enter Name");
		lblSib2Name.setBounds(433, 336, 64, 14);
		
		parentPanel.add(lblSib2Name);
		sib3SchoolTF.setToolTipText("Enter School");
		sib3SchoolTF.setColumns(10);
		sib3SchoolTF.setBounds(518, 539, 141, 20);
		
		parentPanel.add(sib3SchoolTF);
		lblSib3School.setToolTipText("Enter School");
		lblSib3School.setBounds(433, 542, 64, 14);
		
		parentPanel.add(lblSib3School);
		lblSib3Grade.setToolTipText("Enter Grade");
		lblSib3Grade.setBounds(433, 517, 64, 14);
		
		parentPanel.add(lblSib3Grade);
		sib3GradeComboBox.setToolTipText("Enter Grade");
		sib3GradeComboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Kindergarten", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		sib3GradeComboBox.setBounds(518, 514, 109, 20);
		
		parentPanel.add(sib3GradeComboBox);
		lblSib3DoB.setToolTipText("Enter DoB");
		lblSib3DoB.setBounds(433, 492, 84, 14);
		
		parentPanel.add(lblSib3DoB);
		sib3MonthComboBox.setToolTipText("Enter DoB");
		sib3MonthComboBox.setModel(new DefaultComboBoxModel(new String[] {"Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		sib3MonthComboBox.setBounds(518, 489, 109, 20);
		
		parentPanel.add(sib3MonthComboBox);
		sib3DayComboBox.setToolTipText("Enter DoB");
		sib3DayComboBox.setModel(new DefaultComboBoxModel(new String[] {"Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		sib3DayComboBox.setBounds(637, 489, 57, 20);
		
		parentPanel.add(sib3DayComboBox);
		sib3YearComboBox.setToolTipText("Enter DoB");
		sib3YearComboBox.setModel(new DefaultComboBoxModel(new String[] {"Year", "1990", "1991", "1992", "1993", "1994", "1996", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016"}));
		sib3YearComboBox.setBounds(704, 489, 65, 20);
		
		parentPanel.add(sib3YearComboBox);
		sib3NameTF.setToolTipText("Enter Name");
		sib3NameTF.setColumns(10);
		sib3NameTF.setBounds(518, 464, 141, 20);
		
		parentPanel.add(sib3NameTF);
		lblSib3Name.setToolTipText("Enter Name");
		lblSib3Name.setBounds(433, 467, 64, 14);
		
		parentPanel.add(lblSib3Name);
		parentPanel.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{motherFirstNameTF, motherMiddleInitialFTF, MotherLastNameTF, motherHomePhoneFTF, motherWorkPhoneFTF, motherCellPhoneFTF, motherAddressTF, motherEmploymentTF, motherOccupationTF, MotherEmailTF, fatherFirstNameTF, fatherLastNameTF, fatherAddressTF, fatherEmploymentTF, fatherOccupationTF, fatherEmailTF, fatherMiddleInitialFTF, fatherHomePhoneFTF, fatherWorkPhoneFTF, fatherCellPhoneFTF, chckbxMother, chckbxFather, chckbxOther, checkOtherTF, sib1NameTF, sib1SchoolTF, sib1MonthComboBox, sib1DayComboBox, sib1YearComboBox, sib1GradeComboBox, sib2SchoolTF, sib2GradeComboBox, sib2MonthComboBox, sib2DayComboBox, sib2YearComboBox, sib2NameTF, sib3SchoolTF, sib3GradeComboBox, sib3MonthComboBox, sib3DayComboBox, sib3YearComboBox, sib3NameTF}));
		
		tabbedPane.addTab("Financial", null, financialPanel, null);
		financialPanel.setLayout(null);
		lblRelation1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRelation1.setBounds(27, 94, 85, 27);
		
		financialPanel.add(lblRelation1);
		lblRel1Name.setToolTipText("Name");
		lblRel1Name.setBounds(37, 125, 46, 14);
		
		financialPanel.add(lblRel1Name);
		lblRel1Relationship.setToolTipText("Relationship");
		lblRel1Relationship.setBounds(37, 150, 75, 14);
		
		financialPanel.add(lblRel1Relationship);
		lblRel1Age.setToolTipText("Age");
		lblRel1Age.setBounds(37, 175, 46, 14);
		
		financialPanel.add(lblRel1Age);
		lblRel1Ssn.setToolTipText("SSN");
		lblRel1Ssn.setBounds(37, 200, 46, 14);
		
		financialPanel.add(lblRel1Ssn);
		
		financialPanel.add(rel1NameTF);
		rel1Ssn.setToolTipText("SSN");
		rel1Ssn.setColumns(10);
		rel1Ssn.setBounds(123, 197, 109, 20);
		
		financialPanel.add(rel1Ssn);
		rel2Ssn.setColumns(10);
		rel2Ssn.setBounds(123, 328, 109, 20);
		
		financialPanel.add(rel2Ssn);
		lblRel2Ssn.setBounds(37, 331, 46, 14);
		
		financialPanel.add(lblRel2Ssn);
		lblRel2Age.setBounds(37, 306, 46, 14);
		
		financialPanel.add(lblRel2Age);
		lblRel2Relationship.setBounds(37, 281, 75, 14);
		
		financialPanel.add(lblRel2Relationship);
		rel2NameTF.setColumns(10);
		rel2NameTF.setBounds(123, 253, 109, 20);
		
		financialPanel.add(rel2NameTF);
		lblRel2Name.setToolTipText("Name");
		lblRel2Name.setBounds(37, 256, 46, 14);
		
		financialPanel.add(lblRel2Name);
		lblRelation2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRelation2.setBounds(27, 225, 85, 27);
		
		financialPanel.add(lblRelation2);
		rel3Ssn.setToolTipText("SSN");
		rel3Ssn.setColumns(10);
		rel3Ssn.setBounds(123, 462, 109, 20);
		
		financialPanel.add(rel3Ssn);
		lblRel3Ssn.setToolTipText("SSN");
		lblRel3Ssn.setBounds(37, 465, 46, 14);
		
		financialPanel.add(lblRel3Ssn);
		lblRel3Age.setToolTipText("Age");
		lblRel3Age.setBounds(37, 440, 46, 14);
		
		financialPanel.add(lblRel3Age);
		lblRel3Relationship.setToolTipText("Relationship");
		lblRel3Relationship.setBounds(37, 415, 75, 14);
		
		financialPanel.add(lblRel3Relationship);
		rel3NameTF.setToolTipText("Name");
		rel3NameTF.setColumns(10);
		rel3NameTF.setBounds(123, 387, 109, 20);
		
		financialPanel.add(rel3NameTF);
		lblRel3Name.setBounds(37, 390, 46, 14);
		
		financialPanel.add(lblRel3Name);
		lblRelation3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRelation3.setBounds(27, 359, 85, 27);
		
		financialPanel.add(lblRelation3);
		rel4Ssn.setToolTipText("SSN");
		rel4Ssn.setColumns(10);
		rel4Ssn.setBounds(123, 596, 109, 20);
		
		financialPanel.add(rel4Ssn);
		lblRel4Ssn.setToolTipText("SSN");
		lblRel4Ssn.setBounds(37, 599, 46, 14);
		
		financialPanel.add(lblRel4Ssn);
		lblRel4Age.setToolTipText("Age");
		lblRel4Age.setBounds(37, 574, 46, 14);
		
		financialPanel.add(lblRel4Age);
		lblRel4Relationship.setToolTipText("Relationship");
		lblRel4Relationship.setBounds(37, 549, 75, 14);
		
		financialPanel.add(lblRel4Relationship);
		rel4NameTF.setToolTipText("Name");
		rel4NameTF.setColumns(10);
		rel4NameTF.setBounds(123, 521, 109, 20);
		
		financialPanel.add(rel4NameTF);
		lblRel4Name.setBounds(37, 524, 46, 14);
		
		financialPanel.add(lblRel4Name);
		lblRelation4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRelation4.setBounds(27, 493, 85, 27);
		
		financialPanel.add(lblRelation4);
		rel1RelationshipComboBox.setToolTipText("Relationship");
		rel1RelationshipComboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Child", "Grandchild", "Sibling", "Grandparent", "Extended Family", ""}));
		rel1RelationshipComboBox.setBounds(122, 147, 109, 20);
		
		financialPanel.add(rel1RelationshipComboBox);
		rel2RelationshipComboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Child", "Grandchild", "Sibling", "Grandparent", "Extended Family"}));
		rel2RelationshipComboBox.setBounds(123, 278, 109, 20);
		
		financialPanel.add(rel2RelationshipComboBox);
		rel3RelationshipComboBox.setToolTipText("Relationship");
		rel3RelationshipComboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Child", "Grandchild", "Sibling", "Grandparent", "Extended Family"}));
		rel3RelationshipComboBox.setBounds(123, 412, 109, 20);
		
		financialPanel.add(rel3RelationshipComboBox);
		rel4RelationshipComboBox.setToolTipText("Relationship");
		rel4RelationshipComboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Child", "Grandchild", "Sibling", "Grandparent", "Extended Family"}));
		rel4RelationshipComboBox.setBounds(123, 546, 109, 20);
		
		financialPanel.add(rel4RelationshipComboBox);
		lblFinancialHeading.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFinancialHeading.setBounds(10, 11, 689, 22);
		
		financialPanel.add(lblFinancialHeading);
		lblRelationships.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRelationships.setBounds(11, 44, 141, 22);
		
		financialPanel.add(lblRelationships);
		lblNewLabel_1.setBounds(27, 69, 345, 14);
		
		financialPanel.add(lblNewLabel_1);
		lblIncome.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIncome.setBounds(395, 44, 304, 22);
		
		financialPanel.add(lblIncome);
		lblExpenses.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblExpenses.setBounds(395, 328, 267, 22);
		
		financialPanel.add(lblExpenses);
		lblSalary.setToolTipText("Salary");
		lblSalary.setBounds(405, 77, 109, 14);
		
		financialPanel.add(lblSalary);
		lblSocialSecurity.setToolTipText("Social Security");
		lblSocialSecurity.setBounds(405, 102, 109, 14);
		
		financialPanel.add(lblSocialSecurity);
		lblUtilityAssistance.setToolTipText("Utility Assistance");
		lblUtilityAssistance.setBounds(405, 125, 109, 14);
		
		financialPanel.add(lblUtilityAssistance);
		lblUnemployment.setToolTipText("Unemployment");
		lblUnemployment.setBounds(405, 150, 109, 14);
		
		financialPanel.add(lblUnemployment);
		lblDisability.setToolTipText("Disability");
		lblDisability.setBounds(405, 175, 109, 14);
		
		financialPanel.add(lblDisability);
		lblFoodStamps.setToolTipText("Food Stamps");
		lblFoodStamps.setBounds(405, 200, 109, 14);
		
		financialPanel.add(lblFoodStamps);
		lblTanf.setToolTipText("TANF/AFDC");
		lblTanf.setBounds(405, 225, 109, 14);
		
		financialPanel.add(lblTanf);
		lblChildSupport.setToolTipText("Child Support");
		lblChildSupport.setBounds(405, 253, 109, 14);
		
		financialPanel.add(lblChildSupport);
		lblIncomeOther.setToolTipText("Other");
		lblIncomeOther.setBounds(405, 278, 97, 14);
		
		financialPanel.add(lblIncomeOther);
		lblRent.setBounds(405, 359, 97, 14);
		
		financialPanel.add(lblRent);
		lblLightBill.setBounds(405, 384, 85, 14);
		
		financialPanel.add(lblLightBill);
		lblPhoneBill.setBounds(405, 409, 85, 14);
		
		financialPanel.add(lblPhoneBill);
		lblCableTv.setBounds(405, 434, 85, 14);
		
		financialPanel.add(lblCableTv);
		lblCarPayment.setBounds(405, 459, 85, 14);
		
		financialPanel.add(lblCarPayment);
		lblDoctor.setBounds(405, 484, 85, 14);
		
		financialPanel.add(lblDoctor);
		lblGas.setBounds(405, 506, 85, 14);
		
		financialPanel.add(lblGas);
		lblFurn.setBounds(405, 527, 109, 14);
		
		financialPanel.add(lblFurn);
		lblExpensesOther.setBounds(405, 552, 97, 14);
		
		financialPanel.add(lblExpensesOther);
		lblIncomeTotal.setToolTipText("Total");
		lblIncomeTotal.setBounds(529, 303, 60, 14);
		
		financialPanel.add(lblIncomeTotal);
		lblExpensesTotal.setBounds(529, 577, 85, 14);
		
		financialPanel.add(lblExpensesTotal);
		lblNetIncome.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNetIncome.setBounds(529, 596, 103, 27);
		
		financialPanel.add(lblNetIncome);
		salaryFTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				do_salaryFTF_propertyChange(arg0);
			}
		});
		salaryFTF.setBounds(529, 75, 103, 17);
		
		financialPanel.add(salaryFTF);
		socialSecurityFTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				do_socialSecurityFTF_propertyChange(arg0);
			}
		});
		socialSecurityFTF.setBounds(529, 99, 103, 17);
		
		financialPanel.add(socialSecurityFTF);
		utilityFTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				do_utilityFTF_propertyChange(arg0);
			}
		});
		utilityFTF.setBounds(529, 122, 103, 17);
		
		financialPanel.add(utilityFTF);
		unemploymentFTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				do_unemploymentFTF_propertyChange(arg0);
			}
		});
		unemploymentFTF.setBounds(529, 147, 103, 17);
		
		financialPanel.add(unemploymentFTF);
		disabilityFTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				do_disabilityFTF_propertyChange(arg0);
			}
		});
		disabilityFTF.setBounds(529, 172, 103, 17);
		
		financialPanel.add(disabilityFTF);
		foodStampsFTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				do_foodStampsFTF_propertyChange(arg0);
			}
		});
		foodStampsFTF.setBounds(529, 197, 103, 17);
		
		financialPanel.add(foodStampsFTF);
		tanfFTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				do_tanfFTF_propertyChange(arg0);
			}
		});
		tanfFTF.setBounds(529, 222, 103, 17);
		
		financialPanel.add(tanfFTF);
		childSupportFTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				do_childSupportFTF_propertyChange(arg0);
			}
		});
		childSupportFTF.setBounds(529, 250, 103, 17);
		
		financialPanel.add(childSupportFTF);
		otherIncomeFTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				do_otherIncomeFTF_propertyChange(arg0);
			}
		});
		otherIncomeFTF.setBounds(529, 275, 103, 17);
		
		financialPanel.add(otherIncomeFTF);
		rentFTF.setBounds(529, 359, 103, 17);
		
		financialPanel.add(rentFTF);
		lightBillFTF.setBounds(529, 381, 103, 17);
		
		financialPanel.add(lightBillFTF);
		phoneBillFTF.setBounds(529, 406, 103, 17);
		
		financialPanel.add(phoneBillFTF);
		cableBillFTF.setBounds(529, 431, 103, 17);
		
		financialPanel.add(cableBillFTF);
		carPaymentFTF.setBounds(529, 459, 103, 17);
		
		financialPanel.add(carPaymentFTF);
		doctorFTF.setBounds(529, 482, 103, 17);
		
		financialPanel.add(doctorFTF);
		gasFTF.setBounds(529, 504, 103, 17);
		
		financialPanel.add(gasFTF);
		furnFTF.setBounds(529, 525, 103, 17);
		
		financialPanel.add(furnFTF);
		expensesOtherFTF.setBounds(529, 549, 103, 17);
		
		financialPanel.add(expensesOtherFTF);
		rel1AgeComboBox.setToolTipText("Age");
		rel1AgeComboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100"}));
		rel1AgeComboBox.setBounds(123, 172, 60, 20);
		
		financialPanel.add(rel1AgeComboBox);
		rel2AgeComboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100"}));
		rel2AgeComboBox.setBounds(123, 303, 60, 20);
		
		financialPanel.add(rel2AgeComboBox);
		rel3AgeComboBox.setToolTipText("Age");
		rel3AgeComboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100"}));
		rel3AgeComboBox.setBounds(123, 437, 60, 20);
		
		financialPanel.add(rel3AgeComboBox);
		rel4AgeComboBox.setToolTipText("Age");
		rel4AgeComboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100"}));
		rel4AgeComboBox.setBounds(123, 571, 60, 20);
		
		financialPanel.add(rel4AgeComboBox);
		incomeOutput.setBounds(599, 306, 100, 14);
		
		financialPanel.add(incomeOutput);
		expensesOutput.setForeground(Color.RED);
		expensesOutput.setBounds(599, 577, 85, 14);
		
		financialPanel.add(expensesOutput);
		netIncomeOutput.setFont(new Font("Tahoma", Font.BOLD, 14));
		netIncomeOutput.setBounds(631, 596, 103, 27);
		
		financialPanel.add(netIncomeOutput);
		financialPanel.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblRel1Name, lblFinancialHeading, lblRelationships, lblNewLabel_1, lblRelation1, rel1NameTF, lblRelation2, lblRel1Relationship, rel1RelationshipComboBox, lblRel1Age, lblRel1Ssn, rel1Ssn, rel1AgeComboBox, rel2Ssn, lblRel2Ssn, lblRel2Age, lblRel2Relationship, rel2NameTF, lblRel2Name, rel3Ssn, lblRel3Ssn, lblRel3Age, lblRel3Relationship, rel3NameTF, lblRel3Name, lblRelation3, rel4Ssn, lblRel4Ssn, lblRel4Age, lblRel4Relationship, rel4NameTF, lblRel4Name, lblRelation4, rel2RelationshipComboBox, rel3RelationshipComboBox, rel4RelationshipComboBox, lblIncome, lblExpenses, lblSalary, lblSocialSecurity, lblUtilityAssistance, lblUnemployment, lblDisability, lblFoodStamps, lblTanf, lblChildSupport, lblIncomeOther, lblRent, lblLightBill, lblPhoneBill, lblCableTv, lblCarPayment, lblDoctor, lblGas, lblFurn, lblExpensesOther, lblIncomeTotal, lblExpensesTotal, lblNetIncome, salaryFTF, socialSecurityFTF, utilityFTF, unemploymentFTF, disabilityFTF, foodStampsFTF, tanfFTF, childSupportFTF, otherIncomeFTF, rentFTF, lightBillFTF, phoneBillFTF, cableBillFTF, carPaymentFTF, doctorFTF, gasFTF, furnFTF, expensesOtherFTF, rel2AgeComboBox, rel3AgeComboBox, rel4AgeComboBox, incomeOutput, expensesOutput, netIncomeOutput}));
		tabbedPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{raceComboBox, otherRaceTF, childFirstNameTF, childMiddleNameTF, childLastNameTF, childPreferredNameTF, genderComboBox, otherGenderTF, monthComboBox, dayComboBox, yearComboBox, subdivisionTF, ownershipComboBox, leaseMonthComboBox, LeaseDayComboBox, LeaseYearComboBox, gradeComboBox, childStreetTF, childCityTF, childHomePhoneFTF, childssnFTF, childZipFTF, parentPanel, motherFirstNameTF, MotherLastNameTF, motherAddressTF, motherEmploymentTF, motherOccupationTF, MotherEmailTF, fatherFirstNameTF, fatherLastNameTF, fatherAddressTF, fatherEmploymentTF, fatherOccupationTF, fatherEmailTF, motherMiddleInitialFTF, motherHomePhoneFTF, motherWorkPhoneFTF, motherCellPhoneFTF, fatherMiddleInitialFTF, fatherHomePhoneFTF, fatherWorkPhoneFTF, fatherCellPhoneFTF, checkOtherTF, financialPanel, chckbxMother, chckbxFather, chckbxOther}));
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{studentPanel, lblChildFirstName, lblChildMiddleName, lblChildLastName, lblChildPreferredName, lblChildSsn, lblChildRace, raceComboBox, otherRaceTF, childFirstNameTF, childMiddleNameTF, tabbedPane, childLastNameTF, childPreferredNameTF, lblChildGender, genderComboBox, otherGenderTF, lblChildDateOfBirth, monthComboBox, dayComboBox, yearComboBox, lblStudentInstructions, lblStudentHeading, lblSubdivision, subdivisionTF, lblHousingHeading, ownershipComboBox, lblLeaseExpirationDate, leaseMonthComboBox, LeaseDayComboBox, LeaseYearComboBox, lblChildGrade, gradeComboBox, lblStreetAddress, childStreetTF, lblCity, childCityTF, lblZip, lblHomePhone, childHomePhoneFTF, childssnFTF, childZipFTF, childTextArea, lblTextAreaInstructions, lblSpecialServices, chckbxGifted, chckbxSpediep, chckbxSpeech, chckbxELL, lblLifeThreateningAllergy, allergyTF, lblEmergencyContact, emergencyPhone1FTF, lblEmergencyPhone1, lblEmergencyName1, lblEmergencyRelationship, emergencyNameTF, emergencyRelationshipTF, lblEmergencyName2, emergencyName2TF, lblEmergencyRelationship2, emergencyRelationComboBox, lblEmergencyPhone2, emergencyPhone2FTF, lblMSE, radioYes, radioNo, label, parentPanel, lblParentHeading, lblMotherHeading, lblMotherFirstName, lblMiddleInitial, motherFirstNameTF, lblMotherLastName, MotherLastNameTF, lblMotherHomePhone, lblMotherWorkPhone, lblMotherCell, lblNewLabel, motherAddressTF, lblMotherEmployment, motherEmploymentTF, lblMotherOccupation, motherOccupationTF, lblMotherEmail, MotherEmailTF, lblFatherHeading, lblFatherFirstName, fatherFirstNameTF, lblFatherMiddleInitial, lblFatherLastName, fatherLastNameTF, lblFatherHomePhone, lblFatherWorkPhone, lblFatherCellPhone, lblFatherAddress, fatherAddressTF, lblFatherEmployment, fatherEmploymentTF, lblFatherOccupation, fatherOccupationTF, lblFatherEmail, fatherEmailTF, motherMiddleInitialFTF, motherHomePhoneFTF, motherWorkPhoneFTF, motherCellPhoneFTF, fatherMiddleInitialFTF, fatherHomePhoneFTF, fatherWorkPhoneFTF, fatherCellPhoneFTF, lblChildRelation, lblChildLivesWith, chckbxMother, chckbxFather, chckbxOther, checkOtherTF, lblSiblings, lblSibling, label_1, label_2, lblSib1Name, lblSib1DoB, lblSib1Grade, lblSib1School, sib1NameTF, sib1SchoolTF, sib1MonthComboBox, sib1DayComboBox, sib1YearComboBox, sib1GradeComboBox, sib2SchoolTF, lblSib2School, lblSib2Grade, sib2GradeComboBox, lblSib2DoB, sib2MonthComboBox, sib2DayComboBox, sib2YearComboBox, sib2NameTF, lblSib2Name, sib3SchoolTF, lblSib3School, lblSib3Grade, sib3GradeComboBox, lblSib3DoB, sib3MonthComboBox, sib3DayComboBox, sib3YearComboBox, sib3NameTF, lblSib3Name, financialPanel, lblRelation1, lblRel1Name, lblRel1Relationship, lblRel1Age, lblRel1Ssn, rel1NameTF, rel1Ssn, rel2Ssn, lblRel2Ssn, lblRel2Age, lblRel2Relationship, rel2NameTF, lblRel2Name, lblRelation2, rel3Ssn, lblRel3Ssn, lblRel3Age, lblRel3Relationship, rel3NameTF, lblRel3Name, lblRelation3, rel4Ssn, lblRel4Ssn, lblRel4Age, lblRel4Relationship, rel4NameTF, lblRel4Name, lblRelation4, rel1RelationshipComboBox, rel2RelationshipComboBox, rel3RelationshipComboBox, rel4RelationshipComboBox, lblFinancialHeading, lblRelationships, lblNewLabel_1, lblIncome, lblExpenses, lblSalary, lblSocialSecurity, lblUtilityAssistance, lblUnemployment, lblDisability, lblFoodStamps, lblTanf, lblChildSupport, lblIncomeOther, lblRent, lblLightBill, lblPhoneBill, lblCableTv, lblCarPayment, lblDoctor, lblGas, lblFurn, lblExpensesOther, lblIncomeTotal, lblExpensesTotal, lblNetIncome, salaryFTF, socialSecurityFTF, utilityFTF, unemploymentFTF, disabilityFTF, foodStampsFTF, tanfFTF, childSupportFTF, otherIncomeFTF, rentFTF, lightBillFTF, phoneBillFTF, cableBillFTF, carPaymentFTF, doctorFTF, gasFTF, furnFTF, expensesOtherFTF, rel1AgeComboBox, rel2AgeComboBox, rel3AgeComboBox, rel4AgeComboBox, incomeOutput, expensesOutput, netIncomeOutput}));
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{raceComboBox, otherRaceTF, childFirstNameTF, childMiddleNameTF, childLastNameTF, childPreferredNameTF, lblChildGender, genderComboBox, otherGenderTF, lblChildDateOfBirth, monthComboBox, dayComboBox, yearComboBox, lblStudentInstructions, lblStudentHeading, lblSubdivision, subdivisionTF, lblHousingHeading, ownershipComboBox, lblLeaseExpirationDate, leaseMonthComboBox, LeaseDayComboBox, LeaseYearComboBox, lblChildGrade, gradeComboBox, lblStreetAddress, childStreetTF, lblCity, childCityTF, childHomePhoneFTF, childssnFTF, childZipFTF, parentPanel, motherFirstNameTF, motherAddressTF, motherEmploymentTF, motherOccupationTF, MotherEmailTF, fatherFirstNameTF, fatherLastNameTF, fatherAddressTF, fatherEmploymentTF, fatherOccupationTF, fatherEmailTF, motherMiddleInitialFTF, motherHomePhoneFTF, motherWorkPhoneFTF, motherCellPhoneFTF, fatherMiddleInitialFTF, fatherHomePhoneFTF, fatherWorkPhoneFTF, fatherCellPhoneFTF, chckbxMother, chckbxFather, chckbxOther, checkOtherTF, financialPanel, rel1NameTF, rel1Ssn, rel2Ssn, rel2NameTF, lblRel2Name, lblRelation2, rel3Ssn, rel3NameTF, rel4Ssn, rel4NameTF, rel1RelationshipComboBox, rel2RelationshipComboBox, rel3RelationshipComboBox, rel4RelationshipComboBox}));
	}

	//Makes a text field appear to contain an alternate race
	protected void do_RaceComboBox_actionPerformed(ActionEvent arg0) {
		if(raceComboBox.getSelectedItem().toString().equals("Other")){
			otherRaceTF.setVisible(true);
		}
	}
	
	//Makes a text field appear to contain an alternate gender
	protected void do_comboBox_actionPerformed(ActionEvent arg0) {
		if(genderComboBox.getSelectedItem().toString().equals("Other"))
			otherGenderTF.setVisible(true);
	}
	
	//makes text field appear or dissappear for lease details depending on whether "lease" or "own" is checked
	protected void do_owndershipComboBox_actionPerformed(ActionEvent arg0) {
		if(ownershipComboBox.getSelectedItem().toString().equals("Lease")){
			lblLeaseExpirationDate.setVisible(true);
			leaseMonthComboBox.setVisible(true);
			LeaseDayComboBox.setVisible(true);
			LeaseYearComboBox.setVisible(true);
		}
		else if(ownershipComboBox.getSelectedItem().toString().equals("Own")){
			lblLeaseExpirationDate.setVisible(false);
			leaseMonthComboBox.setVisible(false);
			LeaseDayComboBox.setVisible(false);
			LeaseYearComboBox.setVisible(false);
		}
	}
	
	//makes the text field for who child lives with appear or disappear depending on whether the check box is checked or not
	protected void do_chckbxOther_actionPerformed(ActionEvent arg0) {
		if(chckbxOther.isSelected())
			checkOtherTF.setVisible(true);
		else if(! chckbxOther.isSelected())
			checkOtherTF.setVisible(false);
			
	}
	
	//checks to see if student's first name is entered. If not, a dialogue appears and label is set to red
	protected void do_childFirstNameTF_focusLost(FocusEvent arg0) {
		if(childFirstNameTF.getText().isEmpty()){
			lblChildFirstName.setForeground(Color.RED);
		}
		else if(! childFirstNameTF.getText().isEmpty()){
			lblChildFirstName.setForeground(Color.BLACK);
		}
	}
	
	//checks to see if student's last name is entered. If not, a dialogue appears and label is set to red
	protected void do_childLastNameTF_focusLost(FocusEvent arg0) {
		if(childLastNameTF.getText().isEmpty()){
			lblChildLastName.setForeground(Color.RED);
		}
		else if(! childFirstNameTF.getText().isEmpty()){
			lblChildLastName.setForeground(Color.BLACK);
		}
	}
	
	//checks to see if student's SSN name is entered. If not, a dialogue appears and label is set to red
	protected void do_childssnFTF_focusLost(FocusEvent arg0) {
		if(childssnFTF.isValid()){
			lblChildSsn.setForeground(Color.RED);
		}
		else if(! childFirstNameTF.isValid()){
			lblChildSsn.setForeground(Color.BLACK);
		}
	}
	
	//checks to see if student's gender is selected. If not, a dialogue appears and label is set to red
	protected void do_genderComboBox_focusLost(FocusEvent arg0) {
		if(genderComboBox.getSelectedItem().toString().equals("Select")){
			lblChildGender.setForeground(Color.RED);
		}
		else if(! childFirstNameTF.isValid()){
			lblChildGender.setForeground(Color.BLACK);
		}
	}
	
	//Changes gender label to red if empty
	protected void do_otherGenderTF_focusLost(FocusEvent arg0) {
		if(otherGenderTF.getText().isEmpty()){
			lblChildGender.setForeground(Color.RED);
		}
		else if(! childFirstNameTF.getText().isEmpty()){
			lblChildGender.setForeground(Color.BLACK);
		}
	}
	
	//changes race label to red if empty
	protected void do_raceComboBox_focusLost(FocusEvent arg0) {
		if(raceComboBox.getSelectedItem().toString().equals("Select")){
			lblChildRace.setForeground(Color.RED);
		}
		else if(! childFirstNameTF.isValid()){
			lblChildRace.setForeground(Color.BLACK);
		}
	}
	//changes race label to red if empty
	protected void do_otherRaceTF_focusLost(FocusEvent arg0) {
		if(otherRaceTF.getText().isEmpty()){
			lblChildRace.setForeground(Color.RED);
		}
		else if(! childFirstNameTF.getText().isEmpty()){
			lblChildRace.setForeground(Color.BLACK);
		}
	}
	//changes DoB label to red if empty
	protected void do_monthComboBox_focusLost(FocusEvent arg0) {
		if(monthComboBox.getSelectedItem().toString().equals("Month")){
			lblChildDateOfBirth.setForeground(Color.RED);
		}
		else if(! childFirstNameTF.isValid()){
			lblChildDateOfBirth.setForeground(Color.BLACK);
		}
	}
	
	//Updates Income Total every time a field is updated
	protected void do_childSupportFTF_propertyChange(PropertyChangeEvent arg0) {
		setIncomeTotal();
	}
	//Updates Income Total every time a field is updated
	protected void do_utilityFTF_propertyChange(PropertyChangeEvent arg0) {
		setIncomeTotal();
	}
	//Updates Income Total every time a field is updated
	protected void do_otherIncomeFTF_propertyChange(PropertyChangeEvent arg0) {
		setIncomeTotal();
	}
	//Updates Income Total every time a field is updated
	protected void do_salaryFTF_propertyChange(PropertyChangeEvent arg0) {
		setIncomeTotal();
	}
	//Updates Income Total every time a field is updated
	protected void do_unemploymentFTF_propertyChange(PropertyChangeEvent arg0) {
		setIncomeTotal();
	}
	//Updates Income Total every time a field is updated
	protected void do_tanfFTF_propertyChange(PropertyChangeEvent arg0) {
		setIncomeTotal();
	}
	//Updates Income Total every time a field is updated
	protected void do_foodStampsFTF_propertyChange(PropertyChangeEvent arg0) {
		setIncomeTotal();
	}
	//Updates Income Total every time a field is updated
	protected void do_socialSecurityFTF_propertyChange(PropertyChangeEvent arg0) {
		setIncomeTotal();
	}
	//Updates Income Total every time a field is updated
	protected void do_disabilityFTF_propertyChange(PropertyChangeEvent arg0) {
		setIncomeTotal();
	}
	
	//Sets the total income by inserting it into a string
	public void setIncomeTotal(){
		incomeOutput.setText("$" + getIncomeTotal());
		netIncomeOutput.setText("$" + (getIncomeTotal() - getExpensesTotal()));
	}
	
	//returns the total income as a double
	public double getIncomeTotal(){
		double incomeTotal = (((Number)(salaryFTF.getValue())).doubleValue()
				+ ((Number)(socialSecurityFTF.getValue())).doubleValue()
				+ ((Number)(utilityFTF.getValue())).doubleValue()
				+ ((Number)(unemploymentFTF.getValue())).doubleValue()
				+ ((Number)(disabilityFTF.getValue())).doubleValue()
				+ ((Number)(foodStampsFTF.getValue())).doubleValue()
				+ ((Number)(childSupportFTF.getValue())).doubleValue()
				+ ((Number)(otherIncomeFTF.getValue())).doubleValue()
				+ ((Number)(tanfFTF.getValue())).doubleValue() );
		
		return incomeTotal;
	}
	
	//Sets the total expenses by inserting it into a string
		public void setExpensesTotal(){
			expensesOutput.setText("$" + getExpensesTotal());
			netIncomeOutput.setText("$" + getNetIncome());
		}
	
	//returns the expenses income as a double
	public double getExpensesTotal(){
		double expensesTotal = (((Number)(rentFTF.getValue())).doubleValue()
				+ ((Number)(lightBillFTF.getValue())).doubleValue()
				+ ((Number)(phoneBillFTF.getValue())).doubleValue()
				+ ((Number)(cableBillFTF.getValue())).doubleValue()
				+ ((Number)(carPaymentFTF.getValue())).doubleValue()
				+ ((Number)(doctorFTF.getValue())).doubleValue()
				+ ((Number)(gasFTF.getValue())).doubleValue()
				+ ((Number)(furnFTF.getValue())).doubleValue()
				+ ((Number)(expensesOtherFTF.getValue())).doubleValue());
		
		return expensesTotal;
	}
	
	//Sets net income to red if it is a negative number
	public double getNetIncome(){
		double netIncome = getIncomeTotal() - getExpensesTotal();
		if(netIncome < 0){
			netIncomeOutput.setForeground(Color.RED);
		}
		return netIncome;
	}
	
	//updates expense totals
	protected void do_expensesOtherFTF_propertyChange(PropertyChangeEvent arg0) {
		setExpensesTotal();
	}
	//updates expense totals
	protected void do_carPaymentFTF_propertyChange(PropertyChangeEvent arg0) {
		setExpensesTotal();
	}
	//updates expense totals
	protected void do_rentFTF_propertyChange(PropertyChangeEvent arg0) {
		setExpensesTotal();
	}
	//updates expense totals
	protected void do_phoneBillFTF_propertyChange(PropertyChangeEvent arg0) {
		setExpensesTotal();
	}
	//updates expense totals
	protected void do_gasFTF_propertyChange(PropertyChangeEvent arg0) {
		setExpensesTotal();
	}
	//updates expense totals
	protected void do_furnFTF_propertyChange(PropertyChangeEvent arg0) {
		setExpensesTotal();
	}
	//updates expense totals
	protected void do_cableBillFTF_propertyChange(PropertyChangeEvent arg0) {
		setExpensesTotal();
	}
	//updates expense totals
	protected void do_lightBillFTF_propertyChange(PropertyChangeEvent arg0) {
		setExpensesTotal();
	}
	//updates expense totals
	protected void do_doctorFTF_propertyChange(PropertyChangeEvent arg0) {
		setExpensesTotal();
	}
	
	//clears all text fields and creates new form
	protected void do_mntmStartNewForm_actionPerformed(ActionEvent arg0) {
		this.dispose();
		main(null);
	}
	
	//exits application upon file -> exit
	protected void do_mntmExit_actionPerformed(ActionEvent arg0) {
		this.dispose();
	}
	
	
	//launches student help window
	protected void do_mntmStudentIHelp_actionPerformed(ActionEvent arg0) {
		DelVecchioMCSRStudentHelpFrame studentHelpFrame = new DelVecchioMCSRStudentHelpFrame();
		studentHelpFrame.setVisible(true);
		
	}
	
	//launches parent help window
	protected void do_mntmParentHelp_actionPerformed(ActionEvent arg0) {
		DelVecchioMCSRParentHelpFrame ParentHelpFrame = new DelVecchioMCSRParentHelpFrame();
		ParentHelpFrame.setVisible(true);
	}
	
	//launches financial help window
	protected void do_mntmFinancialHelp_actionPerformed(ActionEvent arg0) {
		DelVecchioMCSRFinancialHelpFrame financialHelpFrame = new DelVecchioMCSRFinancialHelpFrame();
		financialHelpFrame.setVisible(true);
	}
}
