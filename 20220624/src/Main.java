import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {
	public Main() {
		JPanel pnl = new JPanel();
		JCheckBox check1 = new JCheckBox("첫번째");
		JCheckBox check2 = new JCheckBox("두번째");
		JCheckBox check3 = new JCheckBox("세번째");
		
		//check1.setSelected(true);
		//System.out.println(check2.isSelected());
		
	//	check1.addActionListener(new ActionListener() {
	//		public void actionPerformed(ActionEvent e) {
	//			System.out.println("사용자가 체크박스를 눌렀음");
	//			System.out.println(check1.isSelected());
	//			
	//		}
	//	});
		check1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				int result = e.getStateChange();
				System.out.println(result);
			}
		});
		
		pnl.add(check1);
		pnl.add(check2);
		pnl.add(check3);
		
		add(pnl);
		
		setSize(500,500);
		setDefaultCloseOperation(3);
	}
	
	public static void main(String args[]) {
		new Main().setVisible(true);
	}
}