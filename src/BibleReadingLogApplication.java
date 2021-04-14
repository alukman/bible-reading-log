import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import org.apache.poi.ss.usermodel.Workbook;
 


public class BibleReadingLogApplication{
	
	//GUI VARIABLES
	private JFrame frame;
	
	private JPanel container;
	private JPanel datePanel;
	private JPanel buttonPanel;
	private JPanel saveUndoPanel;
	private JPanel newPersonPanel;
	
	private JButton[] buttons;
	private final static int NUM_BUTTONS = PeopleListButtons.getNumOfButtons();
	private JButton saveButton;
	private JButton undoButton;
	private JButton addButton;
	
	private JTextField newStudentEntry;
	
	int selectedButtonNumber = 0;
	
	GridBagConstraints gbc = new GridBagConstraints();
	
	boolean historyIsEmpty = true;  //History is always empty at start of application
	
	private String excelFilePath = "/Users/andrewwidjaja/Dropbox/JavaProgram/BibleReadingLogApplication/";
	
	private static List<String> rawData = Arrays.asList();
	private static String[] names = new String[NUM_BUTTONS];
	private static int[] attendances = new int[NUM_BUTTONS];

	public BibleReadingLogApplication() {
		
		frame = new JFrame();
		
		buttons = new JButton[NUM_BUTTONS+1];
		saveButton = new JButton("Save");
		undoButton = new JButton("Undo");
		addButton = new JButton("+");
		
		container = new JPanel();
		datePanel = new JPanel();
		buttonPanel = new PeopleListButtons();
		saveUndoPanel = new JPanel();
		newPersonPanel = new JPanel();
		
		newStudentEntry = new JTextField("(Type New Student Name)");
		
		//SETTING COLOR OF PANELS
		container.setBackground(Color.black);
		buttonPanel.setBackground(Color.gray);
		datePanel.setBackground(Color.cyan);
		saveUndoPanel.setBackground(Color.yellow);
		newPersonPanel.setBackground(Color.gray);
	
		container.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));
		container.setLayout(new GridBagLayout());
		
		datePanel.add(new JLabel("Date: " + getCurrentDate()));
		
		buttonPanel.setLayout(new GridLayout(NUM_BUTTONS,1));
		saveUndoPanel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		saveUndoPanel.add(saveButton);
		saveUndoPanel.add(undoButton);
		
		newStudentEntry.setSize(90, 90);
		newPersonPanel.add(newStudentEntry);
		newPersonPanel.add(addButton);
		newPersonPanel.setSize(100, 100);
		
		
		//GridBagConstraint (gbc) is fixing the main "container" layout
		gbc.gridx = 0;
		gbc.gridy = 0;
		container.add(datePanel, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		container.add(buttonPanel, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		container.add(saveUndoPanel, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 3;
		container.add(newPersonPanel, gbc);
		
		
		
		//SAVE AND UNDO BUTTON FUNCTIONALITY
		undoButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				historyIsEmpty = ((PeopleListButtons) buttonPanel).undoButton();
			}
		});
		
		saveButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					((PeopleListButtons) buttonPanel).saveButton(excelFilePath, names, attendances);
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null, "ERROR: There was a problem while saving file.");
					e1.printStackTrace();
				}
			}
		});
		
		addButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String empty = ((PeopleListButtons) buttonPanel).addButton(newStudentEntry.getText());
				newStudentEntry.setText(empty);
			}
			
		});
		
		
		JScrollPane scrollPanel = new JScrollPane(buttonPanel);
		buttonPanel.setAutoscrolls(true);
		scrollPanel.setPreferredSize(new Dimension( 300,375));
		container.add(scrollPanel);
		
		frame.add(container, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Bible Reading Log App");
		frame.pack();
		frame.setVisible(true);
		
	}

	
	public static void main(String[] args) throws IOException {
		
		ExcelReader reader = new ExcelReader();
		rawData = reader.loadInData();
		processRawData();
		new BibleReadingLogApplication();

	}

	
	public static String getCurrentDate()
	{
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date(System.currentTimeMillis());
		return formatter.format(date);
	}
	
	public static void processRawData() {
		for (int i = 0; i < rawData.size(); i = i + 2)
		{
			names[i/2] = rawData.get(i);
			attendances[i/2] = Integer.parseInt(rawData.get(i+1).toString().substring(0,rawData.get(i+1).toString().length()-2));
		}
		
	}

}
