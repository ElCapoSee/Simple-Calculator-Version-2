import javax.swing.JFrame;

public class Calc {
	public static void main(String args[]) {
		Readercalc r = new Readercalc("Calculator");
		r.setVisible(true);// ������ ���� �������
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r.setSize(300,300);// ������ ����
		r.setResizable(false);// ��������� ������ ������ ����
		r.setLocationRelativeTo(null);// �������� ����
	}
}

