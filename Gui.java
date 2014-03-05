import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui extends JFrame implements ActionListener
{//Creates the GUI(The Window that will appear on screen)

	
	JFrame frame = new JFrame();
	TextField birthDate = new TextField("DD",5);
	TextField birthMonth = new TextField("MM",5);
	TextField birthYear = new TextField("YYYY",5);
	TextField Age = new TextField("Age",5);
	TextArea Answers = new TextArea();
	JButton btn = new JButton("Start");
	JButton btnClear = new JButton("Clear");
	JButton btnReset = new JButton("Reset");
	
	public Gui()
	{//Ads all the components to be displayed on the window
		getContentPane().setBackground(Color.darkGray);
		getContentPane().setForeground(Color.gray);
		setTitle("Numerology");
		setSize(350,300);
		setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		add(birthDate);
		add(birthMonth);
		add(birthYear);
		add(Age); 
		add(btnClear);
		add(btn);
		btn.setBackground(Color.green);
		btn.addActionListener(this);
		add(Answers);
		Answers.setEditable(false);
		Answers.setForeground(Color.black);
		add(btnReset);
		
		setMinimumSize(new Dimension(990,225));
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
		pack();
		
		btnClear.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{//Clears all values
				birthDate.setText("");
				birthMonth.setText("");
				birthYear.setText("");
				Age.setText("");
			}
		});
		btnReset.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Answers.setText("");
			}
		});
		
	}
	
	public void actionPerformed(ActionEvent event)
	{//Shows the final calculations done
		frame.setFocusable(true);
		btn.setMnemonic(KeyEvent.VK_ENTER);
		if(birthDate.getText().equals(null) ||birthMonth.getText().equals(null) 
	||birthYear.getText().equals(null) ||Age.getText().equals(null)
	||birthDate.getText().equals("DD") ||birthMonth.getText().equals("MM")
	||birthYear.getText().equals("YYYY")||Age.getText().equals("Age"))
			Answers.setText("Please Fill in all blanks! \n");
		
		int DAY= Integer.parseInt(birthDate.getText());
		int MONTH = Integer.parseInt(birthMonth.getText());
		int YEAR =Integer.parseInt(birthYear.getText());
		int AGE = Integer.parseInt(Age.getText());
		
		Birthday NumerPerson = new Birthday(DAY,MONTH,YEAR);
		NumerPerson.CalculateBirthday();
		for(int x=0;x<10;x++)
		{
		Answers.append(NumerPerson.AgeCalculate(AGE+x)+"\n");
		}
		Answers.append("------------------------------------ \n");
	}
	
}



