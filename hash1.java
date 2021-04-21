import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class hash1 {

	private JFrame frame;
	private JTextField name;
	private JLabel lblStudentId;
	private JLabel lblSection;
	private JLabel lblEnrollment;
	private JTextField sid;
	private JTextField section;
	private JTextField enrollment;
	private JTable table;

	int row;
	ArrayList<Student> studentList;
	DefaultTableModel dtm;
	String header[] = new String[] { "Student Name", "Student ID", "Section", "Enrollment" };

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentAttendanceClass window = new StudentAttendanceClass();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void displayStudentDetails() {
		dtm.setRowCount(0);
		for (int i = 0; i < studentList.size(); i++) {
			Object[] obj = { studentList.get(i).name, studentList.get(i).sid, studentList.get(i).section,
					studentList.get(i).enrollment };
			dtm.addRow(obj);

		}

	}

	/**
	 * Create the application.
	 */
	public StudentAttendanceClass() {
		initialize();
		studentList= new ArrayList<>();
		dtm=new DefualtTableModel(header,0)
		table.setModel(dtm);
		
	
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 862, 508);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Student Name");
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 27, 99, 27);
		frame.getContentPane().add(lblNewLabel);

		name = new JTextField();
		name.setBackground(Color.LIGHT_GRAY);
		name.setBounds(108, 30, 116, 20);
		frame.getContentPane().add(name);
		name.setColumns(10);

		lblStudentId = new JLabel("Student ID");
		lblStudentId.setFont(new Font("Georgia", Font.BOLD, 11));
		lblStudentId.setBounds(10, 51, 87, 27);
		frame.getContentPane().add(lblStudentId);

		lblSection = new JLabel("Section");
		lblSection.setFont(new Font("Georgia", Font.BOLD, 11));
		lblSection.setBounds(10, 79, 87, 27);
		frame.getContentPane().add(lblSection);

		lblEnrollment = new JLabel("Enrollment");
		lblEnrollment.setFont(new Font("Georgia", Font.BOLD, 11));
		lblEnrollment.setBounds(10, 107, 87, 27);
		frame.getContentPane().add(lblEnrollment);

		sid = new JTextField();
		sid.setBackground(Color.LIGHT_GRAY);
		sid.setColumns(10);
		sid.setBounds(108, 61, 116, 20);
		frame.getContentPane().add(sid);

		section = new JTextField();
		section.setBackground(Color.LIGHT_GRAY);
		section.setColumns(10);
		section.setBounds(108, 89, 116, 20);
		frame.getContentPane().add(section);

		enrollment = new JTextField();
		enrollment.setBackground(Color.LIGHT_GRAY);
		enrollment.setColumns(10);
		enrollment.setBounds(108, 114, 116, 20);
		frame.getContentPane().add(enrollment);

		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Student data = new Student(name.getText(), sid.getText(), section.getText(), enrollment.getText());
				StudentList.add(data);
				displayStudentDetails();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setBounds(10, 232, 89, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnDelete = new JButton("Delete ");
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnDelete.setBackground(Color.DARK_GRAY);
		btnDelete.setBounds(10, 266, 89, 23);
		frame.getContentPane().add(btnDelete);

		JButton btnUpdate = new JButton("Update");
		btnUpdate.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnUpdate.setBackground(Color.DARK_GRAY);
		btnUpdate.setBounds(10, 300, 89, 23);
		frame.getContentPane().add(btnUpdate);

		JButton btnRefresh = new JButton("Refresh  ");
		btnRefresh.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnRefresh.setBackground(Color.DARK_GRAY);
		btnRefresh.setBounds(10, 334, 89, 23);
		frame.getContentPane().add(btnRefresh);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(230, 11, 606, 432);
		frame.getContentPane().add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		table.setBackground(Color.GRAY);
		table.setForeground(Color.WHITE);
	}
}

public class StudentInformation {

	String name, sid, section, enrollment;

	public StudentInformation(String name, String sid, String section, String enrollment) {

		this.name = name;
		this.sid = sid;
		this.section = section;
		this.enrollment = enrollment;

	}

}