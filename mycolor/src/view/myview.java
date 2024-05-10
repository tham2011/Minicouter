package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controler.mycontroler;
import model.mymodel;

public class myview extends JFrame {

	private static final long serialVersionUID = 1L;
	private mymodel th;
	private JLabel myJL;

	public myview() throws HeadlessException {
		this.setTitle("my color");
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.init();
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void init() {
		myJL = new JLabel("text....");
		Font font = new Font("Arial", Font.BOLD, 100);
		Font font1 = new Font("Arial", Font.BOLD, 40);
		myJL.setFont(font);

		JPanel jpanel = new JPanel(new GridLayout(2, 3));
		mycontroler ac = new mycontroler(this);

		JButton jb = new JButton("red text");
		jb.setFont(font1);
		jb.setForeground(Color.RED);
		jb.addActionListener(ac);
		JButton jb1 = new JButton("yellow text");
		jb1.setFont(font1);
		jb1.setForeground(Color.YELLOW);
		jb1.addActionListener(ac);
		JButton jb2 = new JButton("green text");
		jb2.setFont(font1);
		jb2.setForeground(Color.GREEN);
		jb2.addActionListener(ac);
		JButton jb3 = new JButton("red backgroud");
		jb3.setFont(font1);
		jb3.setBackground(Color.RED);
		jb3.addActionListener(ac);
		JButton jb4 = new JButton("yellow backgroud");
		jb4.setFont(font1);
		jb4.setBackground(Color.YELLOW);
		jb4.addActionListener(ac);
		JButton jb5 = new JButton("green backgroud");
		jb5.setFont(font1);
		jb5.setBackground(Color.GREEN);
		jb5.addActionListener(ac);

		jpanel.add(jb);
		jpanel.add(jb1);
		jpanel.add(jb2);
		jpanel.add(jb3);
		jpanel.add(jb4);
		jpanel.add(jb5);

		/* add vao Jframe */
		this.setLayout(new BorderLayout());
		this.add(myJL, BorderLayout.NORTH);
		this.add(jpanel, BorderLayout.CENTER);

	}

	public void changerText(Color color) {
		this.myJL.setForeground(color);
	}

	public void changerBackgroud(Color color) {
		this.myJL.setBackground(color);
		this.myJL.setOpaque(true);
	}
}
