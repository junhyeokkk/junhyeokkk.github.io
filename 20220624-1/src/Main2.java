import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main2 extends JFrame {
	private JCheckBox box1;
	private JCheckBox box2;
	private JCheckBox box3;

	public Main2() {
		JPanel pnl = new JPanel();
		box1 = new JCheckBox("¥???? : 5000??");
		box2 = new JCheckBox("«?? : 6000??");
		box3 = new JCheckBox("?????? : 12000??");
		JLabel lblPrice = new JLabel("???? ǥ??");
		JButton btnAll = new JButton("??ü ???? ");
		JButton btnCancel = new JButton("????");
		
		
		pnl.add(box1);
		pnl.add(box2);
		pnl.add(box3);
		pnl.add(lblPrice);
		pnl.add(btnAll);
		pnl.add(btnCancel);
		
		add(pnl);
		
		
		ActionListener btnListener = new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				boolean all = e.getSource() == btnAll;
				box1.setSelected(all);
				box2.setSelected(all);
				box3.setSelected(all);
				
			}
		};
		btnAll.addActionListener(btnListener);
		btnCancel.addActionListener(btnListener);
		
		setSize(500,500);
		setDefaultCloseOperation(3);
		
		
		ActionListener actionListener = new ActionListener() {
		@Override
			public void actionPerformed(ActionEvent e) {
				boolean isSel = box1.isSelected();
				lblPrice.setText(isSel ? "???õ?" : "????????");
			}
		};
		box1.addActionListener(actionListener);
		box2.addActionListener(actionListener);
		box3.addActionListener(actionListener);
		
		
		ItemListener itemListener = new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				int sum = sum();
				
				lblPrice.setText(
					String.valueOf(sum));
			}
		};
		box1.addItemListener(itemListener);
		box2.addItemListener(itemListener);
		box3.addItemListener(itemListener);
	
		
	}
	private int sum() {
		int sum=0;
		sum += box1.isSelected() ? 5000 : 0;
		sum += box2.isSelected() ? 6000 : 0;
		sum += box3.isSelected() ? 12000 : 0;
		
		return sum;
	}
	
	public static void main(String args[]) {
		new Main2().setVisible(true);
	}
}