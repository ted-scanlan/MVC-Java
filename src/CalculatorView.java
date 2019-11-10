import java.awt.event.ActionListener;


import javax.swing.*;


public class CalculatorView extends JFrame {
	
	private JTextField firstNumber  = new JTextField(10);
    private JLabel additionLabel = new JLabel("+");
    private JTextField secondNumber = new JTextField(10);
    private JButton calculateButton = new JButton("Calculate");
    private JTextField calcSolution = new JTextField(10);
    
    CalculatorView(){ 
    	
    	JPanel calcPanel = new JPanel();  //creates a new object of Jpanel i.e. a window
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setSize(600, 200);

        calcPanel.add(firstNumber);   // adds our fields and buttons to the panel we've just created.
        calcPanel.add(additionLabel);
        calcPanel.add(secondNumber);
        calcPanel.add(calculateButton);
        calcPanel.add(calcSolution); 
        
        this.add(calcPanel);   // adding the panel to the view we are making

 

    }
 




	

}
