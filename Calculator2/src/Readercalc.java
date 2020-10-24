import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Readercalc extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton b1, b2, b3, b4, b5, c1, c2, c3, c4, c5, c6, c7, c8, c9, c0;
	JLabel  l1, l2, l3, l4;
	ArrayList<Integer> m = new ArrayList<Integer>(2);
	int i, k;
	String a, b;
	eHandler handler = new eHandler();

	public Readercalc (String s) {
		super(s);
		setLayout(new GridLayout(7, 7, 5, 12));
		b1 = new JButton("Очисить");
		b2 = new JButton("+");
		b3 = new JButton("-");
		b4 = new JButton("*");
		b5 = new JButton("/");
		c1 = new JButton("1");
		c2 = new JButton("2");
		c3 = new JButton("3");
		c4 = new JButton("4");
		c5 = new JButton("5");
		c6 = new JButton("6");
		c7 = new JButton("7");
		c8 = new JButton("8");
		c9 = new JButton("9");
		c0 = new JButton("0");
		l1 = new JLabel("");
		l2 = new JLabel("");
		l3 = new JLabel("");
		l4 = new JLabel("");
		add(l4);
		add(l1);
		add(l3);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		add(c5);
		add(c6);
		add(c7);
		add(c8);
		add(c9);
		add(c0);
		add(b1);
		c1.addActionListener(handler);
		c2.addActionListener(handler);
		c3.addActionListener(handler);
		c4.addActionListener(handler);
		c5.addActionListener(handler);
		c6.addActionListener(handler);
		c7.addActionListener(handler);
		c8.addActionListener(handler);
		c9.addActionListener(handler);
		c0.addActionListener(handler);
		b5.addActionListener(handler);
		b4.addActionListener(handler);
		b3.addActionListener(handler);
		b2.addActionListener(handler);
		b1.addActionListener(handler);
	}
	public class eHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==b2) {
				int sum = (int) m.get(0) + (int) m.get(1);
				a = "Ответ: " + sum;
				l3.setText(a);	
			}
			if(e.getSource()==b3) {
				int sum = (int) m.get(0) - (int) m.get(1);
				a = "Ответ: " + sum;
				l3.setText(a);
			}
			if(e.getSource()==b4) {
				int sum = (int) m.get(0) * (int) m.get(1);
				a = "Ответ: " + sum;
				l3.setText(a);
			}
			if(e.getSource()==b5) {
				int sum = (int) m.get(0) / (int) m.get(1);
				a = "Ответ: " + sum;
				l3.setText(a);
			}
			if(e.getSource()==c1) {
				
				m.add(1);
				l4.setText("1");
			}
			if(e.getSource()==c2) {
				
				m.add(2);
				l4.setText("2");
			}
			if(e.getSource()==c3) {
				
				m.add(3);
				l4.setText("3");
			}
			if(e.getSource()==c4) {
				
				m.add(4);
				l4.setText("4");
			}
			if(e.getSource()==c5) {
				
				m.add(5);
				l4.setText("5");
			}
			if(e.getSource()==c6) {
				
				m.add(6);
				l4.setText("6");
			}
			if(e.getSource()==c7) {
				
				m.add(7);
				l4.setText("7");
			}
			if(e.getSource()==c8) {
				
				m.add(8);
				l4.setText("8");
			}
			if(e.getSource()==c9) {
				
				m.add(9);
				l4.setText("9");
			}
			if(e.getSource()==c0) {
				
				m.add(0);
				l4.setText("0");
			}
			
			if(e.getSource()==b1) {
				l3.setText(null);
				l4.setText(null);
				m.clear();
			}
		}
	}
}