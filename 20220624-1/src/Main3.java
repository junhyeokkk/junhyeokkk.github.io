import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Main3 extends JFrame{
	public Main3() {
		JPanel pnl = new JPanel();
		JRadioButton rdb1 = new JRadioButton("라디오1");
		JRadioButton rdb2 = new JRadioButton("라디오2");
		JRadioButton rdb3 = new JRadioButton("라디오3");
		ButtonGroup group = new ButtonGroup();
		
		group.add(rdb1);
		group.add(rdb2);
		group.add(rdb3);
		
		rdb1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println(e.getStateChange()==ItemEvent.SELECTED);
			}
		});
		JRadioButton rdb4 = new JRadioButton("라디오4");
		JRadioButton rdb5 = new JRadioButton("라디오5");
		
		
		pnl.add(rdb1);
		pnl.add(rdb2);
		pnl.add(rdb3);
		pnl.add(rdb4);
		pnl.add(rdb5);
		
		add(pnl);
		
		setSize(500,500);
		setDefaultCloseOperation(3);
		
		
	}
	public static void main(String args[]) {
		new Main3().setVisible(true);
	}

}
