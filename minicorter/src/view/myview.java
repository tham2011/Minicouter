package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controler.Mycontroller;
import moden.mymoden;

public class myview extends JFrame {
	private mymoden model;
	private JTextField jt1;
	private JTextField jt2;
	private JTextField jt3;

	public myview() {
		model = new mymoden();
		this.setTitle("Mini couter");
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);

		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void mini() {
		JPanel jpanel = new JPanel(new GridLayout(3, 2, 5, 5));
		Font font = new Font("Arial", Font.BOLD, 30);

		JLabel value1 = new JLabel("value1");
		value1.setFont(font);
		JLabel value2 = new JLabel("value2");
		value2.setFont(font);
		JLabel value3 = new JLabel("ket qua ");
		value3.setFont(font);

		jt1 = new JTextField();
		jt1.setFont(font);
		jt2 = new JTextField();
		jt2.setFont(font);
		jt3 = new JTextField();
		jt3.setFont(font);

		jpanel.add(value1);
		jpanel.add(jt1);
		jpanel.add(value2);
		jpanel.add(jt2);
		jpanel.add(value3);
		jpanel.add(jt3);

		ActionListener ac = new Mycontroller(this);
		JPanel jpbutton = new JPanel(new GridLayout(2, 3));

		JButton cong = new JButton("+");
		cong.setFont(font);
		jpbutton.add(cong);
		cong.addActionListener(ac);
		JButton tru = new JButton("-");
		tru.setFont(font);
		jpbutton.add(tru);
		tru.addActionListener(ac);
		JButton nhan = new JButton("*");
		nhan.setFont(font);
		jpbutton.add(nhan);
		nhan.addActionListener(ac);
		JButton chia = new JButton("/");
		chia.setFont(font);
		jpbutton.add(chia);
		chia.addActionListener(ac);
		JButton mu = new JButton("^");
		mu.setFont(font);
		jpbutton.add(mu);
		mu.addActionListener(ac);
		JButton chiadu = new JButton("%");
		chiadu.setFont(font);
		jpbutton.add(chiadu);
		chiadu.addActionListener(ac);

		this.setLayout(new BorderLayout());
		this.add(jpanel, BorderLayout.CENTER);
		this.add(jpbutton, BorderLayout.SOUTH);

		this.setVisible(true);
	}

	public void Cong() {
		double giatri1 = Double.valueOf(jt1.getText());
		double giatri2 = Double.valueOf(jt2.getText());
		this.model.setValue1(giatri1);
		this.model.setValue2(giatri2);
		this.model.cong();
		this.jt3.setText(this.model.getAnsew() + "");
	}

	public void Tru() {
		double giatri1 = Double.valueOf(jt1.getText());
		double giatri2 = Double.valueOf(jt2.getText());
		this.model.setValue1(giatri1);
		this.model.setValue2(giatri2);
		this.model.tru();
		this.jt3.setText(this.model.getAnsew() + "");
	}

	public void Nhan() {
		double giatri1 = Double.valueOf(jt1.getText());
		double giatri2 = Double.valueOf(jt2.getText());
		this.model.setValue1(giatri1);
		this.model.setValue2(giatri2);
		this.model.nhan();
		this.jt3.setText(this.model.getAnsew() + "");
	}

	public void Chia() {
		double giatri1 = Double.valueOf(jt1.getText());
		double giatri2 = Double.valueOf(jt2.getText());
		this.model.setValue1(giatri1);
		this.model.setValue2(giatri2);
		this.model.chia();
		this.jt3.setText(this.model.getAnsew() + "");
	}

	public void Mu() {
		double giatri1 = Double.valueOf(jt1.getText());
		double giatri2 = Double.valueOf(jt2.getText());
		this.model.setValue1(giatri1);
		this.model.setValue2(giatri2);
		this.model.mu();
		this.jt3.setText(this.model.getAnsew() + "");
	}

	public void Chiadu() {
		double giatri1 = Double.valueOf(jt1.getText());
		double giatri2 = Double.valueOf(jt2.getText());
		this.model.setValue1(giatri1);
		this.model.setValue2(giatri2);
		this.model.chiadu();
		this.jt3.setText(this.model.getAnsew() + "");
	}
}
