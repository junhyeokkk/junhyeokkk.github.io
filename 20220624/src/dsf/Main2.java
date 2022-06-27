package dsf;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main2 extends JFrame {
	public Main2() {
		JPanel pnl = new JPanel();
		JCheckBox box1 = new JCheckBox("Â¥Àå¸é : 5000¿ø");
		JCheckBox box2 = new JCheckBox("Â«»Í : 6000¿ø");
		JCheckBox box3 = new JCheckBox("ÅÁ¼öÀ° : 12000¿ø");
		JLabel lblPrice = new JLabel("°¡°Ý Ç¥½Ã");
		
		pnl.add(box1);
		pnl.add(box2);
		pnl.add(box3);
		pnl.add(lblPrice);
		
		add(pnl);
		
		setSize(500,500);
		setDefaultCloseOperation(3);
		
		
//		box1.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
	//			boolean isSel = box1.isSelected();
//				lblPrice.setText(isSel ? "¼±ÅÃµÊ" : "¼±ÅÃÇØÁ¦");
	//		}
	//	});
		
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
	
	public static void main(String args) {
		new Main2().setVisible(true);
	}
}