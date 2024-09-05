package calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class tela {

	private JFrame frmCalculadora;
	private JTextField txtField;
double numero1;
double numero2;
double resultado;
String operação;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela window = new tela();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setBackground(new Color(128, 0, 255));
		frmCalculadora.getContentPane().setBackground(new Color(0, 0, 0));
		frmCalculadora.setForeground(new Color(0, 0, 0));
		frmCalculadora.getContentPane().setForeground(new Color(192, 192, 192));
		frmCalculadora.setTitle("calculadora");
		frmCalculadora.setBounds(100, 100, 315, 470);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		txtField = new JTextField();
		txtField.setHorizontalAlignment(SwingConstants.RIGHT);
		txtField.setFont(new Font("Arial", Font.BOLD, 20));
		txtField.setBounds(10, 11, 275, 30);
		frmCalculadora.getContentPane().add(txtField);
		txtField.setColumns(10);
		
		JButton btnC = new JButton("c");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText("");
			}
		});
		btnC.setForeground(new Color(128, 0, 255));
		btnC.setFont(new Font("Arial", Font.BOLD, 20));
		btnC.setBounds(225, 52, 60, 48);
		frmCalculadora.getContentPane().add(btnC);
		
		JButton btnsoma = new JButton("+");
		btnsoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1= Double.parseDouble(txtField.getText());
				txtField.setText("");
				operação="+";
			}
		});
		btnsoma.setForeground(new Color(128, 0, 255));
		btnsoma.setFont(new Font("Arial", Font.BOLD, 20));
		btnsoma.setBounds(227, 119, 60, 48);
		frmCalculadora.getContentPane().add(btnsoma);
		
		JButton btnsubtração = new JButton("-");
		btnsubtração.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1= Double.parseDouble(txtField.getText());
				operação="-";
			}
		});
		btnsubtração.setForeground(new Color(128, 0, 255));
		btnsubtração.setFont(new Font("Arial", Font.BOLD, 20));
		btnsubtração.setBounds(225, 194, 60, 48);
		frmCalculadora.getContentPane().add(btnsubtração);
		
		JButton btnmultiplicação = new JButton("X");
		btnmultiplicação.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1= Double.parseDouble(txtField.getText());
				txtField.setText("");
				operação="*";
			}
		});
		btnmultiplicação.setForeground(new Color(128, 0, 255));
		btnmultiplicação.setFont(new Font("Arial", Font.BOLD, 20));
		btnmultiplicação.setBounds(227, 265, 60, 48);
		frmCalculadora.getContentPane().add(btnmultiplicação);
		
		JButton btndivisão = new JButton("/");
		btndivisão.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1= Double.parseDouble(txtField.getText());
				txtField.setText("");
				operação="/";
			}
		});
		btndivisão.setForeground(new Color(128, 0, 255));
		btndivisão.setFont(new Font("Arial", Font.BOLD, 20));
		btndivisão.setBounds(227, 347, 60, 48);
		frmCalculadora.getContentPane().add(btndivisão);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn8.getText());
			}
		});
		btn8.setForeground(new Color(128, 0, 255));
		btn8.setFont(new Font("Arial", Font.BOLD, 20));
		btn8.setBounds(80, 119, 60, 48);
		frmCalculadora.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn9.getText());
			}
		});
		btn9.setForeground(new Color(128, 0, 255));
		btn9.setFont(new Font("Arial", Font.BOLD, 20));
		btn9.setBounds(150, 119, 60, 48);
		frmCalculadora.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn6.getText());
			}
		});
		btn6.setForeground(new Color(128, 0, 255));
		btn6.setFont(new Font("Arial", Font.BOLD, 20));
		btn6.setBounds(150, 194, 60, 48);
		frmCalculadora.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn3.getText());
			}
		});
		btn3.setForeground(new Color(128, 0, 255));
		btn3.setFont(new Font("Arial", Font.BOLD, 20));
		btn3.setBounds(150, 265, 60, 48);
		frmCalculadora.getContentPane().add(btn3);
		
		JButton btnigual = new JButton("=");
		btnigual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero2= Double.parseDouble(txtField.getText());
				if(operação.equals("+")) {
					resultado= numero1+numero2;
					txtField.setText(String.valueOf(resultado));
				}else if (operação.equals("-")) {
					resultado= numero1-numero2;
					txtField.setText(String.valueOf(resultado));
			}else if (operação.equals("*")) {
				resultado= numero1*numero2;
				txtField.setText(String.valueOf(resultado));
				}else if (operação.equals("/")) {
					resultado= numero1/numero2;
					txtField.setText(String.valueOf(resultado));
				}}
		});
		btnigual.setForeground(new Color(128, 0, 255));
		btnigual.setFont(new Font("Arial", Font.BOLD, 20));
		btnigual.setBounds(150, 347, 60, 48);
		frmCalculadora.getContentPane().add(btnigual);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn5.getText());
			}
		});
		btn5.setForeground(new Color(128, 0, 255));
		btn5.setFont(new Font("Arial", Font.BOLD, 20));
		btn5.setBounds(80, 194, 60, 48);
		frmCalculadora.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn2.getText());
			}
		});
		btn2.setForeground(new Color(128, 0, 255));
		btn2.setFont(new Font("Arial", Font.BOLD, 20));
		btn2.setBounds(80, 265, 60, 48);
		frmCalculadora.getContentPane().add(btn2);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn0.getText());
			}
		});
		btn0.setForeground(new Color(128, 0, 255));
		btn0.setFont(new Font("Arial", Font.BOLD, 20));
		btn0.setBounds(80, 347, 60, 48);
		frmCalculadora.getContentPane().add(btn0);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn7.getText());
			}
		});
		btn7.setForeground(new Color(128, 0, 255));
		btn7.setFont(new Font("Arial", Font.BOLD, 20));
		btn7.setBounds(10, 119, 60, 48);
		frmCalculadora.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn4.getText());
			}
		});
		btn4.setForeground(new Color(128, 0, 255));
		btn4.setFont(new Font("Arial", Font.BOLD, 20));
		btn4.setBounds(10, 194, 60, 48);
		frmCalculadora.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn1.getText());
			}
		});
		btn1.setForeground(new Color(128, 0, 255));
		btn1.setFont(new Font("Arial", Font.BOLD, 20));
		btn1.setBounds(10, 265, 60, 48);
		frmCalculadora.getContentPane().add(btn1);
		
		JButton btnponto = new JButton(".");
		btnponto.setForeground(new Color(128, 0, 255));
		btnponto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btnponto.getText());
			}
		});
		btnponto.setFont(new Font("Arial", Font.BOLD, 20));
		btnponto.setBounds(10, 347, 60, 48);
		frmCalculadora.getContentPane().add(btnponto);
	}
}
