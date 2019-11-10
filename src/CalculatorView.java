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
    
    public int getFirstNumber(){   // gets the number inputted into the text field on the panel.
    	return Integer.parseInt(firstNumber.getText());

    	    }
    
    public int getSecondNumber(){   // gets the number inputted into the text field on the panel.
    	return Integer.parseInt(secondNumber.getText());

    	    }
    
    public int getCalcSolution(){   // gets the number inputted into the text field on the panel.
    	return Integer.parseInt(calcSolution.getText());

    	    }
    
    public void setCalcSolution(int solution){
    	
        calcSolution.setText(Integer.toString(solution));  // this is where eventually we will pass in the solution which is worked out in the model  so it can be displayed to the user.

    	
    }
    
    void addCalculateListener(ActionListener listenForCalcButton){   // a listener that executes a method in the controller called listenForCalcButton when the button is clicked.
    	
        calculateButton.addActionListener(listenForCalcButton);

    	
    }
    
    void displayErrorMessage(String errorMessage){
    	
        JOptionPane.showMessageDialog(this, errorMessage);  //  built in method of the J option package that can display error for you

    	
    }

    

    
    
    	
    }
    

 
 
