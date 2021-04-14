import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.apache.poi.ss.usermodel.Workbook;


/**
 * 
 * ---------- HOW TO ADD NEW PERSON/BUTTON (click plus button read more) ----------
 * 
 * 
 * 1. Add JButton to member variables
 * 
 * 2. Add a new    !!!! MAKE SURE NUMBERS ARE CORRECT !!!!
 *    button1 = new JButton("Andrew Lukman");
 *		   button1.addActionListener(new ActionListener() {
 *			   @Override
 *			   public void actionPerformed(ActionEvent e) {
 *				   if (!clickedButtonsArray[1 - ADJ]) {
 *					   button1.setText(button1.getText() + "\n ATTENDANCE ADDED");
 *					   clickedButtonsArray[1 - ADJ] = true;
 *					   clickHistory.add(button1);
 *				   }
 *			   }	
 *		   });
 *
 * 3. Add in method "private void addAllButtons()"
 * 
 * 4. Increment NUM_BUTTONS up one.
 * 
 * 5. Add to PeopleList.java?
 * 
 * 
 */





public class PeopleListButtons extends JPanel{
	
	private final static int NUM_BUTTONS = 25;
	
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton button10;
	private JButton button11;
	private JButton button12;
	private JButton button13;
	private JButton button14;
	private JButton button15;
	private JButton button16;
	private JButton button17;
	private JButton button18;
	private JButton button19;
	private JButton button20;
	private JButton button21;
	private JButton button22;
	private JButton button23;
	private JButton button24;
	private JButton button25;
	
