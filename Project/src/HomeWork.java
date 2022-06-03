import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HomeWork extends JFrame {
	private double op1 = 0;
	private double op2 = 0;
	private String operator = "+";
	private JLabel status;
	
	public HomeWork() {
		this.setTitle("계산기");
		Image icon = Toolkit.getDefaultToolkit().getImage("calc.gif");
		this.setIconImage(icon);
		this.setBounds(100, 100, 300, 450);
		this.setLayout(new BorderLayout());
		
		JTextField display = new JTextField("0");
		display.setFont( new Font("",0,30));
		display.setFont(new Font("",Font.CENTER_BASELINE, 50));
		display.setHorizontalAlignment(JTextField.RIGHT);
		this.add(BorderLayout.NORTH,display);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(6,4));
		
		//계산하는 거 보여주는 것, 글자 하나 지우기(길이 -1)
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener( e -> {
			if(display.getText().equals("0")) {
				display.setText(btn0.getText());
			} else {
				display.setText(display.getText()+btn0.getText());
			}
		});
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener( e -> {
			if(display.getText().equals("0")) {
				display.setText(btn1.getText());
			} else {
				display.setText(display.getText() + btn1.getText());
			}
		});
		
		//op1 = Double.parseDouble(display.getText());
		//display.setText("4");
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener( e -> {
			if(display.getText().equals("0")) {
				display.setText(btn2.getText());
			} else {
				display.setText(display.getText() + btn2.getText());
			}
		});
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener( e -> {
			if(display.getText().equals("0")) {
				display.setText(btn3.getText());
			} else {
				display.setText(display.getText() + btn3.getText());
			}
		});
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener( e -> {
			if(display.getText().equals("0")) {
				display.setText(btn4.getText());
			} else {
				display.setText(display.getText() + btn4.getText());
			}
		});
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener( e -> {
			if(display.getText().equals("0")) {
				display.setText(btn5.getText());
			} else {
				display.setText(display.getText() + btn5.getText());
			}
		});
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener( e -> {
			if(display.getText().equals("0")) {
				display.setText(btn6.getText());
			} else {
				display.setText(display.getText() + btn6.getText());
			}
		});
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener( e -> {
			if(display.getText().equals("0")) {
				display.setText(btn7.getText());
			} else {
				display.setText(display.getText() + btn7.getText());
			}
		});
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener( e -> {
			if(display.getText().equals("0")) {
				display.setText(btn8.getText());
			} else {
				display.setText(display.getText() + btn8.getText());
			}
		});
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener( e -> {
			if(display.getText().equals("0")) {
				display.setText(btn9.getText());
			} else {
				display.setText(display.getText() + btn9.getText());
			}
		});
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener( e -> {
			op1 = Double.parseDouble(display.getText());
			display.setText("0");
			operator = "+";
		});
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener( e -> {
			op1 = Double.parseDouble(display.getText());
			display.setText("0");
			operator = "-";
		});
		
		JButton btnMult = new JButton("x");
		btnMult.addActionListener( e -> {
			op1 = Double.parseDouble(display.getText());
			display.setText("0");
			operator = "X";
		});
		
		JButton btnDivision = new JButton("÷");
		btnDivision.addActionListener( e -> {
			op1 = Double.parseDouble(display.getText());
			display.setText("0");
			operator = "÷";
		});
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener( e -> {
			op1 = Double.parseDouble(display.getText());
			display.setText("0");
			op1 = (op1+op2) * 0.01;
			display.setText(""+this.op1);
		});
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(e -> {
			if(!display.getText().contains(".")) {
				display.setText(display.getText()+btnDot.getText());
			}
		});
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener( e -> {
			op2 = Double.parseDouble(display.getText());
			double result = HomeWork(op1, op2, operator);
			display.setText("" + result);
		});
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener( e -> {
			op1 = 0;
			op2 = 0;
			display.setText("0");
			status.setText("0");
		});
		
		JButton btnClearEntry = new JButton("CE");
		btnClearEntry.addActionListener( e -> {
			op2 = 0;
			display.setText("0");
		});
		
		JButton btnSign = new JButton("+/-");
		btnSign.addActionListener( e -> {
			op1 = Double.parseDouble(display.getText());
			op1 = op1 * -1;
			display.setText(""+this.op1);
		});
		
		JButton btnRoot = new JButton("2√x");
		btnRoot.addActionListener( e -> {
			op1 = Double.parseDouble(display.getText());
			operator = "2√x";
		});
		
		JButton btnSquare = new JButton("x^2");
		btnSquare.addActionListener( e -> {
			op1 = Double.parseDouble(display.getText());
			operator = "2√x";
		});
		
		JButton btnFraction = new JButton("1/x");
		btnFraction.addActionListener( e -> {
			op1 = Double.parseDouble(display.getText());
			operator = "1/x";
		});
		
		JButton btnDelete = new JButton("←");
		btnDelete.addActionListener( e -> {
			if(0<display.getText().length()-1) {
				display.setText(display.getText().substring(0, display.getText().length() - 1));
			} else {
				display.setText("0");
			}
		});
		
		panel.add(btnPercent);panel.add(btnClearEntry);panel.add(btnClear);panel.add(btnDelete);
		panel.add(btnFraction);panel.add(btnSquare);panel.add(btnRoot);panel.add(btnDivision);
		panel.add(btn7);panel.add(btn8);panel.add(btn9);panel.add(btnMult);
		panel.add(btn4);panel.add(btn5);panel.add(btn6);panel.add(btnMinus);
		panel.add(btn1);panel.add(btn2);panel.add(btn3);panel.add(btnPlus);
		panel.add(btnSign);panel.add(btn0);panel.add(btnDot);panel.add(btnEqual);
		
		JLabel status = new JLabel("계산기");
		this.setLayout(new BorderLayout());
		this.add(BorderLayout.NORTH, display);
		this.add(BorderLayout.CENTER, panel);
		this.add(BorderLayout.SOUTH, status);
	}
	
	private double HomeWork(double op1, double op2, String operator) {
		double result = 0;
		switch(operator) {
		case "+":
			result = op1 + op2;
			break;
		case "-":
			result = op1 - op2;
			break;
		case "X":
			result = op1 * op2;
			break;
		case "÷":
			result = op1 / op2;
			break;
		case "%":
			result = 1 / result;
			result = result * 10;
			break;
		case "2√x":
			result = Math.sqrt(op1);
			break;
		case "x^2":
			result = Math.pow(op1, 2);
			break;
		case "1/x":
			result = 1 / op1;
			break;
		}
		return result;
	}

	public static void main(String[] args) {
		new HomeWork().setVisible(true);

	}

}
