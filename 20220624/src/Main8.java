import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.Dimension;

public class Main8 extends JFrame {
   Random ran = new Random();

   private int answer1 = ran.nextInt(40);
   private int answer2 = ran.nextInt(40);
   private int correct = answer1 + answer2;

   public Main8() {
   	setSize(new Dimension(500, 500));

      JPanel pnlTop = new JPanel();
      JPanel pnlBottom = new JPanel();
      JPanel pnlBox = new JPanel();

      GridLayout grid = new GridLayout(2, 2);
      pnlBox.setLayout(grid);
      pnlBox.add(pnlTop);
      pnlBox.add(pnlBottom);

      JTextField tf1 = new JTextField(20);
      JTextField tf2 = new JTextField(10);
      tf2.setBounds(12, 6, 217, 21);
      JButton btn1 = new JButton("제출");
      btn1.setBounds(241, 5, 73, 23);
      JButton btn3 = new JButton("다음 문제");

      btn1.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
//            새로운 창에서 메세지 띄우기
            String text = tf2.getText();
            if (text.equals(String.valueOf(correct))) {
               JOptionPane.showMessageDialog(Main8.this, text + "은 정답입니다.");
            } else {
               JOptionPane.showMessageDialog(Main8.this, text + "은 정답이 아닙니다.");
            }
         }
      });
      
      btn3.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < 10; i++) {
               
                answer1 = ran.nextInt(40);
               answer2 = ran.nextInt(40);
               correct = answer1 + answer2;
               tf1.setText(String.valueOf(answer1) 
                     + " + " + String.valueOf(answer2) + " = ?");
               System.out.println("작동함");
            }
         }
      });
      pnlTop.setLayout(new BoxLayout(pnlTop, BoxLayout.X_AXIS));
      
      pnlTop.add(tf1);
      pnlTop.add(btn3);
      pnlBottom.setLayout(null);

      pnlBottom.add(tf2);
      pnlBottom.add(btn1);

      getContentPane().add(pnlBox);

      pack();
      setDefaultCloseOperation(EXIT_ON_CLOSE);

   }

   public static void main(String[] args) {
      new Main8().setVisible(true);
   }
}