	private JButton[] buttonArray;
	private boolean[] clickedButtonsArray = new boolean[this.NUM_BUTTONS];
	private ArrayList<JButton> clickHistory = new ArrayList<>();
	private PeopleList excellList;
	
	
	//*************************** BEGINNING OF MAIN CONSTRUCTOR ***************************
	public PeopleListButtons() {
		
		final int ADJ = 1; //Because Arrays start at 0, I started buttons at 1.
		
		this.initializeClickedButtons(); //Initializes the clickedButtonsArray to all false.
		
		
		button1 = new JButton("Andrew Lukman");
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!clickedButtonsArray[1 - ADJ]) {
					button1.setText(button1.getText() + "\n ATTENDANCE ADDED");
					clickedButtonsArray[1 - ADJ] = true;
					clickHistory.add(button1);
				}
			}	
		});
		
		
		button2 = new JButton("Annabelle");
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!clickedButtonsArray[2 - ADJ]) {
					button2.setText(button2.getText() + "\n ATTENDANCE ADDED");
					clickedButtonsArray[2 - ADJ] = true;
					clickHistory.add(button2);
				}
			}	
		});
		
		
		button3 = new JButton("Billy");
		button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!clickedButtonsArray[3 - ADJ]) {
					button3.setText(button3.getText() + "\n ATTENDANCE ADDED");
					clickedButtonsArray[3 - ADJ] = true;
					clickHistory.add(button3);
				}
			}	
		});
		
		
		button4 = new JButton("Bryan");
		button4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!clickedButtonsArray[4 - ADJ]) {
					button4.setText(button4.getText() + "\n ATTENDANCE ADDED");
					clickedButtonsArray[4 - ADJ] = true;
					clickHistory.add(button4);
				}
			}	
		});
		
		
		button5 = new JButton("Bryce");
		button5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!clickedButtonsArray[5 - ADJ]) {
					button5.setText(button5.getText() + "\n ATTENDANCE ADDED");
					clickedButtonsArray[5 - ADJ] = true;
					clickHistory.add(button5);
				}
			}	
		});
		
		
		button6 = new JButton("Charlotte");
		button6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!clickedButtonsArray[6 - ADJ]) {
					button6.setText(button6.getText() + "\n ATTENDANCE ADDED");
					clickedButtonsArray[6 - ADJ] = true;
					clickHistory.add(button6);
				}
			}	
		});
		
		
		button7 = new JButton("Cherryl");
		button7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!clickedButtonsArray[7 - ADJ]) {
					button7.setText(button7.getText() + "\n ATTENDANCE ADDED");
					clickedButtonsArray[7 - ADJ] = true;
					clickHistory.add(button7);
				}
			}	
		});
		
		
		button8 = new JButton("Daniel Lauw");
		button8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!clickedButtonsArray[8 - ADJ]) {
					button8.setText(button8.getText() + "\n ATTENDANCE ADDED");
					clickedButtonsArray[8 - ADJ] = true;
					clickHistory.add(button8);
				}
			}	
		});
		
		
		button9 = new JButton("Gitta");
		button9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!clickedButtonsArray[9 - ADJ]) {
					button9.setText(button9.getText() + "\n ATTENDANCE ADDED");
					clickedButtonsArray[9 - ADJ] = true;
					clickHistory.add(button9);
				}
			}	
		});
		
		
		button10 = new JButton("Ivan");
		button10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!clickedButtonsArray[10 - ADJ]) {
					button10.setText(button10.getText() + "\n ATTENDANCE ADDED");
					clickedButtonsArray[10 - ADJ] = true;
					clickHistory.add(button10);
				}
			}	
		});
		
		
		button11 = new JButton("Juan");
		button11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!clickedButtonsArray[11 - ADJ]) {
					button11.setText(button11.getText() + "\n ATTENDANCE ADDED");
					clickedButtonsArray[11 - ADJ] = true;
					clickHistory.add(button11);
				}
			}	
		});
		
		
		button12 = new JButton("Kevin Soe");
		button12.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!clickedButtonsArray[12 - ADJ]) {
					button12.setText(button12.getText() + "\n ATTENDANCE ADDED");
					clickedButtonsArray[12 - ADJ] = true;
					clickHistory.add(button12);
				}
			}	
		});
		
		
		button13 = new JButton("Nick");
		button13.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!clickedButtonsArray[13 - ADJ]) {
					button13.setText(button13.getText() + "\n ATTENDANCE ADDED");
					clickedButtonsArray[13 - ADJ] = true;
					clickHistory.add(button13);
				}
			}	
		});
		
		
		button14 = new JButton("Noel");
		button14.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!clickedButtonsArray[14 - ADJ]) {
					button14.setText(button14.getText() + "\n ATTENDANCE ADDED");
					clickedButtonsArray[14 - ADJ] = true;
					clickHistory.add(button14);
				}
			}	
		});
		
		
		button15 = new JButton("Richard");
		button15.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!clickedButtonsArray[15 - ADJ]) {
					button15.setText(button15.getText() + "\n ATTENDANCE ADDED");
					clickedButtonsArray[15 - ADJ] = true;
					clickHistory.add(button15);
				}
			}	
		});
		
		
		button16 = new JButton("Rochelle");
		button16.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!clickedButtonsArray[16 - ADJ]) {
					button16.setText(button16.getText() + "\n ATTENDANCE ADDED");
					clickedButtonsArray[16 - ADJ] = true;
					clickHistory.add(button16);
				}
			}	
		});
		
		
		button17 = new JButton("Sharon");
		button17.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!clickedButtonsArray[17 - ADJ]) {
					button17.setText(button17.getText() + "\n ATTENDANCE ADDED");
					clickedButtonsArray[17 - ADJ] = true;
					clickHistory.add(button17);
				}
			}	
		});
		
		
		button18 = new JButton("Yuvella");
		button18.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!clickedButtonsArray[18 - ADJ]) {
					button18.setText(button18.getText() + "\n ATTENDANCE ADDED");
					clickedButtonsArray[18 - ADJ] = true;
					clickHistory.add(button18);
				}
			}	
		});
		
		
		button19 = new JButton("Jennifer");
		button19.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!clickedButtonsArray[19 - ADJ]) {
					button19.setText(button19.getText() + "\n ATTENDANCE ADDED");
					clickedButtonsArray[19 - ADJ] = true;
					clickHistory.add(button19);
				}
			}	
		});
		
		
		button20 = new JButton("Magdalene");
		button20.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!clickedButtonsArray[20 - ADJ]) {
					button20.setText(button20.getText() + "\n ATTENDANCE ADDED");
					clickedButtonsArray[20 - ADJ] = true;
					clickHistory.add(button20);
				}
			}	
		});
		
		button21 = new JButton("Daniel G");
		button21.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!clickedButtonsArray[21 - ADJ]) {
					button21.setText(button21.getText() + "\n ATTENDANCE ADDED");
					clickedButtonsArray[21 - ADJ] = true;
					clickHistory.add(button21);
				}
			}	
		});
		
		button22 = new JButton("Kevin Tee");
		button22.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!clickedButtonsArray[22 - ADJ]) {
					button22.setText(button22.getText() + "\n ATTENDANCE ADDED");
					clickedButtonsArray[22 - ADJ] = true;
					clickHistory.add(button22);
				}
			}	
		});
		
		button23 = new JButton("John");
		button23.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!clickedButtonsArray[23 - ADJ]) {
					button23.setText(button23.getText() + "\n ATTENDANCE ADDED");
					clickedButtonsArray[23 - ADJ] = true;
					clickHistory.add(button23);
				}
			}	
		});
		
		button24 = new JButton("Michael");
		button24.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!clickedButtonsArray[24 - ADJ]) {
					button24.setText(button24.getText() + "\n ATTENDANCE ADDED");
					clickedButtonsArray[24 - ADJ] = true;
					clickHistory.add(button24);
				}
			}	
		});
		
		button25 = new JButton("Theresia");
		button25.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!clickedButtonsArray[25 - ADJ]) {
					button25.setText(button25.getText() + "\n ATTENDANCE ADDED");
					clickedButtonsArray[25 - ADJ] = true;
					clickHistory.add(button25);
				}
			}	
		});
		
		this.addAllButtons(); //ADDING ALL THE BUTTONS TO PANEL
	}
	//*************************** END OF MAIN CONSTRUCTOR ***************************
	
	
	
	
	
	
	//*********************************** PRIVATE METHODS ***********************************
	// Mostly For initializing and calculating
	
	private int indexOf(JButton buttonName) {     //Algorithm to find indexOf a particular button
		int result = -1;
		for (int i = 0; i < this.NUM_BUTTONS; i++)
		{
			if (this.buttonArray[i].equals(buttonName))
			{
				result = i;
				break;
			}
		}
		return result;
	}
		
	private void initializeClickedButtons() {     //Starts all attendances at false
		for (int i = 0; i < NUM_BUTTONS; i++)
			this.clickedButtonsArray[i] = false;
	}
	
	private void addAllButtons() { 
		
		//Adds button to the Panel
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		this.add(button5);
		this.add(button6);
		this.add(button7);
		this.add(button8);
		this.add(button9);
		this.add(button10);
		this.add(button11);
		this.add(button12);
		this.add(button13);
		this.add(button14);
		this.add(button15);
		this.add(button16);
		this.add(button17);
		this.add(button18);
		this.add(button19);
		this.add(button20);
		this.add(button21);
		this.add(button22);
		this.add(button23);
		this.add(button24);
		this.add(button25);

		//Adds all the buttons to the array called "buttonArray"
		this.buttonArray = new JButton[] {
				button1, button2, button3, button4, button5, 
				button6, button7, button8, button9, button10, button11, button12, 
				button13, button14, button15, button16, button17, button18, button19,
				button20, button21, button22, button23, button24, button25};
	}
	
	
	
	
	
	
	
	//***********************************PUBLIC METHODS***********************************

	public boolean[] getListClickedButtons() {
		return this.clickedButtonsArray;
	}
	
	public ArrayList<JButton> getHistoryList() {
		return this.clickHistory;
	}
	
	public JButton getLastAction() {
		return this.clickHistory.get(clickHistory.size()-1);
	}
	
	
	//Controls Functionality of undoButton in BibleReadingLogApplication
	//returns 0 if History is empty
	public boolean undoButton() {
		boolean historyIsEmpty = true; //ASSUME first history is empty
		
		if(!this.clickHistory.isEmpty()) //CHECK - if history is NOT empty, dive in
		{
			JButton currentButton = this.getLastAction();
			int btnTxtLength = currentButton.getText().length();
			
			//Side note =>  the "- 18" is just the length of string: "ATTENDANCE ADDED"
			currentButton.setText(currentButton.getText().substring(0, btnTxtLength - 18));
			this.clickedButtonsArray[this.indexOf(currentButton)] = false;
			this.clickHistory.remove(this.getLastAction());
			historyIsEmpty = false; //CORRECTION - history is actually not empty
		}
		
		if (historyIsEmpty)
			JOptionPane.showMessageDialog(null, "ERROR: Cannot undo - History is empty.");
		
		return historyIsEmpty;
	}

	
	//Controls Functionality of saveButton in BibleReadingLogApplication
	public void saveButton(String excelFilePath, String[] names, int[] attendances) throws IOException {  
		//console testing
		for (int i = 0; i < this.NUM_BUTTONS; i++)
		System.out.println(i + 1 + ") " + this.clickedButtonsArray[i]);
		System.out.println("-------------------- END OF LIST --------------------");
		System.out.println("");
		System.out.println("");
		
		
		JFileChooser fc = new JFileChooser();
		fc.setCurrentDirectory(new java.io.File("."));
		int returnVal = fc.showSaveDialog(this);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            System.out.println("Saving to: " + file.getName() + ".xlsx");
            ExcelWriterTool excelWriter = new ExcelWriterTool();
    		excellList = new PeopleList(names, attendances);
    		
    		excellList.incrAttendanceBasedOnButtonsClicked(clickedButtonsArray);
    		List<Person> listPerson = excellList.getListPerson();
    		
    		Workbook workbook = excelWriter.getWorkbook(excelFilePath + file.getName() + ".xlsx");
    		excelWriter.writeExcel(listPerson, excelFilePath + file.getName() + ".xlsx", workbook);
    		
    		JOptionPane.showMessageDialog(null, "File " + file.getName() + ".xlsx saved sucessfully.");
        } 
		else {
			JOptionPane.showMessageDialog(null, "File save - CANCELLED");
        	System.out.println("Save cancelled");
        }
	}
	
	public String addButton(String name)
	{
		JOptionPane.showMessageDialog(null, "\"" + name + "\"" +" has been marked to add");
		System.out.println("Manually add: " + name);
		return "";
	}
	
	public static int getNumOfButtons() {
		return NUM_BUTTONS;
	}
	
	public boolean[] getClickedButtonsList() {
		return this.clickedButtonsArray;
	}

}


