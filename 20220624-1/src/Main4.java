import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Main4 extends JFrame {
	private JTextField textField_1;
	
	public Main4() {
	JPanel pnl = new JPanel();
	JButton btn1 = new JButton("변환");
	JRadioButton rdb1 = new JRadioButton("cm -> inch");
	JRadioButton rdb2 = new JRadioButton("inch -> cm");
	ButtonGroup group = new ButtonGroup();
	char tmp;
	boolean put = true;
	group.add(rdb1);
	group.add(rdb2);
	
	pnl.add(rdb1);
	pnl.add(rdb2);
	pnl.add(btn1);
	getContentPane().add(pnl, BorderLayout.NORTH);
	
	JPanel pnl1 = new JPanel();
	getContentPane().add(pnl1, BorderLayout.CENTER);
	pnl1.setLayout(null);
	
	textField_1 = new JTextField();
	textField_1.setBounds(86, 127, 100, 30);
	pnl1.add(textField_1);
	textField_1.setColumns(10);
	
	JTextPane textPane = new JTextPane();
	textPane.setText("숫자 입력");
	textPane.setBounds(98, 97, 69, 21);
	pnl1.add(textPane);
	
	JTextPane textPane_1 = new JTextPane();
	textPane_1.setText("결과");
	textPane_1.setBounds(332, 97, 31, 21);
	pnl1.add(textPane_1);
	
	JLabel lbl2 = new JLabel("New label");
	lbl2.setBounds(313, 126, 85, 30);
	pnl1.add(lbl2);
	String answer = textField_1.getText();
	for(int i=0; i<textField_1.getText().length();i++){
		tmp = textField_1.getText().charAt(i);
		if(!('0' <= tmp && tmp<= 99999)) {
			put = false;
		}
	}
	ActionListener btnListener = new ActionListener() {
		@Override 
		public void actionPerformed(ActionEvent e) {
			
			if(rdb1.isSelected()== true) {
				String answer = textField_1.getText();
				double as = Integer.valueOf(answer);
				double aa = as / 2.54;
				lbl2.setText(String.valueOf(String.format("%.2f", aa)));
			}
			else if(rdb2.isSelected()== true) {
				String answer = textField_1.getText();
				double as = Integer.valueOf(answer);
				double aa = as * 2.54;
				lbl2.setText(String.valueOf(String.format("%.2f", aa)));
			}
			else if(put == false) {
				JOptionPane.showMessageDialog(null,"입력값경고","0에서 99999사이의 값만 입력하세요",JOptionPane.WARNING_MESSAGE);
			}
		}
	};
	
	btn1.addActionListener(btnListener);

	
	setSize(500,500);
	setDefaultCloseOperation(3);
	
	}
	
	
	
	public static void main(String args[]) {
		new Main4().setVisible(true);
	}
}
