import javax.swing.JFrame;

public class Calc {
	public static void main(String args[]) {
		Readercalc r = new Readercalc("Calculator");
		r.setVisible(true);// Делает окно видимым
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r.setSize(300,300);// Размер окна
		r.setResizable(false);// Запрещает менять размер окна
		r.setLocationRelativeTo(null);// Центрует окно
	}
}

