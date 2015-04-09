import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;

/*
 * Created on Oct 6, 2004
 *
 * @author Steve Tanimoto
 */
public class TrafficLight extends JApplet implements ActionListener {
	int phase = 0;
	Container c;
	/**
	 * @throws java.awt.HeadlessException
	 */
	public TrafficLight() throws HeadlessException {
		JButton jb = new JButton("Change!");
		c = this.getContentPane();
		c.setLayout(new BorderLayout());
		c.add(jb, BorderLayout.SOUTH);
		jb.addActionListener(this);
		c.setBackground(Color.green);
	}
	public void actionPerformed(ActionEvent e) {
		phase = (phase + 1) % 3;
		if (phase == 0) {
			c.setBackground(Color.green);
		}
		else if (phase == 1) {
			c.setBackground(Color.yellow);
		}
		else if (phase == 2) {
			c.setBackground(Color.red);
		}
	}
}