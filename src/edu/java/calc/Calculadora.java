package edu.java.calc;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora {
	private JFrame janelaCalc;
	private JPanel panMain;
	private JPanel panBotao = new JPanel();
	private JPanel panTela = new JPanel();
	private JTextField txtTela;
	
	public Calculadora () {
		String nomes[] = {"1", "2","3","+","4","5","6","-",
						  "7","8","9","*",".","0","=","/" };
		JButton btnCE = new JButton("CE");
		janelaCalc = new JFrame("Calculadora");
		panMain  = new JPanel ();
		panMain.setLayout( new BorderLayout());
		panBotao = new JPanel();
		panBotao.setLayout( new GridLayout(4,4));
		panTela = new JPanel();
		panMain.add(panTela,  BorderLayout.NORTH);
		panMain.add(panBotao, BorderLayout.CENTER);
		txtTela = new JTextField(15);
		panTela.add(txtTela);
		panTela.add(btnCE);
		for (int i=0; i < 16; i++) { 
			JButton botao = new JButton("" + nomes[i]);
			panBotao.add ( botao );
		}
		
		janelaCalc.setContentPane(panMain);
		janelaCalc.setSize(250,250);
		janelaCalc.setVisible(true);
		janelaCalc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Calculadora();
	}
	
}
