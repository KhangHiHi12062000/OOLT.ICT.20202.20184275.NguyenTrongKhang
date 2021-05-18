package hust.soict.globalict.swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class LookAndFeelDemo extends JFrame{
	public LookAndFeelDemo() {
		
		addDemoComponents();
		addLookAndFeeComboBox();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 100);
		setVisible(true);
	}
	
	void addDemoComponents() {
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(new JLabel("Label: "));
		cp.add(new JTextField("Text  field"));
		cp.add(new JRadioButton("Radio button"));
		cp.add(new JButton("Button"));
		
	}
	void addLookAndFeeComboBox() {
		Container cp = getContentPane();
		cp.add(new JLabel("Change Look and Feel Here: "));
		
		LookAndFeelInfo[] lafInfos = UIManager.getInstalledLookAndFeels();
		String[] lafNames = new String[lafInfos.length];
		for(int i=0; i<lafInfos.length; i++) {
			lafNames[i] = lafInfos[i].getName();
		}
		JComboBox cbLooAndFeel = new JComboBox(lafNames);
		cp.add(cbLooAndFeel);
		
		JFrame frame = this;
		cbLooAndFeel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int index = cbLooAndFeel.getSelectedIndex();
				try {
					UIManager.setLookAndFeel(lafInfos[index].getClassName());
				} catch (Exception e) {
					e.printStackTrace();
				}
				SwingUtilities.updateComponentTreeUI(frame);
				setTitle(lafInfos[index].getName() + "Look And Feel");
			}
		}
				
				);
	}
}